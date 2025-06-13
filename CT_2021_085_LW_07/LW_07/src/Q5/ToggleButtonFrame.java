package Q5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ToggleButtonFrame extends JFrame implements ActionListener {
    private JButton button;
    private boolean isOn = false;

    public ToggleButtonFrame() {
        setTitle("Toggle Frame");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        button = new JButton("OFF");
        button.setBounds(150, 100, 100, 40);
        button.addActionListener(this);
        add(button);

        getContentPane().setBackground(Color.GREEN);
    }

    public void actionPerformed(ActionEvent e) {
        if (isOn) {
            button.setText("OFF");
            getContentPane().setBackground(Color.GREEN);
        } else {
            button.setText("ON");
            getContentPane().setBackground(Color.RED);
        }
        isOn = !isOn;
    }

    public static void main(String[] args) {
        ToggleButtonFrame frame = new ToggleButtonFrame();
        frame.setVisible(true);
    }
}
