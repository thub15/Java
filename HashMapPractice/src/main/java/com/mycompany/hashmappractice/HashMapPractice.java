/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hashmappractice;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author Tom Hubbard
 */
public class HashMapPractice {
    public static void main(String[] args) {
        Map<String, Integer> populations = new HashMap<>();
        
        populations.put("USA", 52000);
        populations.put("Canada", 100000);
        populations.put("United Kingdom",65000);
        populations.put("Japan",450000);
        // update the USA
        populations.put("USA", 200000);
        
        System.out.println("Map size is: " + populations.size());
        
        Integer japanPopulation = populations.get("Japan");
        System.out.println("The population of Japan is: " + japanPopulation);
        
        Integer usaPopulation = populations.get("Mexico");
        System.out.println("The population of Mexico is: " + usaPopulation);
        
        Integer ASDFPopulation = populations.get("ASDF");
        System.out.println("The population of ASDF is: " + ASDFPopulation);
        
        // get the set of keys from the map
        Set <String> keys = populations.keySet();
        // pring the set of keys to the screen
        for (String k : keys) {
            System.out.println(k);
        }
    }
}
