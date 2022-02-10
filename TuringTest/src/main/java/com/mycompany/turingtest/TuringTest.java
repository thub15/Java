/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.turingtest;
import java.util.Scanner;

/**
 *
 * @author U134713
 */
public class TuringTest {
    public static void main(String[] args) {
       
        Scanner inputReader = new Scanner(System.in);
        
        String name;
        String AIname = "HAL";
        String favColor;
        String favFood;
        int favNumber;
        int favNumberMinusOne;
        
        System.out.println("What is your name?");
        name = inputReader.nextLine();
        
        System.out.println("Hi, " + name + "!" + " " + "My name is" + " " + AIname);
        
        System.out.println("What is your favorite color?");
        favColor = inputReader.nextLine();
        System.out.println("By the way, you told me that your favorite color is " + favColor);
        
        System.out.println("What is your favorite food?");
        
        favFood = inputReader.nextLine();
        System.out.println("You just told me that your favorite food is " + favFood);
        
        System.out.println("What is your favorite number?");
        
        favNumber = inputReader.nextInt();
        
        System.out.println("Your favorite number is " + favNumber);
        favNumberMinusOne = favNumber - 1;
        
        System.out.println("Let's do a " + favNumberMinusOne + ", and I'll owe you one! LOL");
        
        System.out.println("Well, thanks for talking to me, " + name);
        
        
        
        
        
        
    }
}
