package practice_gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class keyListner implements KeyListener {
    JFrame frm;
    JLabel lb;
    keyListner(){
        frm=new JFrame("KEY LISTNER");
        lb=new JLabel();
        lb.setBackground(Color.green);
        lb.setOpaque(true);
        lb.setBounds(0,0,100,100);


        frm.setSize(500,500);
        frm.setLayout(null);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frm.add(lb);
        frm.addKeyListener(this);

//        frm.pack();
        frm.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a':
                    {
                        lb.setLocation(lb.getX()-10,lb.getY());
                        break;
                    }
            case 'w':
                    {
                        lb.setLocation(lb.getX(),lb.getY()-10);
                        break;
                    }
            case 'd':
                    {
                        lb.setLocation(lb.getX()+10,lb.getY());
                        break;
                    }
            case 's':
                    {
                        lb.setLocation(lb.getX(),lb.getY()+10);
                        break;
                    }
            default:
                    {
                        lb.setLocation(lb.getX(),lb.getX());
                        break;
                    }
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37:
            {
                lb.setLocation(lb.getX()-10,lb.getY());
                break;
            }
            case 38:
            {
                lb.setLocation(lb.getX(),lb.getY()-10);
                break;
            }
            case 39:
            {
                lb.setLocation(lb.getX()+10,lb.getY());
                break;
            }
            case 40:
            {
                lb.setLocation(lb.getX(),lb.getY()+10);
                break;
            }
            default:
            {
                lb.setLocation(lb.getX(),lb.getX());
                break;
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyChar());
        System.out.println(e.getKeyCode());
    }
}
