/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.whatmonthisit;
import java.util.Scanner;

/**
 *
 * @author Tom Hubbard
 */
public class WhatMonthIsIt {
    public static void main(String[] args) {
        //int value = 0;
        Scanner myMonth = new Scanner(System.in);
        System.out.println("Please enter a number");
        int month = myMonth.nextInt();  // Read user input
        
        
        
        switch (month) {
            case 1:
                System.out.println("Month is January");
                break;  
            case 2:
                System.out.println("Month is Feburary");
                break;
            case 3:
                System.out.println("Month is March");
                break;
            case 4:
                System.out.println("Month is April");
                break;
            case 5:
                System.out.println("Month is May");
                break;
            case 6:
                System.out.println("Month is June");
                break;
            case 7:
                System.out.println("Month is July");
                break;
            case 8:
                System.out.println("Month is August");
                break;
            case 9:
                System.out.println("Month is September");
                break;
            case 10:
                System.out.println("Month is October");
                break;
            case 11:
                System.out.println("Month is November");
                break;
            case 12:
                System.out.println("Month is December");
                break;
            default:
                throw new AssertionError("Not a valid month");
        }
    }
}
