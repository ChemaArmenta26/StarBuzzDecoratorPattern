/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condiment;

import com.mycompany.beverage.IBeverage;

/**
 * La clase Chocolate es un decorador que añade chocolate a una bebida. Extiende
 * CondimentDecorator.
 *
 * @author José María Armenta Baca
 */
public class Chocolate extends CondimentDecorator {

    /**
     * Constructor que recibe una bebida a la cual se le añadirá chocolate.
     *
     * @param beverage una instancia de IBeverage a la cual se le agregará
     * chocolate.
     */
    public Chocolate(IBeverage beverage) {
        super(beverage);
    }

    /**
     * Devuelve la descripción de la bebida junto con el condimento de
     * chocolate.
     *
     * @return una cadena que describe la bebida con chocolate.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    /**
     * Devuelve el costo de la bebida junto con el costo adicional del
     * chocolate.
     *
     * @return el costo total de la bebida con chocolate.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 5.0;
    }
}
