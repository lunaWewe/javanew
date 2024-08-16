package tw.luna.apis;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import tw.luna.pretty.if04;

public class GamePanel extends JPanel {
	private BufferedImage ballImg;
	private int ballX, ballY, ballW, ballH, viewW, viewH, dx, dy;
	private Timer timer;

	public GamePanel() {
		setBackground(Color.YELLOW);
		try {
			ballImg = ImageIO.read(new File("dir1/ball2.png"));
			ballW = ballImg.getWidth();
			ballH = ballImg.getHeight();
		} catch (IOException e) {

		}
		addMouseListener(new Mylistener());
		timer = new Timer();
		timer.schedule(new BallTask(), 1 * 1000, 30);

		ballX = ballY = 1;
		dx = dy = 4;

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(ballImg, ballX, ballY, null);
		viewH = getHeight();
		viewW = getWidth();
//		System.out.println(viewH+":"+viewW);

	}

	private class BallTask extends TimerTask {
		@Override
		public void run() {
			if (ballX <= 0 || ballX + ballW >= viewW) {
				dx *= -1;
			}
			if (ballY <= 0 || ballY + ballH >= viewH) {
				dy *= -1;
			}
			ballX += dx; // 位移 4 像素
			ballY += dy; // 位移 4 像素
			repaint();

		}
	}

	private class Mylistener extends MouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			ballX = e.getX() - (int) (ballW / 2.0);
			ballY = e.getY() - (int) (ballH / 2.0);
			repaint();
		}
	}
}
