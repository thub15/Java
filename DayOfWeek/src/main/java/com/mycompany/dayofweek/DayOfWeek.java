/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dayofweek;

/**
 *
 * @author Tom Hubbard
 */
public class DayOfWeek {
    public static void main(String[] args) {
        int day = 5;
        String dayName = "";
                
                if (day == 1){
                    dayName = "Monday";
                } else if (day == 2) {
                    dayName = "Tuesday";
                }       else if (day == 3) {
                        dayName = "Wednesday";
                }           else if (day == 4) {
                            dayName = "Thursday"; 
                }               else if (day == 5) {
                                dayName = "Friday";
                }
                
                
                
                /*
                if (day == 2) {
                    dayName = "Tuesday";
                }
                if (day == 3) {
                    dayName = "Wednesday";
                }
                if (day == 4) {
                    dayName = "Thursday";
                }
                if (day == 5) {
                    dayName = "Friday";
                }
                */
                System.out.println("WooHoo! The day of the week is: " + dayName);

                
    }
}
