/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myscanner;
import java.util.Scanner;
/**
 *
 * @author U134713
 */
public class MyScanner {
    public static void main(String[] args) {
        String name = "";
        int age = 0;
        // int numComputers = 0:
        // String hometown = "";
        
        // Declare and initialize the Scanner object, the Scanner needs input from the console
        Scanner MyScanner = new Scanner(System.in);
        
        // ask the user to input their name
        System.out.println("Please enter your name:");
        // Now wait until the user types something in - put the value in name
        name = MyScanner.nextLine();
        
        // Ask the user to input their age:
        System.out.println("Please enter your age:");
        //now wait until the user enters their age:
        age = MyScanner.nextInt();
        
         
        
        // ask the user to input their hometown
        System.out.println("Please enter your hometown: ");
        // Now wait until the user types something in - put the value in name
        String hometown = MyScanner.nextLine();
        MyScanner.nextLine();
        
        // Ask the user to input their number of computers:
        System.out.println("Please enter your number of computers: ");
        //now wait until the user enters their number of computers:
        int numComputers = MyScanner.nextInt();
        
        // We will get the values in the next listing!
        
        //print the instructions to the console
        System.out.println("Hi " + name + " from " + hometown);
        System.out.println("Your age is : " + age);
        System.out.println("Number of computers: " + numComputers);
        
    }
}
