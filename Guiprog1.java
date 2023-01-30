import javax.swing.*;
import java.awt.*;

public class Guiprog1 extends JFrame {
    Guiprog1() {
        JLabel one, two;
        JTextField tname;
        JTextField tsalary;
        JButton buttonSave, buttonExit;
        one = new JLabel("Enter Name");
        tname = new JTextField(20);
        two = new JLabel("Enter Salary");
        tsalary = new JTextField(20);
        buttonSave = new JButton("Save");
        buttonExit = new JButton("Exit");
        one.setBounds(20, 20, 80, 80);
        two.setBounds(20, 80, 80, 80);
        tname.setBounds(100, 40, 170, 40);
        tsalary.setBounds(100, 100, 170, 40);
        buttonSave.setBounds(50, 150, 100, 40);
        buttonExit.setBounds(180, 150, 100, 40);
        add(one);
        add(tname);
        add(two);
        add(tsalary);
        add(buttonSave);
        add(buttonExit);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Guiprog1();
    }
}