package Q2_2;

import javax.swing.*;
import java.awt.*;

public class MyFrame1 extends JFrame {
    public MyFrame1() {
        setTitle("MyFrame");
        setSize(400, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set blue background
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        MyFrame1 frame = new MyFrame1();
        frame.setVisible(true);
    }
}
