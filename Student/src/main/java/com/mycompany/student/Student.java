/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.student;

/**
 *
 * @author U134713
 */
    


    public class Student {
       
            
        
    private String firstName;
    private String lastName;
    private String studentID;
    private String cohort; // Java cohort month/year
    
    public Student(String studentID) {
        this.studentID = studentID;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getStudentID() {
        return studentID;
    }
    
    public String getCohort() {
        return cohort;
    }
    
    public void setCohort(String cohort) {
        this.cohort = cohort;
    }
}


