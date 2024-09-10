/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beverage;

/**
 * La clase HouseBlend representa una bebida de tipo "House Blend Coffee".
 * Implementa la interfaz IBeverage. Se establece la descripcion y el costo de
 * esta bebida
 *
 * @author José María Armenta Baca
 */
public class HouseBlend implements IBeverage {

    /**
     * Devuelve la descripción de la bebida House Blend Coffee.
     *
     * @return una cadena que describe la bebida.
     */
    @Override
    public String getDescription() {
        return "House Blend Coffee";
    }

    /**
     * Devuelve el costo de la bebida House Blend Coffee.
     *
     * @return el costo de la bebida.
     */
    @Override
    public double getCost() {
        return 38.0;
    }

}
