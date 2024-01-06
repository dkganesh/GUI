package practice_gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class myframe extends JFrame {
	public myframe() {
		// TODO Auto-generated constructor stub
		super("My_new Frame");
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		setVisible(true);
//		setResizable(false);
	}
}
