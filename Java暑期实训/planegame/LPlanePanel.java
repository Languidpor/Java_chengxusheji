package planegame;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.util.Random;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LPlanePanel extends JPanel implements MouseMotionListener, MouseListener, Runnable {

	// ս��
	private HeroPlane heroplane = new HeroPlane();
	private Boss boss = new Boss();
	private Vector<enemy> bossbullets;
	// �ӵ�����
	private Vector<enemy> bullets;
	// �л�����
	private Vector<enemy> enemyPlanes;
	// ��ը����
	private Vector<enemy> bombEPlanes;
	// ����л�����������
	private static final int EPCOUNT = 15;
	// �����ʶ
	private boolean isFire;
	// ���屳��ͼƬ
	public static Image back = new ImageIcon("E:\\bg4.jpg").getImage();

	public LPlanePanel() {
		heroplane.setX(500);
		heroplane.setY(700);
		heroplane.setSize(50);
		heroplane.setPanel(this);
		heroplane.setBlood(HeroPlane.ALL_BLOOD);
		heroplane.setScore(0);

		boss = new Boss(300, 50, 100, 1000, 1, this);

		bullets = new Vector<enemy>();
		enemyPlanes = new Vector<enemy>();
		bombEPlanes = new Vector<enemy>();
		bossbullets = new Vector<enemy>();
		// ��л����������ÿ���л�
		for (int i = 0; i < EPCOUNT; i++) {
			enemy ep = new enemy();

			if (i % 4 == 0) {
				ep.setType("EP1");
			} else if (i % 4 == 1) {
				ep.setType("EP2");
			} else if (i % 4 == 2) {
				ep.setType("EP3");
			} else if (i % 4 == 3) {
				ep.setType("EP4");
			}

			ep.setAtt(enemy.DOWN);
			ep.setX(new Random().nextInt(1024));
			ep.setY(-(new Random().nextInt(768)));
			ep.setSize(30);
			ep.setPanel(this);
			enemyPlanes.add(ep);

		}
		isFire = false;

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.drawImage(back, 0, 0, this.getWidth(), this.getHeight(), this);
		heroplane.draw(g);
		// �����������ս���ӵ�
		for (int i = 0; i < bullets.size(); i++) {
			enemy bullet = bullets.elementAt(i);
			bullet.draw(g);
		}
		// �������Ƶл�
		for (int i = 0; i < enemyPlanes.size(); i++) {
			enemy enemy = enemyPlanes.elementAt(i);
			enemy.draw(g);
		}
		// �������Ʊ�ը�л�
		for (int i = 0; i < bombEPlanes.size(); i++) {
			enemy bomb = bombEPlanes.elementAt(i);
			bomb.draw(g);
			if (i > 0) {
				bombEPlanes.remove(i - 1);
			}
			// ��������boss�ӵ�
			for (int j = 0; j < bossbullets.size(); j++) {
				enemy bbullet = bossbullets.elementAt(j);
				bbullet.draw(g);
			}
			// ����boss����
			if (heroplane.getScore() >= 100) {
				boss.draw(g);
			}

			// �ж�boss�ƶ�����
			if (boss.getX() > 1030) {
				boss.setFX(Boss.LEFT);
			} else if (boss.getX() < -100) {
				boss.setFX(Boss.RIGHT);
			}
			// �ж���Ϸ���������Ӯ
			if (heroplane.getBlood() <= 0) {
				g.setColor(Color.WHITE);
				g.fillRect(350, 300, 300, 100);
				g.setColor(Color.black);
				Font font = new Font("����", Font.BOLD, 50);
				g.setFont(font);
				g.drawString("��Ϸ����", 390, 365);
			}

			else if (boss.getBlood() <= 0) {
				g.setColor(Color.WHITE);
				g.fillRect(350, 300, 300, 100);
				g.setColor(Color.black);
				Font font1 = new Font("����", Font.BOLD, 50);
				g.setFont(font1);
				g.drawString("��Ӯ�ˣ�", 390, 365);
			}

		}
	}

	@Override
	public void run() {
		int count = 0;
		while (true) {
			// ���濪������ҷ��ӵ��Ĵ���
			if (isFire && count % 30 == 0) {
				enemy bullet = new enemy();
				bullet.setType("HB");
				bullet.setSize(10);
				bullet.setX(heroplane.getX() + heroplane.getSize() - bullet.getSize());
				bullet.setY(heroplane.getY());
				bullet.setAtt(enemy.UP);
				bullet.setPanel(this);
				bullets.add(bullet);
			}
			// ���䣬�����߼ʺ��Ƴ�
			for (int i = 0; i < bullets.size(); i++) {
				enemy fb = bullets.get(i);
				if (fb.getY() <= 0) {
					bullets.remove(i);
				}
				// ���䣺�˶�
				fb.move();
			}
			// �����л�������
			for (int i = 0; i < enemyPlanes.size(); i++) {
				enemy ePlane = enemyPlanes.get(i);
				ePlane.move();
			}
			// �����л����ӵ����ж��Ƿ���в���ը
			for (int i = 0; i < enemyPlanes.size(); i++) {
				enemy ePlane = enemyPlanes.get(i);
				boolean flag = false;
				for (int j = 0; j < bullets.size(); j++) {
					enemy bullet = bullets.get(j);
					if (isHit(ePlane, bullet)) {
						bullets.remove(j);
						enemy bomb = new enemy();
						bomb.setType("BB");
						bomb.setSize(ePlane.getSize());
						bomb.setX(ePlane.getX());
						bomb.setY(ePlane.getY());
						bombEPlanes.add(bomb);
						flag = true;
						break;

					}
				}
				// �л����ӵ���ײ���л�����
				if (flag) {
					ePlane.setY(-ePlane.getY());
					heroplane.setOneScore(10);
					heroplane.setScore(heroplane.getScore() + heroplane.getOneScore());
				} else {
					ePlane.setY(ePlane.getY() + 1);
				}
			}
			// �������ел����жϵл����һ��Ƿ���ײ������ʱ������˺�
			for (int i = 0; i < enemyPlanes.size(); i++) {
				enemy ePlane = enemyPlanes.get(i);

				if (isCrash(ePlane, heroplane)) {
					ePlane.setNum(1);
					heroplane.setBlood(heroplane.getBlood() - ePlane.getNum());
				}
				// �н��֮������
				if (heroplane.getBlood() <= 0 | boss.getBlood() <= 0) {
					ePlane.setY(-200);
					heroplane.setY(-300);
					boss.setY(5000);
				}
			}

			// ����boss�ӵ������ж����һ��Ƿ���ײ��������˺�
			for (int i = 0; i < bossbullets.size(); i++) {
				enemy bbullet = bossbullets.get(i);
				if (isCrash(bbullet, heroplane)) {
					bossbullets.remove(i);
					bbullet.setNum(10);
					heroplane.setBlood(heroplane.getBlood() - bbullet.getNum());
				}
			}
			// �����һ��ӵ����ж��Ƿ���boss��ײ��������˺�
			for (int i = 0; i < bullets.size(); i++) {
				enemy fb = bullets.get(i);
				if (isP(boss, fb)) {
					bullets.remove(i);
					fb.setNum(50);
					boss.setBlood(boss.getBlood() - fb.getNum());
				}

			}
			count++;

			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			repaint();
			// ��boss���ɺ�boss��ʼ�ƶ�
			if (heroplane.getScore() >= 100) {
				boss.move();
				// boss���ɵ�����£���������
				if (heroplane.getScore() >= 20 && count % 100 == 0) {
					// boss������ӵ���ʽ
					enemy bossbullet = new enemy();
					bossbullet.setType("B");
					bossbullet.setSize(20);
					bossbullet.setX(boss.getX() + boss.getSize() - bossbullet.getSize());
					bossbullet.setY(boss.getY());
					bossbullet.setAtt(enemy.DOWN);
					bossbullet.setPanel(this);
					bossbullets.add(bossbullet);
				}
				// ����boss�ӵ��������߽��Ƴ�
				for (int i = 0; i < bossbullets.size(); i++) {
					enemy bb = bossbullets.get(i);
					if (bb.getY() >= 768) {
						bossbullets.remove(i);
					}
					// ���䣺�˶�
					bb.move();
				}
			}
		}

	}

	// �жϵл����ҷ��ӵ��Ƿ���ײ
	public boolean isHit(enemy fight, enemy bullet) {
		boolean isHit = false;
		int fx = fight.getX() + fight.getSize();
		int fy = fight.getY() + fight.getSize();
		if (fx > bullet.getX() - 15 && fx < bullet.getX() + bullet.getSize() + 15 && fy > bullet.getY() - 15
				&& fy < bullet.getY() + bullet.getSize() + 15) {
			isHit = true;
		}
		return isHit;
	}

	// �жϵл����һ��Ƿ���ײ
	public boolean isCrash(enemy fight, HeroPlane plane) {
		boolean isCrash = false;
		int fx = fight.getX() + fight.getSize();
		int fy = fight.getY() + fight.getSize();
		if (fx > plane.getX() - 10 && fx < plane.getX() + plane.getSize() + 10 && fy > plane.getY() - 10
				&& fy < plane.getY() + plane.getSize() + 10) {
			isCrash = true;
		}
		return isCrash;
	}

	// �ж�boss���ҷ��ӵ��Ƿ���ײ
	public boolean isP(Boss boss, enemy bullet) {
		boolean isP = false;
		int fx = boss.getX() + boss.getSize();
		int fy = boss.getY() + boss.getSize();
		if (fx > bullet.getX() - 30 && fx < bullet.getX() + bullet.getSize() + 30 && fy > bullet.getY() - 30
				&& fy < bullet.getY() + bullet.getSize() + 30) {
			isP = true;
		}
		return isP;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		isFire = true;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		isFire = true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		isFire = false;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// ��ս������������Ϊ��������ս����һ��
		isFire = true;
		heroplane.setX(e.getX() - heroplane.getSize() / 2);
		heroplane.setY(e.getY() - heroplane.getSize() / 2);

		repaint();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		isFire = false;
		heroplane.setX(e.getX() - heroplane.getSize() / 2);
		heroplane.setY(e.getY() - heroplane.getSize() / 2);

		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
}
