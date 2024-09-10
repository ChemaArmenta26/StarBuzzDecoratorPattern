/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.beverage;

/**
 * La clase DarkRoast representa una bebida de tipo "Dark Roast Coffee".
 * Implementa la interfaz IBeverage. Se establece la descripcion y el costo de
 * esta bebida
 *
 * @author José María Armenta Baca
 */
public class DarkRoast implements IBeverage {

    /**
     * Devuelve la descripción de la bebida Dark Roast Coffee.
     *
     * @return una cadena que describe la bebida.
     */
    @Override
    public String getDescription() {
        return "Dark Roast Coffee";
    }

    /**
     * Devuelve el costo de la bebida Dark Roast Coffee.
     *
     * @return el costo de la bebida.
     */
    @Override
    public double getCost() {
        return 45.0;
    }

}
