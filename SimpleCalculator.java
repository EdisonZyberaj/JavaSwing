package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.BoxLayout.Y_AXIS;

class myCalc extends JFrame implements ActionListener {

    JTextField tf1, tf2, tf3;
    JRadioButton cb1, cb2, cb3;
    JButton bt1, bt2;
    ButtonGroup btg;
    JPanel p1, p2, p3;

    myCalc() {
        super("Simple Calculator");

        setLayout(new FlowLayout(FlowLayout.CENTER));

        p1 = new JPanel();
        tf1 = new JTextField(10);
        tf2 = new JTextField(10);
        p1.add(tf1);
        p1.add(tf2);



        p2 = new JPanel();
        cb1 = new JRadioButton("mblidh");
        cb2 = new JRadioButton("zbrit");
        cb3 = new JRadioButton("shumezo");

        btg = new ButtonGroup();
        btg.add(cb1);
        btg.add(cb2);
        btg.add(cb3);

        p2.add(cb1);
        p2.add(cb2);
        p2.add(cb3);


        p3 = new JPanel();
        bt1 = new JButton("Kryej Veprimin");
        bt2 = new JButton("OK");
        tf3 = new JTextField(10);
        tf3.setEditable(false);
        p3.add(bt1);
        p3.add(tf3);
        p3.add(bt2);

        bt1.addActionListener(this);
        bt2.addActionListener(this);

        add(p1);
        add(p2);
        add(p3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int a=Integer.parseInt(tf1.getText());
        int b=Integer.parseInt(tf2.getText());

        if(e.getSource()==bt1){
            if(tf1.getText().equals("")||tf2.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Njera nja fushat per input eshte e paplotesuar","Kujdes",JOptionPane.ERROR_MESSAGE);
            }
            if(cb1.isSelected()){
                tf3.setText(a+b+"");

            }
            if(cb2.isSelected()){
                tf3.setText(a-b+"");
            }
            if(cb3.isSelected()){
                tf3.setText(a*b+"");
            }
        }
        if(e.getSource()==bt2){
            if(tf1.getText().equals("")||tf2.getText().equals("")){
                JOptionPane.showMessageDialog(this,"Njera nja fushat per input eshte e paplotesuar","Kujdes",JOptionPane.ERROR_MESSAGE);
            }
            dispose();
        }

    }
}

public class SimpleCalculator {

    public static void main(String[] args) {
        myCalc my = new myCalc();
        my.setSize(300, 300);
        my.setVisible(true);
        my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
