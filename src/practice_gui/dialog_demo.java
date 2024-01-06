package practice_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class dialog_demo implements ActionListener {
    myframe o=new myframe();int x=0;JButton btn;JLabel l;
    dialog_demo(){

        btn=new JButton("Open Dialog Box");
        btn.addActionListener(this);
        btn.setFocusable(false);
        btn.setForeground(Color.WHITE);
        btn.setFont(new Font(null,Font.BOLD,12));
        btn.setBackground(Color.BLACK);
        btn.setBounds(50,100,75,75);



        JLabel lb=new JLabel();
        lb.setText("Welcome");
        lb.setForeground(Color.BLUE);
        lb.setFont(new Font("Verdana",Font.BOLD,20));
        lb.setOpaque(true);
        lb.setBackground(Color.lightGray);
        lb.setHorizontalAlignment(JLabel.CENTER);


        l=new JLabel();
        l.setText("Welcome");
        l.setForeground(Color.BLUE);
        l.setFont(new Font("Verdana",Font.BOLD,20));
        l.setOpaque(true);
        l.setBackground(Color.lightGray);
        l.setHorizontalAlignment(JLabel.CENTER);


        JPanel p=new JPanel();
        p.setVisible(true);
        p.setBackground(Color.lightGray);
        p.setBorder(BorderFactory.createLineBorder(Color.red,3,true));
        p.setBounds(150,150,400,300);
        p.setBorder(BorderFactory.createLineBorder(Color.green,3));
        p.setLayout(new BorderLayout());
        p.add(lb,BorderLayout.NORTH);
        p.add(btn,BorderLayout.SOUTH);
        p.add(l,BorderLayout.CENTER);


        o.setLayout(null);
        o.setSize(800,600);

        o.add(p);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn)
      x=JOptionPane.showConfirmDialog
              (null,"HI!!","DK",JOptionPane.YES_NO_CANCEL_OPTION);
        switch (x){
            case 0: {
                l.setText("YES");
                break;
            }
            case 1: {
                l.setText("NO");
                break;
            }
            case 2: {
                l.setText("CANCEL");
                break;
            }
            case -1: {
                l.setText("CLOSE");
                break;
            }
            default:
                l.setText("GOT...");
        }
    }
}
