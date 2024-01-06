package practice_gui;

import javax.swing.*;
import java.awt.*;

public class new_window {
    myframe x=new myframe();
    JLabel lb=new JLabel("Welcome DK!!!");
    new_window(){
        lb.setForeground(Color.green);
        lb.setFont(new Font("Verdana",Font.BOLD,32));
        JPanel p=new JPanel();
        x.setLayout(new FlowLayout(FlowLayout.CENTER,0,200));
        p.setVisible(true);
        p.setBackground(Color.DARK_GRAY);
        p.add(lb);
        p.setBorder(BorderFactory.createLineBorder(Color.red,3,true));

        x.add(p);
    }
}
