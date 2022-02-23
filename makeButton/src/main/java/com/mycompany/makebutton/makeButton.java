/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.makebutton;
import javax.swing.*;

/**
 *
 * @author U134713
 */
public class makeButton {
    public static void main(String[] args) {
        JFrame window = new JFrame("Tom's window");
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me!");
        panel.add(button);
        window.add(panel);
        window.setSize(300,100);
        button.addActionListener(e -> System.out.println("Ouch! You clicked me!"));
        window.setVisible(true);
        
        
    }
}
