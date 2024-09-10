/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condiment;

import com.mycompany.beverage.IBeverage;

/**
 * La clase Soy es un decorador que añade leche de soya a una bebida. Extiende
 * CondimentDecorator.
 *
 * @author José María Armenta Baca
 */
public class Soy extends CondimentDecorator {

    /**
     * Constructor que recibe una bebida a la cual se le añadirá leche de soya.
     *
     * @param beverage una instancia de IBeverage a la cual se le agregará leche
     * de soya.
     */
    public Soy(IBeverage beverage) {
        super(beverage);
    }

    /**
     * Devuelve la descripción de la bebida junto con el condimento de leche de
     * soya.
     *
     * @return una cadena que describe la bebida con leche de soya.
     */
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    /**
     * Devuelve el costo de la bebida junto con el costo adicional de la leche
     * de soya.
     *
     * @return el costo total de la bebida con leche de soya.
     */
    @Override
    public double getCost() {
        return beverage.getCost() + 3.0;
    }
}
