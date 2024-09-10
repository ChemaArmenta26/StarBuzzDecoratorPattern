/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condiment;

import com.mycompany.beverage.IBeverage;

/**
 * La clase Milk es un decorador que añade leche a una bebida. Extiende
 * CondimentDecorator.
 *
 * @author José María Armenta Baca
 */
public class Milk extends CondimentDecorator {

    /**
     * Constructor que recibe una bebida a la cual se le añadirá leche.
     *
     * @param beverage una instancia de IBeverage a la cual se le agregará
     * leche.
     */
    public Milk(IBeverage beverage) {
        super(beverage);
    }

    /**
     * Devuelve la descripción de la bebida junto con el condimento de leche.
     *
     * @return una cadena que describe la bebida con leche.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    /**
     * Devuelve el costo de la bebida junto con el costo adicional de la leche.
     *
     * @return el costo total de la bebida con leche.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 2.0;
    }
}
