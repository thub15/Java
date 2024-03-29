/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.questfortheuserinput;
import java.util.Scanner;
/**
 *
 * @author Tom Hubbard
 */
public class QuestForTheUserInput {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        // We can use the scanner readLine to assign value to our strings
        //because it's return type is string
        System.out.println("What is your name?? ");
        yourName = inputReader.nextLine();
        
        System.out.println("What is your quest?! ");
        yourQuest = inputReader.nextLine();
        
        // When we get to our double data type, we can use the Scanner's
        //nextDouble method
        //or we can use the Double.parse.Double to convert the nextLine's String
        
        System.out.println("What is the airspeed of an unladen swallow?!?! ");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        System.out.println();
        System.out.println("How do you know " + velocityOfSwallow + " is correct," + yourName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds and instead go " + yourQuest + ".");
    }
}
