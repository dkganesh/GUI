package practice_gui;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class mouselistener implements MouseListener {

	JFrame frm;
	JLabel lb;

	public mouselistener() {
		frm = new JFrame("MOUSE LISTENER");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		frm.setSize(500, 500);

		lb = new JLabel();
		lb.setBounds(0, 0, 100, 100);
		lb.setOpaque(true);
		lb.setBackground(Color.pink);
		lb.addMouseListener(this);

		frm.add(lb);

		frm.setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Clicked");
		lb.setBackground(Color.black);
		System.exit(0);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Pressed");
		lb.setBackground(Color.blue);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Released");
		lb.setBackground(Color.MAGENTA);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Entered");
		lb.setBackground(Color.green);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Exited");
		lb.setBackground(Color.pink);
	}

}
