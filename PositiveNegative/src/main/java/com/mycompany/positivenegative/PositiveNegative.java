/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.positivenegative;
import java.util.Scanner;

/**
 *
 * @author Tom Hubbard
 */
public class PositiveNegative {
    public static void main(String[] args) {
        // Goal is to write a program to see if the number entered is a postive or negative
        
        int number = 0;
        String stringValue = "";
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter a number");
        stringValue = inputReader.nextLine();
        number = Integer.parseInt(stringValue);
        
        if (number >= 0 )
        {
            
        }
}
