package practice_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class layered_pane implements ActionListener {
    myframe o=new myframe();
    JButton btn=new JButton("Click");
    JLayeredPane lp;
    layered_pane(){
        btn.addActionListener(this);
        JPanel pan1=new JPanel();
        pan1.setBounds(0,0,100,100);
        JPanel pan2=new JPanel();
        pan2.setBounds(50,50,100,100);
        JPanel pan3=new JPanel();
        pan3.setBounds(100,100,100,100);

        pan1.setBackground(Color.BLACK);
//        pan1.setVisible(true);
        pan2.setBackground(Color.cyan);
//        pan2.setVisible(true);
        pan3.setBackground(Color.green);
//        pan3.setVisible(true);

        lp=new JLayeredPane();
        lp.setBounds(0,0,500,500);
        lp.add(pan1,Integer.valueOf(0));
        lp.add(pan2,Integer.valueOf(2));
        lp.add(pan3,Integer.valueOf(-1));

        btn.setForeground(Color.MAGENTA);
        btn.setBounds(200,175,100,100);
        btn.setBackground(Color.lightGray);
        btn.setFocusable(false);
        lp.add(btn);


        o.add(lp);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn){
            System.out.println("HI HEllo");
//            o.dispose();
            new_window x=new new_window();
        }
    }
}
