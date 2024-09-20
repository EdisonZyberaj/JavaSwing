
package JavaSwing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame6 extends JFrame implements ActionListener {
    JLabel l1;
    JLabel l2;
    JLabel l3;

    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    JTextField tf1;
    JRadioButton rb1;
    JRadioButton rb2;
    JRadioButton rb3;
    JRadioButton rb4;
    ButtonGroup bg1;
    ButtonGroup bg2;
    JButton bt1;

    public MyFrame6() {
        super("Test");
        setLayout(new GridLayout(4, 1));

        p1 = new JPanel();
        l1 = new JLabel("Distanca");
        p1.add(l1);
        tf1 = new JTextField(10);
        p1.add(tf1);
        add(p1);

        p2 = new JPanel();
        l2 = new JLabel("Njesia Fillestare");
        bg1 = new ButtonGroup();
        rb1 = new JRadioButton("Kilometers");
        rb2 = new JRadioButton("Miles");
        p2.add(l2);
        p2.add(rb1);
        p2.add(rb2);
        bg1.add(rb1);
        bg1.add(rb2);
        add(p2);

        p3 = new JPanel();
        l3 = new JLabel("Njesia e konvertuar");
        bg2 = new ButtonGroup();
        rb3 = new JRadioButton("Miles");
        rb4 = new JRadioButton("Kilometres");
        p3.add(l3);
        p3.add(rb3);
        p3.add(rb4);
        bg2.add(rb3);
        bg2.add(rb4);
        add(p3);

        p4 = new JPanel();
        bt1 = new JButton("Konverto");
        p4.add(bt1);
        add(p4);
        bt1.addActionListener(this);
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        rb3.addActionListener(this);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            if (rb1.isSelected() && rb3.isSelected()) {
                double a = Double.parseDouble(tf1.getText());
                a = a / 1.6;
                tf1.setText(String.valueOf(a));

            }
            if (rb2.isSelected() && rb4.isSelected()) {
                double a = Double.parseDouble(tf1.getText());
                a = a * 1.6;
                tf1.setText(String.valueOf(a));

            }
        }
    }
}

public class distanceConverter {
    public static void main(String[] args) {
        MyFrame6 my = new MyFrame6();
        my.setSize(300, 200);
        my.setResizable(false);
        my.setVisible(true);
        my.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
