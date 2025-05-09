package planegame;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;

public class LPlaneFrame extends JFrame {
	public static void main(String[] args) {
		LPlaneFrame frame = new LPlaneFrame();
		frame.setSize(1024,768);
		frame.setTitle("飞机大战");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		LPlanePanel panel = new LPlanePanel();
		frame.add(panel);
		frame.addMouseMotionListener(panel);
		frame.addMouseListener(panel);
		Thread t = new Thread(panel);
		t.start();
		playMusic();}
		static void playMusic(){//背景音乐播放

			try {
			URL cb;

			File f = new File("E:\\bg1.wav"); // 引号里面的是音乐文件所在的路径

			cb = f.toURL();

			AudioClip aau;

			aau = Applet.newAudioClip(cb);

			aau.play();

			aau.loop();//循环播放


			// 循环播放 aau.play()

			//单曲 aau.stop()停止播放

			} catch (MalformedURLException e) {
			e.printStackTrace();

			}

			}

			
}

