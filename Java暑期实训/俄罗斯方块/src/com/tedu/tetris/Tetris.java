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
	/**游戏的当前状态，RUNNING  PAUSE  GAME_OVER*/
	private int state;
	public static final int RUNNING = 0;
	public static final int PAUSE = 1;
	public static final int GAME_OVER = 2;
	private int score;//分数
	private int lines;//销毁的行数
	private Cell[][] wall = new Cell[ROWS][COLS];//背景墙
	private Tetromino tetromino;//正在下落的四格方块
	private Tetromino nextOne;//下一个四格方块
	
	private int speed;//速度
	private int level;//游戏难度
	private int index;//下落计数器，当index%speed==0时候下落一次	
	
	public static final int ROWS=20;//背景墙的行数
	public static final int COLS=10;//背景墙的列数
	/**背景图片*/
	private static Image bkImg;
	public static Image T;
	public static Image I;
	public static Image S;
	public static Image Z;
	public static Image O;
	public static Image L;
	public static Image J;
	/**状态图片*/
	private static Image gameOver;
	private static Image pause;	
	/**静态代码块*/
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
		g.drawImage(bkImg, 0,0,null);//绘制背景图片
		g.translate(15, 15);
		//绘制背景墙
		paintWall(g);
		//绘制正在下落的四格方块
		paintTetromino(g);
		//绘制一下一个要落下的四格方块
		paintNextOne(g);
		//绘制分数
		paintScore(g);
		//绘制游戏状态
		paintState(g);
	}
	public static final int CELL_SIZE=26;
	/**绘制背景墙*/
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
	/**绘制正在下落的四格方块*/
	private void paintTetromino(Graphics g){
		if(tetromino==null){
			return ;
		}
		//将每个格子的row和col换算成x，y，然后贴图
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int x = cell.getCol()*CELL_SIZE;
			int y = cell.getRow()*CELL_SIZE;
			g.drawImage(cell.getImage(),x-1,y-1,null);
		}
	}
	/**绘制下一个要下落的方块*/
	private void paintNextOne(Graphics g){
		if(nextOne==null){
			return ;
		}
		//将每个格子的row和col换算成x，y，然后贴图
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
	/**绘制分数*/
	private void paintScore(Graphics g){
		int x=290;
		int y=160;
		g.setColor(new Color(FONT_COLOR));
		Font font = g.getFont();//获取当前字体
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
	/**绘制游戏状态*/
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
	/**Tetris添加action方法启动游戏*/
	public void action(){
		//初始化tetromino
		tetromino = Tetromino.randomOne();
		//初始化nextOne
		nextOne = Tetromino.randomOne();
		//初始化游戏状态
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
	
	//程序的启动入口
	public static void main(String[] args) {
		JFrame frame = new JFrame();//创建窗体
		Tetris tetris = new Tetris();//创建面板
		tetris.action();//启动游戏
		frame.addKeyListener(tetris);//键盘监听事件的注册
		frame.add(tetris);//添加面板
		frame.setSize(530,580);//设置窗体大小
		frame.setLocationRelativeTo(null);//设置窗体位置
		//设置窗体关闭时，后台程序随之关闭
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);//设置窗体可见
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
		repaint();//重绘,才会重新以新的坐标划出相关内容
	}
	/**暂停状态控制*/
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
	/**运行状态控制*/
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
	/**结束状态控制*/
	private void processGameoverKey(int key){
		switch(key){
		case KeyEvent.VK_Q:
			System.exit(0);
		case KeyEvent.VK_S:
			/**重新开始游戏*/
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
	/**检查正在下落的方块是否越界*/
	public boolean outOfBounds(){
		/**检查每个方块的每个小个子的col是否<0或者>=10*/
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
	/**检查正在下落的方块是否与背景墙的砖块重合*/
	public boolean coincide(){
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			int col = cell.getCol();
			//如果墙上的row，col位置上有格子，就重叠了
			if(row>=0&&row<ROWS&&col>=0&&col<COLS&&wall[row][col]!=null){
				return true;
			}
		}
		return false;
	}
	/**左移流程控制*/
	public void moveLeftAction(){
		tetromino.moveLeft();
		if(outOfBounds()||coincide()){
			tetromino.moveRight();
		}
	}
	/**右移流程控制*/
	public void moveRightAction(){
		tetromino.moveRight();
		if(outOfBounds()||coincide()){
			tetromino.moveLeft();			
		}
	}
	/**下落流程控制*/
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
	/**旋转流程控制*/
	public void rotateRightAction(){
		tetromino.rotateRight();
		if(outOfBounds()||coincide()){
			tetromino.rotateLeft();			
		}
	}
	/**得分的等级*/
	private static int[] socreTable = {0,1,10,50,100};
	/**销毁某一行(多行)，并计算得分*/
	private void destoryLines(){
		int lines = 0;//每一次销毁的行数，最多为4行
		for(int row=0;row<wall.length;row++){
			if(fullCells(row)){
				deleteRow(row);
				lines++;
			}
		}
		this.score += socreTable[lines];
		this.lines += lines;
	}
	/**检查当前的方块能否继续下落*/
	private boolean canDrop(){
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			int col = cell.getCol();
			//落到了最后一行了
			if(row==ROWS-1){
				return false;
			}
			//当前某一个格子下方的墙上有方块
			if(row+1>=0&&row+1<ROWS&&col>=0&&col<COLS&&wall[row+1][col]!=null){
				return false;
			}			
		}
		return true;
	}
	/**将方块的所有格子固定在墙上*/
	private void landIntoWall(){
		Cell[] cells = tetromino.cells;
		for (int i = 0; i < cells.length; i++) {
			Cell cell = cells[i];
			int row = cell.getRow();
			int col = cell.getCol();
			wall[row][col]=cell;
		}
	}
	/**检查当前行的每一个格子，是否满行*/
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
	/**删除（销毁）某一行,并依次将上面的所有行往下复制，第一行全部置为null*/
	private void deleteRow(int row){
		for(int i=row;i>=1;i--){
			System.arraycopy(wall[i-1], 0, wall[i], 0, COLS);
		}		
		Arrays.fill(wall[0], null);		
	}
	/**硬下落*/
	public void hardDropAction(){
		while(canDrop()){
			tetromino.softDrop();
		}
		landIntoWall();
		destoryLines();
		tetromino=nextOne;
		nextOne=Tetromino.randomOne();
	}
	/**检查游戏是否结束*/
	private boolean isGameOver(){
		//如果下一个方块没有出场位置了，就结束游戏
		//下一个出场的方块的每某一个格子行列对应的墙上位置有格子
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
