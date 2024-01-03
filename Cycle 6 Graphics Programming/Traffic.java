//CSL203 OOP JAVA LAB ----- ARSHAK MUHAMMED P K, R3A, 72
//CYCLE 6 QUESTION 2
// Write a Java program that simulates a traffic light.
// The program lets the user select one of three lights: red, yellow, or green.
// When a radio button is selected, the light is turned on, and only one light can be on at a time. 
// No light is on when the program starts.

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Traffic class extending JFrame and implementing ActionListener interface
class Traffic extends JFrame implements ActionListener {
    // Radio buttons representing traffic light colors
    JRadioButton b1, b2, b3;

    // Constructor for the Traffic class
    public Traffic() {
        // Set the title of the JFrame
        setTitle("My Traffic");

        // Initialize radio buttons for Red, Green, and Yellow
        b1 = new JRadioButton("RED");
        b2 = new JRadioButton("GREEN");
        b3 = new JRadioButton("YELLOW");

        // Create a ButtonGroup to ensure only one radio button is selected at a time
        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        bg.add(b3);

        // Set default close operation, size, and visibility of the JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 400);
        setVisible(true);

        // Create a JPanel and set its layout to a vertical grid of 3 rows and 1 column
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        // Add radio buttons to the panel
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);

        // Add the panel to the JFrame
        add(panel);

        // Add ActionListeners to each radio button
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
    }

    // Implementation of the actionPerformed method from ActionListener interface
    public void actionPerformed(ActionEvent e) {
        // Check which radio button is clicked and update the background color accordingly
        if (e.getSource() == b1) {
            b1.setBackground(Color.RED);
            b2.setBackground(Color.WHITE);
            b3.setBackground(Color.WHITE);
        }
        if (e.getSource() == b2) {
            b2.setBackground(Color.GREEN);
            b1.setBackground(Color.WHITE);
            b3.setBackground(Color.WHITE);
        }
        if (e.getSource() == b3) {
            b3.setBackground(Color.YELLOW);
            b1.setBackground(Color.WHITE);
            b2.setBackground(Color.WHITE);
        }
    }

    // Main method to create an instance of the Traffic class
    public static void main(String[] args) {
        new Traffic();
    }
}


