/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arrayfun2;

/**
 *
 * @author Tom Hubbard
 */
public class ArrayFun2 {
    public static void main(String[] args) {
        int[] numbers = new int[]{3,5,2,0};
        
        System.out.println("Starting.....");
        
        for (int ctr = 0; ctr < numbers.length; ctr++) {
            System.out.println("ctr = " + ctr + " Numbers = " + numbers[ctr]);
        }
        
        System.out.println("Done!");
        
        int[] numbers2 = new int[]{0,1,2,3};
        System.out.println("Printing the third item in array");
        System.out.println(numbers2[2]);
        System.out.println("Printing the sum of third and fourth numbers in the array");
        System.out.println(numbers2[2] + numbers2[3]);
    }   
}
