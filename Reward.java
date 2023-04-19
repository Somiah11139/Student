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
public class Reward {
    double GPA;
    boolean Reward;

    public boolean canTakeReward() {
        boolean value = false;
        if (GPA > 2) {
            value = true;
        } else {
            value = false;
        }

        return value; }
}

