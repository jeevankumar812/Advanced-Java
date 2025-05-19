/*
 4b. Develop a Swing program in Java to display a message “Srilanka is pressed” or “India is
 pressed” depending upon the JButton either Srilanka or India is pressed by implementing the
 event handling mechanism with addActionListener().
 */
package Swings;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class CountryButtonApp {
    
    JLabel label;

    CountryButtonApp() {
        JFrame frame = new JFrame("Button Example");

        label = new JLabel();
        label.setBounds(50, 50, 700, 100);
        label.setFont(new Font("Lucida Calligraphy", Font.BOLD, 30));

        JButton indiaButton = new JButton("India");
        indiaButton.setBounds(100, 200, 100, 100);
        indiaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        JButton sriLankaButton = new JButton("Srilanka");
        sriLankaButton.setBounds(400, 200, 100, 100);
        sriLankaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("SriLanka is pressed");
            }
        });

        frame.add(indiaButton);
        frame.add(sriLankaButton);
        frame.add(label);
        frame.setSize(700, 400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CountryButtonApp();
    }
}
