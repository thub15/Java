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
        //This is a rectangular array with 4 elements 3,5,2,0
        int[] numbers = new int[]{3,5,2,0};
        
        // This is a regular rectangular array with 4 elements, 0,1,2,3, and each are set to 0 automatically.
        int[] numbers2 = new int[4];
        // This is the same code, just written out as 0,0,0,0
        //Remember to declare the int[] and then add the items inside curly braces
        int[] numbers3 = new int[]{0,0,0,0};
        
        
        //This is the same idea, both array creations create a rectangular array with 2 rows and 3 columns
        int rows = 2;
        int columns = 3;
        int[][] table1 = new int[rows] [columns];
        
        int[][] table2 = new int[2][3];
        
        System.out.println("Starting.....");
        
        for (int ctr = 0; ctr < numbers.length; ctr++) {
            System.out.println("ctr = " + ctr + " Numbers = " + numbers[ctr]);
        }
        
        System.out.println("Done!");
        
        int[] numbers4 = new int[]{0,1,2,3};
        System.out.println("Printing the third item in array");
        System.out.println(numbers2[2]);
        System.out.println("Printing the sum of third and fourth numbers in the array");
        System.out.println(numbers2[2] + numbers2[3]);
    }   
}
