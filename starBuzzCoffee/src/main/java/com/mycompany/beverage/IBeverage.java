/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beverage;

/**
 * La interfaz IBeverage define los métodos básicos que deben implementarse para
 * representar una bebida. Cada bebida debe tener una descripción y un costo.
 *
 * @author Jose Maria Armenta Baca
 */
public interface IBeverage {

    /**
     * Devuelve la descripción de la bebida.
     *
     * @return la descripción de la bebida.
     */
    String getDescription();

    /**
     * Devuelve el costo de la bebida.
     *
     * @return el costo de la bebida.
     */
    double getCost();
}
