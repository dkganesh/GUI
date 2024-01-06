package practice_gui;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu {
	JFrame frm;
	JMenuBar mb;
	JMenu m;
	JMenuItem mi;

	public Menu() {
		frm = new JFrame("Menu practice");

		mb = new JMenuBar();
		m = new JMenu("File");
		mb.add(m);

		mi = new JMenuItem("Exit");
		m.add(mi);

		mi.addActionListener(e -> {
			System.out.println("Exit pressed");
			System.exit(0);
		});

		m.setMnemonic(KeyEvent.VK_F);
		mi.setMnemonic(KeyEvent.VK_E);

		frm.setSize(400, 400);
		frm.setLayout(new FlowLayout());
		frm.setJMenuBar(mb);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);

	}

}
