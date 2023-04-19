/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.java;

/**
 *
 * @author somiah311
 */
public class Course {
    int id;
    String name;
    double gpa;

    public Course(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    
}
    public int howManyHoursCanRegister() {
        int value = 0;
        if (gpa > 4) {
            value = 18;
        } else if (gpa > 3) {
            value = 16;
        } else if (gpa > 2) {
            value = 12;
        }

        return value;
    }
}
