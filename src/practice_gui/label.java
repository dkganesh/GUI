package practice_gui;

import javax.swing.*;
import java.awt.*;

public class label{
    public static void main(String args[]){
        JFrame frm=new JFrame("JLABEL");
        frm.setSize(800,600);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
        frm.setLayout(null);

        JLabel lb=new JLabel("WELCOME");
        lb.setForeground(Color.black);
        lb.setFont(new Font("Verdana",Font.BOLD,22));
        lb.setBackground(Color.lightGray);
        lb.setOpaque(true);
        lb.setBounds(0,0,300,100);
        lb.setHorizontalAlignment(JLabel.CENTER);



        frm.setLayout(new FlowLayout());
        frm.add(lb);

    }

}
