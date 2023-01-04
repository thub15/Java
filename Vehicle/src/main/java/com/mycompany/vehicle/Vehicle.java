/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vehicle;

/**
 *
 * @author U134713
 * add a parameterized method that computes the fuel required for a given distance
 */
class Vehicle {

    int passengers; // number of passengers
    int fuelcap; // fuel capacity in gallons
    int mpg; // fuel consumption in miles per gallon
    
    // This is a constructor for Vehicle
    // The constructor seems to provide a place where one can pre define how an object
    // should be made. 
    // So, a Vehicle object will contain 3 items, and it tell us that each three or the items will be int
    public Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }
    
    
    int range() {
        //System.out.println("Range is " + fuelcap * mpg);
        return mpg * fuelcap;
        }
    // Compute the fuel needed for a given distance
    // the miles 252 value is brought in from the minivan object
    // then it returns a double value from the calculation of miles (252) divided by the mpg value brought in by the minivan object.
        double fuelNeeded(int miles) {
            return (double) miles / mpg;
        }

    }
    

