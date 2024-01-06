package practice_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class layout_mgr {
	public layout_mgr() {
		// TODO Auto-generated constructor stub
		JPanel pan1 = new JPanel();
		JPanel pan2 = new JPanel();
		JPanel pan3 = new JPanel();
		JPanel pan4 = new JPanel();
		JPanel pan5 = new JPanel();

		pan1.setBackground(Color.blue);
		pan1.setOpaque(true);

		pan2.setBackground(Color.cyan);
		pan2.setOpaque(true);

		pan3.setBackground(Color.DARK_GRAY);
		pan3.setOpaque(true);

		pan4.setBackground(Color.green);
		pan4.setOpaque(true);

		pan5.setBackground(Color.magenta);
		pan5.setOpaque(true);

		pan1.setPreferredSize(new Dimension(100, 100));
		pan2.setPreferredSize(new Dimension(100, 100));
		pan3.setPreferredSize(new Dimension(100, 100));
		pan4.setPreferredSize(new Dimension(100, 100));
		pan5.setPreferredSize(new Dimension(100, 100));

		myframe o = new myframe();
		o.setLayout(new BorderLayout());
		o.add(pan1, BorderLayout.NORTH);
		o.add(pan2, BorderLayout.SOUTH);
		o.add(pan3, BorderLayout.WEST);
		o.add(pan4, BorderLayout.EAST);
		o.add(pan5, BorderLayout.CENTER);

	}

}
