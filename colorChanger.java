package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class colorChanger {

    public static void main(String[] args) {

        Frame1 f = new Frame1();
        f.setSize(300, 300);
        f.setVisible(true);
    }

}

class Frame1 extends JFrame implements ActionListener {
    private JLabel l;
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JButton ok;

    public Frame1() {
        super("Ngjyrat");
        // layout eshte lene flow ne menyre qe te ndryshojme bachgroundin e frame,
        // nese do ndertohet me panele duhet te ndryshojme ndgjyren e cdo paneli
        setLayout(new FlowLayout());
        l = new JLabel("Ndryshimi i ngjyave");
        tf1 = new JTextField("BLU", 20);
        tf2 = new JTextField("VERDHE", 20);
        tf3 = new JTextField("JESHLE", 20);
        tf4 = new JTextField("KUQE", 20);
        ok = new JButton("OK");
        // i bejme TextField-ed te paeditueshme
        tf1.setEditable(false);
        tf2.setEditable(false);
        tf3.setEditable(false);
        tf4.setEditable(false);
        add(l);
        add(tf1);
        add(tf2);
        add(tf3);
        add(tf4);
        add(ok);
        tf1.addMouseListener(new MouseHandler(Color.BLUE, this, l));
        tf2.addMouseListener(new MouseHandler(Color.YELLOW, this, l));
        tf3.addMouseListener(new MouseHandler(Color.GREEN, this, l));
        tf4.addMouseListener(new MouseHandler(Color.RED, this, l));
        ok.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        dispose();
    }

}


class MouseHandler extends MouseAdapter {
    Color c;// ngjyra qe ne do ti vendosim frames
    Frame1 f;// frama jone ku do te aplikome ndryshimet
    JLabel l;// nje JLabel ku do te ndryshojme fontin e tij
    public MouseHandler(Color c, Frame1 f, JLabel l) {
        this.c = c;
        this.f = f;
        this.l = l;
    }
    public void mouseEntered(MouseEvent event) {
        // Frame-it i vendosim si background ngjyren qe kalohet si parameter ne varesi
        // se cili TextField shkakton eventin
        f.getContentPane().setBackground(c);
        // ndryshojme Font-in e Label-it
        l.setFont(new Font("Serif", Font.ITALIC, 15));
    }
    public void mouseExited(MouseEvent event) {
        // ne rast se mouse-i del nga TextField-i ngjyra e Background-it dhe Font-i i
        // Label-it vendosen sic ishin
        f.getContentPane().setBackground(Color.WHITE);
        l.setFont(new Font("Serif", Font.PLAIN, 15));
    }
}