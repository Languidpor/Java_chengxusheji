package edu.yz.demo07;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class CrashBallPanel extends JPanel implements Runnable {
//	小球类数组
	private Ball [] allBalls;
//	小球颜色的数组
	private Color [] colors;
//	随机数
	private Random ran;
	
//	构造方法中完成属性初始化
	public CrashBallPanel() {
		colors = new Color[2];
		colors[0] = Color.PINK;
		colors[1] = Color.YELLOW;
		/*
		 * 	小球初始化（两种方法：new Ball()-set或者new Ball(参数)）：
		 * 	1、小球数组的初始化，
		 * 	2、然后通过循环创建两个小球对象，半径r一致为20
		 * 	3、分别为两个小球对象设置随机初始x\y坐标
		 * 	4、颜色从颜色数组中按顺序取出并赋值
		 * 	5、初始的运动方向：0 | 1
		 * 	6、小球的运动速度：两个小球的运动速度不相同，在5-55毫秒之间
		 * 	7、小球所在的画布：this
		 */	
		allBalls = new Ball[2];
		ran = new Random();
		for (int i = 0; i < allBalls.length; i++) {
//			方式一：无参构造
			Ball ball = new Ball();
			ball.setR(50);
			ball.setX(ran.nextInt(1024 - 2*ball.getR()));
			ball.setY(ran.nextInt(768 - 2*ball.getR()));
			ball.setColor(colors[i]);
//			在0-100之内随机生成数字取余2，结果只有0或1
			ball.setOrientation(ran.nextInt(100) % 2);
//			设置小球在运动中重画的速度：传给Thread.sleep(speed);
			ball.setSpeed(ran.nextInt(1)+5);
			ball.setPanel(this);
//			方式二：有参构造
			Ball ball2 = 
					new Ball(20,ran.nextInt(1024 - 2*ball.getR()),
					ran.nextInt(768 - 2*ball.getR()),colors[i],ran.nextInt(100) % 2,
					ran.nextInt(55),this);
//			将生成的小球对象存储到小球数组中
			allBalls[i] = ball;
		}
	}
//	绘制两个小球
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		this.setBackground(Color.DARK_GRAY);
		for (int i = 0; i < allBalls.length; i++) {
			allBalls[i].draw(g);
		}
	}
//	让两个小球以不同的速度开始运动
	@Override
	public void run() {
		while (true) {
			for (int i = 0; i < allBalls.length; i++) {
				allBalls[i].move();
				try {
					Thread.sleep(allBalls[i].getSpeed());
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
//				调用判断两个球相撞的方法
				boolean isHit = twoBallsHit(allBalls[0],allBalls[1]);
				if(isHit) {
//					碰撞之后将一个小球的半径变为0，另一个小球的半径加10(或者另一个小球的半径)
					allBalls[1].setR(allBalls[1].getR()+allBalls[0].getR());
					allBalls[0].setR(0);
					allBalls[0].setX(0);
					allBalls[0].setY(0);
				}
			}
			repaint();
		}
	}
//	判断两个小球是否碰撞：true表示碰撞、false表示未碰撞
	public boolean twoBallsHit(Ball ballOne,Ball ballTwo) {
//		定义一个标记位：未相撞
		boolean isHit = false;
		int bxot = ballOne.getX() - ballTwo.getX();
		int byot = ballOne.getY() - ballTwo.getY();
		int rot = ballOne.getR() + ballTwo.getR();
//		判断小球碰撞
		double z = Math.sqrt(bxot*bxot+byot*byot);
		if(z <= rot) {
			isHit = true;//此时小球相撞
		}		
		return isHit;
	}	
}
