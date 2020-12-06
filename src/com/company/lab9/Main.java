package com.company.lab9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static float num1;
    static float num2;
    static float r;

    static JPanel panel = new JPanel();
    static JPanel panel2 = new JPanel();
    static JPanel panel3 = new JPanel();
    static JLabel l1 = new JLabel("First number");
    static JTextField number1 = new JTextField(5);
    static JLabel l2 = new JLabel("Second number");
    static JTextField number2 = new JTextField(5);
    static JLabel result = new JLabel("Result: ");
    static JLabel error = new JLabel("");

    public static void main(String[] args) {

        JFrame frame = new JFrame("Division");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,200);


        panel.add(l1);
        panel.add(number1);
        panel.add(l2);
        panel.add(number2);

        JButton button = new JButton("Divide");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                try {
                    num1 = Float.parseFloat(number1.getText());
                    num2 = Float.parseFloat(number2.getText());
                    if (num2 == 13) {
                        throw new UnluckyException("Unlucky number");
                    }
                    r = num1 / num2;
                    result.setText("Result: " + Float.toString(r));
                    error.setText("");
                }
                catch (Exception ex) {
                    result.setText("Result: ");
                    error.setText("Error:  " + ex.toString());
                }
            }
        });

        panel.add(button);
        panel2.add(result);
        panel3.add(error);

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, panel2);
        frame.getContentPane().add(BorderLayout.SOUTH, panel3);
        frame.setVisible(true);
    }

}
