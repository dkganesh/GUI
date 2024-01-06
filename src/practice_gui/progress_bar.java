package practice_gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class progress_bar {
	JFrame frm = new JFrame("Progress bar");
	JProgressBar pb = new JProgressBar();

	public progress_bar() {
		pb.setBounds(0, 0, 200, 50);
		pb.setStringPainted(true);
		pb.setFont(new Font("Verdana", Font.BOLD, 12));
		pb.setForeground(Color.BLUE);

		frm.add(pb);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setSize(200, 100);
		frm.setLayout(null);
		frm.setVisible(true);

		loop();
	}

	public void loop() {
		int c = 0;
		while (c <= 100) {
			pb.setValue(c);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			c = c + 1;
		}
		pb.setString("Done");
	}
}
