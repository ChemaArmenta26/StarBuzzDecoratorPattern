/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beverage;

/**
 *
 * @author PC
 */
public class HouseBlend implements IBeverage {

    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    @Override
    public double getCost() {
        return 38.0;
    }

}
