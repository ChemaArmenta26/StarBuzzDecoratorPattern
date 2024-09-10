/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beverage;

/**
 * La clase Decaf representa una bebida de tipo "Decaf Coffee". Implementa la
 * interfaz IBeverage. Se establece la descripcion y el costo de esta bebida
 *
 * @author José María Armenta Baca
 */
public class Decaf implements IBeverage {

    /**
     * Devuelve la descripción de la bebida Decaf Coffee.
     *
     * @return una cadena que describe la bebida.
     */
    @Override
    public String getDescription() {
        return "Decaf Coffee";
    }

    /**
     * Devuelve el costo de la bebida Decaf Coffee.
     *
     * @return el costo de la bebida.
     */
    @Override
    public double getCost() {
        return 30.0;
    }

}
