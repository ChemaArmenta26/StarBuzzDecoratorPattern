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
public abstract class CondimentDecorator implements IBeverage {

    protected IBeverage beverage;

    public CondimentDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();
}
