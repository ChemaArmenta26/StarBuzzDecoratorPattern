/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beverage;

/**
 *
 * @author PC
 */
public class Expresso implements IBeverage {

    @Override
    public String getDescription() {
        return "Expresso Coffee";
    }

    @Override
    public double getCost() {
        return 36.0;
    }
    
}
