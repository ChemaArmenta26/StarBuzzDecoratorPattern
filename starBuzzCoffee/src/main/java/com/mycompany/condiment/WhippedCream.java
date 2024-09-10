/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condiment;

import com.mycompany.beverage.IBeverage;

/**
 * La clase WhippedCream es un decorador que añade crema batida a una bebida.
 * Extiende CondimentDecorator.
 *
 * @author José María Armenta Baca
 */
public class WhippedCream extends CondimentDecorator {

    /**
     * Constructor que recibe una bebida a la cual se le añadirá crema batida.
     *
     * @param beverage una instancia de IBeverage a la cual se le agregará crema
     * batida.
     */
    public WhippedCream(IBeverage beverage) {
        super(beverage);
    }

    /**
     * Devuelve la descripción de la bebida junto con el condimento de crema
     * batida.
     *
     * @return una cadena que describe la bebida con crema batida.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whipped Cream";
    }

    /**
     * Devuelve el costo de la bebida junto con el costo adicional de la crema
     * batida.
     *
     * @return el costo total de la bebida con crema batida.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 4.0;
    }
}
