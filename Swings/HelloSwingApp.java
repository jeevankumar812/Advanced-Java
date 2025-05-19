/*
4a. Basic hello program of Swing displaying the message Hello! VI C , Welcome to Swing
Programming in Blue color plain font with font size of 32 using JFrame and JLabel
*/

package Swings;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

class HelloSwingApp {

   HelloSwingApp() {
       // Create a new JFrame container.
       JFrame frame = new JFrame("A Simple Swing Application");

       // Give the frame an initial size.
       frame.setSize(700, 150); // Increased size to better fit large text

       // Terminate the program when the user closes the application.
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       // Create a text-based label.
       JLabel label = new JLabel(" Hello! VI C , Welcome to Swing Programming!");

       // Set properties for the label
       label.setFont(new Font("Verdana", Font.PLAIN, 32));
       label.setForeground(new Color(0, 0, 255));

       // Add the label to the content pane.
       frame.add(label);

       // Display the frame.
       frame.setVisible(true);
   }

   public static void main(String[] args) {
       // Create the frame on the event dispatching thread.
       SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               new HelloSwingApp();
           }
       });
   }
}
