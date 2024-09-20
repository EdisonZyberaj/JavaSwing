package JavaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmailGUI{
    public static void main(String[] args) {

        EmailFrame em=new EmailFrame();
        em.setSize(300,400);
        em.setVisible(true);
        em.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class EmailFrame extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4;
    JPanel p1,p2,p3,p4;
    JComboBox<String> comboBox;
    JTextField tf1,tf2;
    JTextArea ta;
    JButton Dergo;
    JButton Reset;

    public EmailFrame(){
        super("Email");
        setLayout(new FlowLayout());
        p1=new JPanel();
        p1.setLayout(new FlowLayout());
        l1=new JLabel("Nga:                ");
        tf1=new JTextField(15);
        p1.add(l1);
        p1.add(tf1);
        add(p1);

        p2=new JPanel();
        p2.setLayout(new FlowLayout());
        l2=new JLabel("Te:                 ");
        tf2=new JTextField(15);
        p2.add(l2);
        p2.add(tf2);
        add(p2);

        p3=new JPanel();
        p3.setLayout(new FlowLayout());
        l3=new JLabel("Protokolli :             ");
        String[] opsionet={"A","B","C"};
        comboBox=new JComboBox<>(opsionet);
        p3.add(l3);
        p3.add(comboBox);
        add(p3);

        l4=new JLabel("                     Mesazhi:");
        add(l4);
        ta=new JTextArea(10,18);
        add(ta);

        p4=new JPanel();
        p4.setLayout(new FlowLayout(FlowLayout.CENTER));
        Dergo=new JButton("Dergo");
        Reset=new JButton("Reset");
        p4.add(Dergo);
        p4.add(Reset);

        Dergo.addActionListener(this);
        Reset.addActionListener(this);
        
        add(p4);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Dergo){
            if(tf1.getText().contains("@")&&tf2.getText().contains("@")&&!ta.getText().isEmpty()){
                JOptionPane.showMessageDialog(null, "Mesazhi eshte derguar me sukses", "Information", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        if(e.getSource()==Reset){
            tf1.setText("");
            tf2.setText("");
            ta.setText("");
        }
    }
}