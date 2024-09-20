package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame extends JFrame implements ActionListener {
    JLabel l1,l2,l3;

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rb1){
            String str=tf1.getText();
            int a=Integer.parseInt(str);
            int num=kovertoNeBinare(a);
            tf2.setText(""+num);

        }
        if(e.getSource()==rb4){
            tf1.setText("");
            tf2.setText("");
        }
        if(e.getSource()==rb5){
           dispose();
        }
    }

    public int kovertoNeBinare(int number){
        String s="";
        while(number>0){
            int x=number%2;
            s=s+x;
            number=number/2;
        }
        String reverse="";
        for(int i=s.length();i>0;i--){
            reverse=reverse+s.substring(i-1,i);
        }
        int num=Integer.parseInt(reverse);
        return num;
    }
    JTextField tf1,tf2;
    JRadioButton rb1,rb2,rb3,rb4,rb5;
    ButtonGroup btg;
    JPanel p3;
    public myFrame(){
        super("Konvertues Numrash");

        setLayout(new FlowLayout());

        l1=new JLabel("KONVERTUES NGA DECIMAL NE BINARE         ");
        add(l1);
        l2=new JLabel("      Jepni nr ne decimal                   ");
        tf1=new JTextField(16);
        add(l2);
        add(tf1);

        l3=new JLabel("    rezultati ne binare                   ");
        tf2=new JTextField(16);
        add(l3);
        add(tf2);

        p3=new JPanel();
        p3.setLayout(new FlowLayout());
        rb1=new JRadioButton("binare");
        rb2=new JRadioButton("octal");
        rb3=new JRadioButton("hex");
        rb4=new JRadioButton("fshi");
        rb5=new JRadioButton("Mbyll");
        btg=new ButtonGroup();
        btg.add(rb1);
        btg.add(rb2);
        btg.add(rb3);
        btg.add(rb4);
        btg.add(rb5);
        p3.add(rb1);
        p3.add(rb2);
        p3.add(rb3);
        p3.add(rb4);
        p3.add(rb5);
        add(p3);

        rb1.addActionListener(this);
        rb4.addActionListener(this);
        rb5.addActionListener(this);


    }
}
public class BinaryConverter {
    public static void main(String[] args) {
        myFrame my=new myFrame();
        my.setSize(300,300);
        my.setVisible(true);
        my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
