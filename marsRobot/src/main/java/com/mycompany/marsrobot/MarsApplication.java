/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.marsrobot;

/**
 *
 * @author U134713
 */
public class MarsApplication {
    public static void main(String[] args) {
        marsRobot spirit = new marsRobot();
        spirit.status = "exploring";
        spirit.speed = 2;
        spirit.temperature = -60;
        
        marsRobot opportunity = new marsRobot();
        opportunity.status = "exploring";
        opportunity.speed = 2;
        opportunity.temperature = -60;
        
        System.out.println("Start Spirit status");
        spirit.showAttributes();
        System.out.println("Spirit reporting easy going, increasing speed to 3.");
        spirit.speed = 3;
        System.out.println("End Spirit status");
        System.out.println("                                             ");
        
        System.out.println("Opportunity start status");
        opportunity.showAttributes();
        System.out.println("                                             ");
        System.out.println("Opportunity reporting tough going, descreasing speed to 1.");
        opportunity.speed = 1;
        opportunity.showAttributes();
        System.out.println("End Opportunity status");
        System.out.println("                                             ");
        
        System.out.println("Oh no, cold front moving in! Temp dropping to -90");
        spirit.temperature = -90;
        spirit.showAttributes();
        System.out.println("Checking the temp.");
        spirit.checkTemperature();
        spirit.showAttributes();
    }
}
