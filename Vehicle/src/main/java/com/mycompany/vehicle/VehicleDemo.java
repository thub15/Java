/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicle;

/**
 *
 * @author U134713
 */
class VehicleDemo {
    public static void main(String[] args) {
        // This is calling the constructor to create a new Vehicle object, with the three predefined values.
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);
        double gallons;
        int dist = 252;
        
        /*
        // assign values to fields in minivan
        minivan.passengers = 7;
        minivan.fuelcap = 16;
        minivan.mpg = 21;
        
        //assign values to fields in sportscar
        sportscar.passengers = 2;
        sportscar.fuelcap = 14;
        sportscar.mpg = 12;
        
        // get the ranges
        //range1 = minivan.range();
        //range2 = sportscar.range();
        */
        
        gallons = minivan.fuelNeeded(dist);
    // compute the range assuming a full tank of gas
        //range = minivan.fuelcap * minivan.mpg;
        System.out.println("To go " + dist + " miles, the minivan needs " + gallons + " gallons of fuel");
        //System.out.println("Minican can carry " + minivan.passengers + " with a range of " + range1 + " miles.");
        minivan.range();
        
        //System.out.println("Sportscar can carry " + sportscar.passengers + " with a range of " + range2 + " miles.");
        sportscar.range();
    }
    }
