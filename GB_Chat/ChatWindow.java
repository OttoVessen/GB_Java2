package GB_Chat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatWindow extends JFrame implements ActionListener {

    JTextArea log = new JTextArea();
    JButton send = new JButton("Отправить");
    JTextField input = new JTextField(30);


    public ChatWindow() {

        setTitle("Это чат");
        setLayout(new BorderLayout());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640, 480);
        setLocationRelativeTo(null);
        setVisible(true);
        log.setEditable(false);
        log.setLineWrap(true);


        JPanel panel = new JPanel();
        add(log, BorderLayout.CENTER);
        panel.add(input, BorderLayout.WEST);
        panel.add(send, BorderLayout.EAST);
        add(panel, BorderLayout.SOUTH);
        send.addActionListener(this);
        input.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = input.getText();
        log.append(s + "\n");
        input.setText(null);

    }
}
