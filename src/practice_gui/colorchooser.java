package practice_gui;

import javax.swing.*;
import java.awt.*;

public class colorchooser {
    JFrame frm;
    JButton btn;
    JLabel lb;
    colorchooser(){
        lb=new JLabel("WELCOME");
        lb.setFont(new Font("MV boli",Font.BOLD,100));
        frm=new JFrame("Color chooser demo");
        frm.setLayout(new FlowLayout());
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn=new JButton("click");

        frm.add(btn);
        frm.add(lb);

        btn.addActionListener(e->{
            System.out.println("Clicked");
//            JColorChooser cc=new JColorChooser();
            Color c=JColorChooser.showDialog(null,"Pick a Color",Color.BLACK);
            lb.setForeground(c);
        });

        frm.pack();
        frm.setVisible(true);
    }
}
