/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beverage;

/**
 *
 * @author PC
 */
public class DarkRoast implements IBeverage {

    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    @Override
    public double getCost() {
        return 45.0;
    }

}
