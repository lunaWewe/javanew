package tw.luna.pretty;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Luna24 extends JFrame {

	public Luna24() {

		MyMouseListenerV2 mouseListener = new MyMouseListenerV2();
		addMouseListener(mouseListener);
		addMouseMotionListener(mouseListener);

		setSize(640, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Luna24();
	}

}

class MyMouseListenerV2 extends MouseAdapter {
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Press");

	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println(String.format("%d x %d", e.getX(),e.getY()));
		
	}


}


class MyMouselistener implements MouseListener, MouseMotionListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Click");

	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Press");

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Release");

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("drag");
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}