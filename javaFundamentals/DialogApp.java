package javaFundamentals;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DialogApp {
    public static void main(String[] args) {
        JFrame  frame = new JFrame("Hello world1"); // Using for Diolog input show box
        int x;
        int y;
        int sum;
        x = Integer.parseInt(JOptionPane.showInputDialog(frame, "Input x = X"));
        y = Integer.parseInt(JOptionPane.showInputDialog(frame, "Input y = Y"));
        sum =  x + y;
        JOptionPane.showMessageDialog(
        null, "Sum is = " + sum, 
        "Sum of two Integers", JOptionPane.PLAIN_MESSAGE);

    }
}