import javax.swing.*;
import java.awt.*;

public class Guiprog2 extends JFrame {
    Guiprog2() {
        setTitle("My Window");
        JCheckBox rd, gr, bl, bk;
        rd = new JCheckBox("Red");
        gr = new JCheckBox("Green");
        bl = new JCheckBox("Black");
        rd.setBounds(20, 20, 80, 40);
        gr.setBounds(100, 20, 80, 40);
        bl.setBounds(180, 20, 80, 40);
        bk.setBounds(260, 20, 80, 40);
        add(rd);
        add(gr);
        add(bl);
        add(bk);

        JRadioButton os1 = new JRadioButton("C");
        JRadioButton os2 = new JRadioButton("C++");
        JRadioButton os3 = new JRadioButton("JAVA");
        JRadioButton os1 = new JRadioButton("Python");
        ButtonGroup group = new ButtonGroup();
        group.add(os1);
        group.add(os2);
        group.add(os3);
        group.add(os4);
        add(os1);
        add(os2);
        add(os3);
        add(os4);
        os1.setBounds(20, 80, 80, 40);
        os2.setBounds(100, 80, 80, 40);
        os3.setBounds(180, 80, 100, 40);
        os4.setBounds(290, 80, 100, 40);
        JComboBox country = new JComboBox();
        country.addItem("India");
        country.addItem("Pakistan");
        country.addItem("Sri Lanka");
        country.addItem("New Zealand");
        country.setBounds(20, 150, 100, 20);
        add(country);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String k[]) {
        new Guiprog2();
    }

}
