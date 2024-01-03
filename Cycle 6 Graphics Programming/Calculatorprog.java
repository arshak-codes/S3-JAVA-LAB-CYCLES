////CSL203 OOP JAVA LAB ----- ARSHAK MUHAMMED P K, R3A, 72
//CYCLE 6 QUESTION 1
/*a Java program that works as a simple calculator. 
Arrange Buttons for digits and the + - * % operations properly. 
Add a text field to display the result. Handle any possible exceptions 
like divide by zero. Use Java Swing.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculatorprog extends JFrame implements ActionListener{
    JTextField t1, t2, t3; // num 1 and num 2 and result
    JButton badd, bsub, bmulti, bdiv, bmod, bresult;
    JLabel label1, label2, label3; // Labels for text
    static double a,b,res;
    int operator;
    Calculatorprog() {
        setTitle("My Calculator"); // Set the title directly on the JFrame

        label1 = new JLabel("Enter Number 1:");
        label2 = new JLabel("Enter Number 2:");
        label3 = new JLabel("Result:");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        badd = new JButton("+");
        bsub = new JButton("-");
        bmulti = new JButton("*");
        bdiv = new JButton("/");
        bmod = new JButton("%");
        bresult = new JButton("=");

        // Set bounds (x, y, w, h) for labels and text fields
        label1.setBounds(20, 20, 100, 20);
        t1.setBounds(120, 20, 100, 20);

        label2.setBounds(20, 60, 100, 20);
        t2.setBounds(120, 60, 100, 20);

        label3.setBounds(20, 100, 80, 20);
        t3.setBounds(120, 100, 100, 20);

        // Set bounds (x, y, w, h) for buttons
        badd.setBounds(20, 150, 50, 50);
        bsub.setBounds(60, 150, 50, 50);
        bmulti.setBounds(100, 150, 50, 50);
        bdiv.setBounds(140, 150, 50, 50);
        bmod.setBounds(180, 150, 50, 50);
        bresult.setBounds(220, 150, 50, 50);

        // Add components to the JFrame
        add(label1);
        add(t1);

        add(label2);
        add(t2);

        add(label3);
        add(t3);

        add(badd);
        add(bsub);
        add(bmulti);
        add(bdiv);
        add(bmod);
        add(bresult);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null); // Set layout to null for absolute positioning
        setSize(300, 300); // Set a preferred size
        setVisible(true);

        //Register to Action Listeners

        badd.addActionListener(this);
        bsub.addActionListener(this);
        bmulti.addActionListener(this);
        bdiv.addActionListener(this);
        bmod.addActionListener(this);
        bresult.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==badd){
            a=Double.parseDouble(t1.getText());
            b=Double.parseDouble(t2.getText());
            operator = 1;//op 1 as add
        }
        if(e.getSource()==bsub){
            a=Double.parseDouble(t1.getText());
            b=Double.parseDouble(t2.getText());
            operator = 2;
        }
        if(e.getSource()==bmulti){
            a=Double.parseDouble(t1.getText());
            b=Double.parseDouble(t2.getText());
            operator = 3;
        }
        if(e.getSource()==bdiv){
            a=Double.parseDouble(t1.getText());
            b=Double.parseDouble(t2.getText());
            operator = 4;
        }
        if(e.getSource()==bmod){
            a=Double.parseDouble(t1.getText());
            b=Double.parseDouble(t2.getText());
            operator = 5;}
        if(e.getSource()==bresult){
            switch (operator) {
                case 1:
                        res = a+b;
                    break;
                case 2:
                        res = a-b;
                    break;
                case 3:
                        res = a*b;
                    break;
                case 4:
                        res = a/b;
                    break;
                case 5:
                        res = a%b;
                    break;        
                default:t3.setText("Error!");
                    break;
            }
                t3.setText(""+res);

            }
    }

    public static void main(String[] args) {
        new Calculatorprog();
    }
}

