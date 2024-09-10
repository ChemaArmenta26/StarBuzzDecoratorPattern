/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condiment;

import com.mycompany.beverage.IBeverage;

/**
 * La clase abstracta CondimentDecorator es el decorador para las bebidas.
 * Permite agregar condimentos a cualquier instancia de IBeverage. Las clases
 * que heredan de esta son los condimentos concretos que deben implementar su
 * propia descripción del condimento.
 *
 * @author José María Armenta Baca
 */
public abstract class CondimentDecorator implements IBeverage {

    protected IBeverage beverage;

    /**
     * Constructor que recibe una bebida a la cual se le agregará un condimento.
     *
     * @param beverage una instancia de IBeverage a la cual se le aplicará el
     * decorador.
     */
    public CondimentDecorator(IBeverage beverage) {
        this.beverage = beverage;
    }

    /**
     * Método abstracto que debe ser implementado para agregar la descripción
     * del condimento a la bebida.
     *
     * @return la descripción de la bebida con el condimento.
     */
    @Override
    public abstract String getDescription();
}
