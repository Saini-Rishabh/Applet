import java.awt.*;

public class AWTExample1 extends Frame {

    AWTExample1() {
        Button b = new Button("Le Ungli Kar le  !!");
        b.setBounds(30, 100, 180, 30);
        add(b);
        setSize(300, 300);
        setTitle("Maa Chod Dungaa");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        AWTExample1 f = new AWTExample1();

    }

}