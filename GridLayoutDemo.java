import java.awt.Frame;
import java.awt.Button;
import java.awt.GridLayout;
public class GridLayoutDemo {
    public GridLayoutDemo()
    {
        Frame frame=new Frame("GridLayout");
        frame.setLayout(new GridLayout(3,4));

        for(int i=1;i<=10;i++)
        {
            Button button =new Button(String.valueOf(i));
            frame.add(button);
        }
        frame.setSize(400,300);
        frame.setVisible(true);
    }
    public static void main(String k[])
    {
        new GridLayoutDemo();
    }
}
