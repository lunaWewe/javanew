package tw.luna.pretty;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;

import tw.luna.apis.MyClock;
import tw.luna.apis.MyPanel;
import tw.luna.apis.MyPanel2;

public class Mysign extends JFrame {
	private MyPanel2 myPanel;
	private JButton clear, undo, redo, color, saveObj, loadObj, saveJPEG;
	private JSlider slider;
	private MyClock myClock;

	public Mysign() {
		super("Sign App");

		myPanel = new MyPanel2();
		setLayout(new BorderLayout());
		add(myPanel, BorderLayout.CENTER);

		clear = new JButton("Clear");
		undo = new JButton("Undo");
		redo = new JButton("Redo");
		color = new JButton("Color");
		saveObj = new JButton("saveObj");
		loadObj = new JButton("loadObj");
		saveJPEG = new JButton("saveJPEG");
		myClock = new MyClock();

		JPanel top = new JPanel(new FlowLayout());
		slider = new JSlider(1, 20);

		top.add(clear);
		top.add(undo);
		top.add(redo);
		top.add(color);
		top.add(color);
		top.add(slider);
		top.add(saveObj);
		top.add(loadObj);
		top.add(saveJPEG);
		top.add(myClock);

		add(top, BorderLayout.NORTH);

		setSize(800, 480);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		initEvent();
	}

	private void initEvent() {
		clear.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.clear();

			}
		});
		undo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.undo();

			}
		});
		redo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				myPanel.redo();

			}
		});
		color.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				changeColor();

			}
		});
		slider.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				int brushSize = slider.getValue();
				myPanel.setBrushSize(brushSize);

			}
		});

		saveObj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveObject();
			}
		});
		loadObj.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loadObject();

			}
		});

		saveJPEG.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					myPanel.saveJPEG();
					System.out.println("OK");
				} catch (Exception e1) {
					System.out.println(e1);
				}

			}
		});

	}

	private void changeColor() {
		Color newColor = JColorChooser.showDialog(null, "Change Color", myPanel.getcolor());
		if (newColor != null) {
			myPanel.setColor(newColor);
		}
	}

	private void saveObject() {
		JFileChooser jfc = new JFileChooser();
//		jfc.showSaveDialog(this);
		if (jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			System.out.println(file.getAbsolutePath());
			try {
				myPanel.saveLines(file);
				JOptionPane.showMessageDialog(null, "Save Success");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Save Failure");
			}

		}
	}

	private void loadObject() {
		JFileChooser jfc = new JFileChooser();
		if (jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			File file = jfc.getSelectedFile();
			System.out.println(file.getAbsolutePath());
			try {
				myPanel.loadLines(file);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Save Failure");
			}

		}
	}

	public static void main(String[] args) {
		new Mysign();

	}

}
