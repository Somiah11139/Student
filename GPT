package com.mycompany.java;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = input.nextLine();
        System.out.println("Enter student id");
        int id = input.nextInt();
        System.out.println("Enter student gpa");
        double gpa = input.nextDouble();

        Course course = new Course(id, name, gpa);
        int hours = course.howManyHoursCanRegister();
        System.out.println("students can register " + hours + " hour");
        Reward reward = new Reward();
        reward.GPA = gpa;
        boolean can = reward.canTakeReward();
        if (can) {
            System.out.println("student will take the reword");
        } else {
            System.out.println("student will NOT take the reword");

        }
    }
}


    


