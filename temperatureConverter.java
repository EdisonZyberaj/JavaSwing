package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class myFrame7 extends JFrame implements ActionListener {
    JLabel l1,l2;
    JTextField tf1;
    JRadioButton rb1,rb2;
    ButtonGroup bg;
    JPanel p1,p2,p3,p4;

    public myFrame7(){
        super("temperature converter");
        setLayout(new GridLayout(4,1));
        p1=new JPanel(new FlowLayout(FlowLayout.CENTER));
        l1=new JLabel("Enter Celcius Temperature");
        p1.add(l1);
        p2=new JPanel(new FlowLayout(FlowLayout.CENTER));
        tf1=new JTextField(10);
        p2.add(tf1);
        p3=new JPanel(new FlowLayout(FlowLayout.CENTER));
        bg=new ButtonGroup();
        rb1=new JRadioButton("Farenheit");
        rb2=new JRadioButton("Kelvin");
        bg.add(rb1);
        bg.add(rb2);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        p3.add(rb1);
        p3.add(rb2);
        p4=new JPanel(new FlowLayout(FlowLayout.CENTER));
        l2=new JLabel("New temperature in is: ");
        p4.add(l2);

        add(p1);
        add(p2);
        add(p3);
        add(p4);

    }
    @Override
    public void actionPerformed(ActionEvent e){
      if(e.getSource()==rb1){
       double a=Double.parseDouble(tf1.getText())*1.8+32;
       l2.setText("New temperature in is: "+String.valueOf(a));
      }
      if(e.getSource()==rb2){
          double a=Double.parseDouble(tf1.getText())+273.15;
          l2.setText("New temperature in is: "+String.valueOf(a));

      }
    }
}



public class temperatureConverter {
    public static void main(String[] args) {
       myFrame7 my=new myFrame7();
       my.setSize(300,200);
       my.setResizable(false);
       my.setVisible(true);
       my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
