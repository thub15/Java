/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.healthyhearts;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Tom Hubbard
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        Scanner ageReader = new Scanner(System.in);
        int age;
        int heartRate;
        int maxHeartRateForAge;
        double targetHeartRateLower;
        double targetHeartRateUpper;
        
        System.out.println("What is your age?");
        age = ageReader.nextInt();
        maxHeartRateForAge = (220 - age);
        
        targetHeartRateLower = (maxHeartRateForAge / 2);
        targetHeartRateUpper = (maxHeartRateForAge * .85);
        
        System.out.println("Your maximum heart rate should be " + maxHeartRateForAge + " beats per minute");
        System.out.println("Your target HR zone is " + targetHeartRateLower + " - " + Math.round(targetHeartRateUpper) + " per minute");
        
        
        
        
    }
}
