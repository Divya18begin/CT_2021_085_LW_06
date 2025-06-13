package Q4;
import javax.swing.*;
import java.awt.event.*;

public class TitleChangeFrame extends JFrame implements ActionListener {
    private JButton button;
    private JTextField textField;

    public TitleChangeFrame() {
        setTitle("Change Title");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        textField = new JTextField();
        textField.setBounds(100, 30, 200, 30);
        add(textField);

        button = new JButton("Set Title");
        button.setBounds(150, 80, 100, 30);
        button.addActionListener(this);
        add(button);
    }

    public void actionPerformed(ActionEvent e) {
        setTitle(textField.getText());
    }

    public static void main(String[] args) {
        TitleChangeFrame frame = new TitleChangeFrame();
        frame.setVisible(true);
    }
}

