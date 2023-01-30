import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Guiprog5 extends JFrame implements ActionListener {
    JLabel one,two,three;
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4;

    Guiprog5() {

        one = new JLabel("First No.");
        t1 = new JTextField(20);
        two = new JLabel("Second No.");
        t2 = new JTextField(20);
        three = new JLabel("Result");
        t3 = new JTextField(20);
        b1 = new JButton(" + ");
        b2 = new JButton(" * ");
        b3 = new JButton(" / ");
        b4 = new JButton("Reset");
        one.setBounds(20, 20, 80, 80);
        two.setBounds(20, 80, 180, 80);
        t1.setBounds(100, 40, 170, 40);
        t2.setBounds(100, 100, 170, 40);
        three.setBounds(20, 140, 180, 80);
        t3.setBounds(100, 160, 170, 40);
        b1.setBounds(50, 300, 100, 40);
        b2.setBounds(180, 300, 100, 40);
        b3.setBounds(300, 300, 100, 40);
        b4.setBounds(430, 300, 100, 40);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        add(one);
        add(t1);
        add(two);
        add(t2);
        add(three);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        setSize(600, 500); // Setting size of JFrame
        setLayout(null);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {

        int n1, n2, res;
        try {
            n1 = Integer.parseInt(t1.getText());
            n2 = Integer.parseInt(t2.getText());
            if (ae.getSource() == b1) {
                res = n1 + n2;
                t3.setText(res + "");

            } else if (ae.getSource() == b2) {
                res = n1 * n2;
                t3.setText(res + "");

            } else if (ae.getSource() == b3) {
                res = n1 / n2;
                t3.setText(res + "");

            } else if (ae.getSource() == b4) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
                t1.requestFocus();
            }
        } catch (Exception ob) {
        }
    }

    public static void main(String args[]) {
        new Guiprog5();
    }

}