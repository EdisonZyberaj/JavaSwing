package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

class myNumberGenerator extends JFrame implements ActionListener {
    JLabel l1;
    JLabel l2;
    JLabel l3;

    JButton bt1;
    JButton bt2;

    JRadioButton rb1;
    JRadioButton rb2;
    ButtonGroup btg;

    JPanel p1;
    JPanel p2;
    JPanel p3;

    public myNumberGenerator() {
        super("Number Generator");
        setLayout(new GridLayout(3, 1));

        l1 = new JLabel("Choose an option", SwingConstants.CENTER);
        l2 = new JLabel("", SwingConstants.CENTER);
        l3 = new JLabel();

        bt1 = new JButton("Generate Number");
        bt2 = new JButton("OK");

        rb1 = new JRadioButton("Less than 50");
        rb2 = new JRadioButton("Greater than 50");

        btg = new ButtonGroup();
        btg.add(rb1);
        btg.add(rb2);

        p1 = new JPanel();
        p1.add(bt1);
        p1.add(bt2);

        p2 = new JPanel();
        p2.add(l1);

        p3 = new JPanel();
        p3.add(rb1);
        p3.add(rb2);

        JPanel p4 = new JPanel();
        p4.add(l2);

        add(p2);
        add(p3);
        add(p4);
        add(p1);

        bt1.addActionListener(this);
        bt2.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bt1) {
            Random rand = new Random();
            int number = rand.nextInt(100);

            if (rb1.isSelected()) {
                if (number >= 50) number = rand.nextInt(50);
            } else if (rb2.isSelected()) {
                if (number < 50) number = 50 + rand.nextInt(50);
            }

            l2.setText("Generated Number: " + number);
        } else if (e.getSource() == bt2) {
            JOptionPane.showMessageDialog(this, "OK Button Pressed");
        }
    }
}

public class NumberGenerator {
    public static void main(String[] args) {
        myNumberGenerator numberGenerator = new myNumberGenerator();
        numberGenerator.setSize(300, 300);
        numberGenerator.setVisible(true);
        numberGenerator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
