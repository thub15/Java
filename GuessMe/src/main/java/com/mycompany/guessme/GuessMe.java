/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessme;
import java.util.Scanner;

/**
 *
 * @author Tom Hubbard
 */
public class GuessMe {
    public static void main(String[] args) {
        int correctGuess = 30;
        
        Scanner userNumberHolder = new Scanner(System.in);
        System.out.println("Please enter your guess");
        int userGuess = userNumberHolder.nextInt();
        
        
        
        System.out.println("I've chosen " + correctGuess);
        //System.out.println("Your guess is " + userGuess);
        
         
            if (userGuess == correctGuess)
        {
            System.out.println("Your guess of " + userGuess + " is correct!");
        } else if (userGuess < correctGuess) {
            System.out.println("Your guess of " + userGuess + " is too low");
        } else {
            System.out.println(" Your guess of " + userGuess + " is too high");
        }
                 
        
        
        
        
    }
}
