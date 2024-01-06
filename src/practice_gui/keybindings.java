package practice_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class keybindings {

	JFrame frm;
	JLabel lb;

	Action u;
	Action d;
	Action l;
	Action r;


	keybindings(){
		frm=new JFrame("KEY BINDINGINGS");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(null);
		frm.setSize(500,500);
		frm.setLocationRelativeTo(null);

		lb=new JLabel();
		lb.setBounds(100,100,100,100);
		lb.setBackground(Color.green);
		lb.setOpaque(true);

		u=new up();
		d=new down();
		l=new left();
		r=new right();

		lb.getInputMap().put(KeyStroke.getKeyStroke("UP"),"q");
		System.out.println(KeyStroke.getKeyStroke("UP"));
		lb.getActionMap().put("q",u);

		lb.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"w");
		System.out.println(KeyStroke.getKeyStroke("DOWN"));
		lb.getActionMap().put("w",d);

		lb.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"e");
		System.out.println(KeyStroke.getKeyStroke("LEFT"));
		lb.getActionMap().put("e",l);

		lb.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"r");
		System.out.println(KeyStroke.getKeyStroke("RIGHT"));
		lb.getActionMap().put("r",r);

		frm.add(lb);
		frm.setVisible(true);
	}

	public class up extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			lb.setLocation(lb.getX(),lb.getY()-10);
		}
	}
	public class down extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			lb.setLocation(lb.getX(),lb.getY()+10);
		}
	}
	public class left extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			lb.setLocation(lb.getX()-10,lb.getY());
		}
	}
	public class right extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			lb.setLocation(lb.getX()+10,lb.getY());
		}
	}

}
