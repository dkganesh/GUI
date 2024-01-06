package practice_gui;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class Slider {
	JFrame frm;
	JSlider slider;
	JLabel lb;

	public Slider() {
		frm = new JFrame("Slider");

		slider = new JSlider(0, 100, 50);
		lb = new JLabel("Welcome");

		slider.setPreferredSize(new Dimension(300, 400));
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(25);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.setPaintLabels(true);
		slider.addChangeListener(e -> lb.setText("Temp is " + slider.getValue()));

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frm.add(slider);
		frm.add(lb);
		frm.setLayout(new FlowLayout());
		frm.pack();
		frm.setVisible(true);
	}

}
