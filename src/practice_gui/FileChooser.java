package practice_gui;

import javax.swing.*;
import java.io.File;

public class FileChooser {
    JFrame frm;
    JButton btn;
    FileChooser(){
        frm=new JFrame("File chooser demo");
        btn=new JButton("Choose");
        btn.addActionListener(e->{
            JFileChooser fc=new JFileChooser();
            int x=fc.showOpenDialog(null);
            if(x==JFileChooser.APPROVE_OPTION){
                System.out.println("File choosen");
                File f=new File(fc.getSelectedFile().getAbsolutePath());
                System.out.println(f);
            }
        });
        frm.add(btn);

        frm.setSize(50,50);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
