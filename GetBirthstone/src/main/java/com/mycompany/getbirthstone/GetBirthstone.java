/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.getbirthstone;
import java.util.Scanner;

/**
 *
 * @author Tom Hubbard
 */
public class GetBirthstone {
    public static void main(String[] args) {
        Scanner enterBirthMonth = new Scanner(System.in);
        System.out.println("Enter your birth month as a number");
        int month = enterBirthMonth.nextInt();
                //int userGuess = userNumberHolder.nextInt();
        System.out.println("Your entered " + month);
        
        switch (month) {
            case 1:
                System.out.println("Month is January, and your gemstone is Garnet");
                break;  
            case 2:
                System.out.println("Month is Feburary, and your gemstone is Amethyst");
                break;
            case 3:
                System.out.println("Month is March, and your gemstone is Aquamarine");
                break;
            case 4:
                System.out.println("Month is April, and your gemstone is Diamond");
                break;
            case 5:
                System.out.println("Month is May, and your gemstone is Emerald");
                break;
            case 6:
                System.out.println("Month is June Pearl");
                break;
            case 7:
                System.out.println("Month is July, and your gemstone is Ruby");
                break;
            case 8:
                System.out.println("Month is August, and your gemstone is Peridot");
                break;
            case 9:
                System.out.println("Month is September, and your gemstone is Sapphire");
                break;
            case 10:
                System.out.println("Month is October, and your gemstone is Opal");
                break;
            case 11:
                System.out.println("Month is November, and your gemstone is Topaz");
                break;
            case 12:
                System.out.println("Month is December, and your gemstone is Turquoise");
                break;
            default:
                
       
                
                throw new AssertionError("Not a valid month");
        }
        
        
        
    }
}
