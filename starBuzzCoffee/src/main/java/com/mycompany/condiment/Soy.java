/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condiment;

import com.mycompany.beverage.IBeverage;

/**
 *
 * @author PC
 */
public class Soy extends CondimentDecorator {

    public Soy(IBeverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double getCost() {
        return beverage.getCost() + 3.0;
    }

}
