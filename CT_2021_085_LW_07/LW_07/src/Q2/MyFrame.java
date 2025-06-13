package Q2;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
    public MyFrame() {
        setTitle("MyFrame");
        setSize(400, 450);
        //getContentPane().setBackground(Color.BLUE);
        Container contentPane= getContentPane();
        contentPane.setBackground(Color.CYAN);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
    }
}
