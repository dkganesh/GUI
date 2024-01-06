package practice_gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test01 {
	public JButton btn;

	test01() {
		// TODO Auto-generated method stub
		JLabel label = new JLabel();
		label.setSize(200, 100);
		label.setOpaque(true);
		label.setBackground(Color.BLACK);
		label.setBorder(BorderFactory.createLineBorder(Color.magenta, 5, true));

		JPanel panel = new JPanel();
		panel.setSize(200, 100);
		panel.setBounds(275, 0, 200, 100);
		panel.setVisible(false);
		panel.setBackground(Color.blue);
		panel.setBorder(BorderFactory.createLineBorder(Color.cyan, 5, true));

		btn = new JButton("New Button");
		btn.setBackground(Color.green);
		btn.setFocusable(false);
		btn.setForeground(Color.BLACK);
		btn.setFont(new Font("Verdana", Font.BOLD, 16));
		btn.setVisible(true);
		btn.setBounds(150, 150, 200, 100);
		btn.addActionListener(e -> {
			System.out.println("Hello Dk!!!");
			this.btn.setEnabled(false);
			panel.setVisible(true);
		});

		myframe o = new myframe();
		o.setResizable(false);
		o.setLayout(null);
		o.add(label);
		o.add(panel);
		o.add(btn);
	}

}
