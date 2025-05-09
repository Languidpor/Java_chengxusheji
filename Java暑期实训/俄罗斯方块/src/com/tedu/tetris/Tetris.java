package com.tedu.tetris;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tetris extends JPanel implements KeyListener{
	/**��Ϸ�ĵ�ǰ״̬��RUNNING  PAUSE  GAME_OVER*/
	private int state;
	public static final int RUNNING = 0;
	public static final int PAUSE = 1;
	public static final int GAME_OVER = 2;
	private int score;//����
	private int lines;//���ٵ�����
	private Cell[][] wall = new Cell[ROWS][COLS];//����ǽ
	private Tetromino tetromino;//����������ĸ񷽿�
	private Tetromino nextOne;//��һ���ĸ񷽿�
	
	private int speed;//�ٶ�
	private int level;//��Ϸ�Ѷ�
	private int index;//�������������index%speed==0ʱ������һ��	
	
	public static final int ROWS=20;//����ǽ������
	public static final int COLS=10;//����ǽ������
	/**����ͼƬ*/
	private static Image bkImg;
	public static Image T;
	public static Image I;
	public static Image S;
	public static Image Z;
	public static Image O;
	public static Image L;
	public static Image J;
	/**״̬ͼƬ*/
	private static Image gameOver;
	private static Image pause;	
	/**��̬�����*/
	static{
		bkImg = new ImageIcon("image/tetris.png").getImage();
		T = new ImageIcon("image/T.png").getImage();
		I = new ImageIcon("image/I.png").getImage();
		S = new ImageIcon("image/S.png").getImage();
		Z = new ImageIcon("image/Z.png").getImage();
		O = new ImageIcon("image/O.png").getImage();
		L = new ImageIcon("image/L.png").getImage();
		J = new ImageIcon("image/J.png").getImage();
		gameOver = new ImageIcon("image/game-over.png").getImage();
		pause = new ImageIcon("image/pause.png").getImage();
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(bkImg, 0,0,null);//���Ʊ���ͼƬ
		g.translate(15, 15);
		//���Ʊ���ǽ
		paintWall(g);
		//��������������ĸ񷽿�
		paintTetromino(g);
		//����һ��һ��Ҫ���µ��ĸ񷽿�
		paintNextOne(g);
		//���Ʒ���
		paintScore(g);
		//������Ϸ״̬
		paintState(g);
	}
	public static final int CELL_SIZE=26;
	/**���Ʊ���ǽ*/
	private void paintWall(Graphics g){
		for (int row = 0; row < wall.length; row++) {
			for (int col = 0; col < wall[row].length; col++) {
				Cell cell = wall[row][col];
				int x = col*CELL_SIZE;
				int y = row*CELL_SIZE;
				if(cell==null){
					g.drawRect(x, y, CELL_SIZE, CELL_SIZE);
				}
				else{
					g.drawImage(cell.getImage(),x-1,y-1,null);
				}
			}
		}
	}
	/**��������������ĸ񷽿�*/
	private void paintTetromino(Graphics g){
		if(tetromino==null){
			return ;
		}
		//��ÿ�����ӵ�row��col�����x��y��Ȼ����ͼ
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int x = cell.getCol()*CELL_SIZE;
			int y = cell.getRow()*CELL_SIZE;
			g.drawImage(cell.getImage(),x-1,y-1,null);
		}
	}
	/**������һ��Ҫ����ķ���*/
	private void paintNextOne(Graphics g){
		if(nextOne==null){
			return ;
		}
		//��ÿ�����ӵ�row��col�����x��y��Ȼ����ͼ
		Cell[] cells = nextOne.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int x = (cell.getCol()+10)*CELL_SIZE;
			int y = (cell.getRow()+1)*CELL_SIZE;
			g.drawImage(cell.getImage(),x,y,null);
		}		
	}
	public static final int FONT_COLOR = 0x667799;
	public static final int FONT_SIZE = 30;
	/**���Ʒ���*/
	private void paintScore(Graphics g){
		int x=290;
		int y=160;
		g.setColor(new Color(FONT_COLOR));
		Font font = g.getFont();//��ȡ��ǰ����
		g.setFont(new Font(font.getName(),font.getStyle(),FONT_SIZE));
		String str = "SCORE:"+score;
		g.drawString(str, x, y);
		y+=56;
		str = "LINES:"+lines;
		g.drawString(str, x, y);
		str = "LEVEL:"+level;
		y+=56;
		g.drawString(str, x, y);
	}
	/**������Ϸ״̬*/
	private void paintState(Graphics g){
		switch(state){
		case PAUSE:
			g.drawImage(pause, -15, -15, null);
			break;
		case GAME_OVER:
			g.drawImage(gameOver, -15, -15, null);
			break;
		}
	}
	/**Tetris���action����������Ϸ*/
	public void action(){
		//��ʼ��tetromino
		tetromino = Tetromino.randomOne();
		//��ʼ��nextOne
		nextOne = Tetromino.randomOne();
		//��ʼ����Ϸ״̬
		state = RUNNING;
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				speed = 40-(lines/100);
				speed = speed<1?1:speed;
				level = 41-speed;
				if(state==RUNNING && index%speed==0){
					softDropAction();
				}			
				index++;
				repaint();
			}
		},10,10);
	}
	
	//������������
	public static void main(String[] args) {
		JFrame frame = new JFrame();//��������
		Tetris tetris = new Tetris();//�������
		tetris.action();//������Ϸ
		frame.addKeyListener(tetris);//���̼����¼���ע��
		frame.add(tetris);//������
		frame.setSize(530,580);//���ô����С
		frame.setLocationRelativeTo(null);//���ô���λ��
		//���ô���ر�ʱ����̨������֮�ر�
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//���ô���ɼ�
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		switch(state){
		case GAME_OVER:
			processGameoverKey(key);
			break;
		case PAUSE:
			processPauseKey(key);
			break;
		case RUNNING:
			processRunningKey(key);
			break;		
		}
		repaint();//�ػ�,�Ż��������µ����껮���������
	}
	/**��ͣ״̬����*/
	private void processPauseKey(int key){
		switch(key){
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		case KeyEvent.VK_C:
			index=0;
			state = RUNNING;
			break;
		}
	}
	/**����״̬����*/
	private void processRunningKey(int key){
		switch(key){
		case KeyEvent.VK_Q:
			System.exit(0);
			break;
		case KeyEvent.VK_P:
			state = PAUSE;
			break;
		case KeyEvent.VK_DOWN:
			softDropAction();
			break;
		case KeyEvent.VK_LEFT:
			moveLeftAction();
			break;
		case KeyEvent.VK_RIGHT:
			moveRightAction();
			break;
		case KeyEvent.VK_SPACE:
			hardDropAction();
			break;
		case KeyEvent.VK_UP:
			rotateRightAction();
			break;
		}
	}
	/**����״̬����*/
	private void processGameoverKey(int key){
		switch(key){
		case KeyEvent.VK_Q:
			System.exit(0);
		case KeyEvent.VK_S:
			/**���¿�ʼ��Ϸ*/
			lines=0;
			score=0;
			wall = new Cell[ROWS][COLS];
			tetromino = Tetromino.randomOne();
			nextOne = Tetromino.randomOne();
			state = RUNNING;
			index=0;
			break;
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	/**�����������ķ����Ƿ�Խ��*/
	public boolean outOfBounds(){
		/**���ÿ�������ÿ��С���ӵ�col�Ƿ�<0����>=10*/
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int col = cell.getCol();
			if(col<0||col>=COLS){
				return true;
			}
		}
		return false;
	}
	/**�����������ķ����Ƿ��뱳��ǽ��ש���غ�*/
	public boolean coincide(){
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			int col = cell.getCol();
			//���ǽ�ϵ�row��colλ�����и��ӣ����ص���
			if(row>=0&&row<ROWS&&col>=0&&col<COLS&&wall[row][col]!=null){
				return true;
			}
		}
		return false;
	}
	/**�������̿���*/
	public void moveLeftAction(){
		tetromino.moveLeft();
		if(outOfBounds()||coincide()){
			tetromino.moveRight();
		}
	}
	/**�������̿���*/
	public void moveRightAction(){
		tetromino.moveRight();
		if(outOfBounds()||coincide()){
			tetromino.moveLeft();			
		}
	}
	/**�������̿���*/
	public void softDropAction(){
		if(canDrop()){
			tetromino.softDrop();
		}else{
			landIntoWall();
			destoryLines();
			if(isGameOver()){
				state = GAME_OVER;
			}else{
				tetromino = nextOne;
				nextOne = Tetromino.randomOne();
			}			
		}		
	}
	/**��ת���̿���*/
	public void rotateRightAction(){
		tetromino.rotateRight();
		if(outOfBounds()||coincide()){
			tetromino.rotateLeft();			
		}
	}
	/**�÷ֵĵȼ�*/
	private static int[] socreTable = {0,1,10,50,100};
	/**����ĳһ��(����)��������÷�*/
	private void destoryLines(){
		int lines = 0;//ÿһ�����ٵ����������Ϊ4��
		for(int row=0;row<wall.length;row++){
			if(fullCells(row)){
				deleteRow(row);
				lines++;
			}
		}
		this.score += socreTable[lines];
		this.lines += lines;
	}
	/**��鵱ǰ�ķ����ܷ��������*/
	private boolean canDrop(){
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			int col = cell.getCol();
			//�䵽�����һ����
			if(row==ROWS-1){
				return false;
			}
			//��ǰĳһ�������·���ǽ���з���
			if(row+1>=0&&row+1<ROWS&&col>=0&&col<COLS&&wall[row+1][col]!=null){
				return false;
			}			
		}
		return true;
	}
	/**����������и��ӹ̶���ǽ��*/
	private void landIntoWall(){
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			int col = cell.getCol();
			wall[row][col]=cell;
		}
	}
	/**��鵱ǰ�е�ÿһ�����ӣ��Ƿ�����*/
	private boolean fullCells(int row){
		Cell[] line = wall[row];
		for (int i = 0; i < line.length; i++) {
			Cell cell = line[i];
			if(cell==null){
				return false;
			}
		}
		return true;
	}
	/**ɾ�������٣�ĳһ��,�����ν���������������¸��ƣ���һ��ȫ����Ϊnull*/
	private void deleteRow(int row){
		for(int i=row;i>=1;i--){
			System.arraycopy(wall[i-1], 0, wall[i], 0, COLS);
		}		
		Arrays.fill(wall[0], null);		
	}
	/**Ӳ����*/
	public void hardDropAction(){
		while(canDrop()){
			tetromino.softDrop();
		}
		landIntoWall();
		destoryLines();
		tetromino=nextOne;
		nextOne=Tetromino.randomOne();
	}
	/**�����Ϸ�Ƿ����*/
	private boolean isGameOver(){
		//�����һ������û�г���λ���ˣ��ͽ�����Ϸ
		//��һ�������ķ����ÿĳһ���������ж�Ӧ��ǽ��λ���и���
		Cell[] cells = nextOne.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			int col = cell.getCol();
			if(wall[row][col]!=null){
				return true;
			}
		}
		return false;
	}
	
	
	
	
	
	
	
}
