/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.starbuzzcoffee;

import com.mycompany.beverage.DarkRoast;
import com.mycompany.beverage.Expresso;
import com.mycompany.beverage.HouseBlend;
import com.mycompany.beverage.IBeverage;
import com.mycompany.beverage.Decaf;
import com.mycompany.condiment.Chocolate;
import com.mycompany.condiment.Milk;
import com.mycompany.condiment.Soy;
import com.mycompany.condiment.WhippedCream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<IBeverage> bebidas = new ArrayList<>();
        boolean seguir = true;

        /**
         * Bucle que permite a los usuarios seguir agregando bebidas hasta que
         * decidan finalizar el pedido.
         */
        while (seguir) {
            IBeverage beverage = elegirBebida(scanner);
            beverage = agregarCondimentos(scanner, beverage);

            bebidas.add(beverage); // Agregar la bebida a la lista de pedidos

            System.out.println("¿Deseas agregar otra bebida? (s/n)");
            String respuesta = scanner.next();

            if (!respuesta.equalsIgnoreCase("s")) {
                seguir = false;
            }
        }

        // Mostrar el resumen de todas las bebidas ordenadas y el costo total.
        mostrarResumen(bebidas);
        System.out.println("Gracias por tu pedido.");
    }

    /**
     * Este método permite al usuario seleccionar una bebida del menú
     * disponible.
     *
     * @param scanner el objeto Scanner para capturar la entrada del usuario.
     * @return una instancia de IBeverage que representa la bebida seleccionada.
     */
    public static IBeverage elegirBebida(Scanner scanner) {
        System.out.println("Elige una bebida:");
        System.out.println("1. House Blend");
        System.out.println("2. Dark Roast");
        System.out.println("3. Expresso");
        System.out.println("4. Decaf");

        int eleccion = scanner.nextInt();
        IBeverage beverage = null;

        switch (eleccion) {
            case 1:
                beverage = new HouseBlend();
                break;
            case 2:
                beverage = new DarkRoast();
                break;
            case 3:
                beverage = new Expresso();
                break;
            case 4:
                beverage = new Decaf();
                break;
            default:
                System.out.println("Opción no válida. Seleccionando House Blend por defecto.");
                beverage = new HouseBlend();
        }

        return beverage;
    }

    /**
     * Este método permite al usuario agregar condimentos a la bebida
     * seleccionada.
     *
     * @param scanner el objeto Scanner para capturar la entrada del usuario.
     * @param beverage la bebida a la cual se le agregarán los condimentos.
     * @return una instancia de IBeverage que representa la bebida con los
     * condimentos agregados.
     */
    public static IBeverage agregarCondimentos(Scanner scanner, IBeverage beverage) {
        boolean agregarCondimentos = true;

        while (agregarCondimentos) {
            System.out.println("Elige un condimento:");
            System.out.println("1. Leche");
            System.out.println("2. Leche de soya");
            System.out.println("3. Crema batida");
            System.out.println("4. Chocolate");
            System.out.println("5. Ninguno (finalizar)");

            int eleccion = scanner.nextInt();

            switch (eleccion) {
                case 1:
                    beverage = new Milk(beverage);
                    break;
                case 2:
                    beverage = new Soy(beverage);
                    break;
                case 3:
                    beverage = new WhippedCream(beverage);
                    break;
                case 4:
                    beverage = new Chocolate(beverage);
                    break;
                case 5:
                    agregarCondimentos = false;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        return beverage;
    }

    /**
     * Muestra el resumen del pedido final, las bebidas y sus costos, así como
     * el costo total del pedido.
     *
     * @param bebidas la lista de bebidas ordenadas por el usuario.
     */
    public static void mostrarResumen(List<IBeverage> bebidas) {
        double total = 0.0;

        System.out.println("\nResumen de tu pedido:");
        for (IBeverage bebida : bebidas) {
            System.out.println("- " + bebida.getDescription() + ": $" + bebida.getCost());
            total += bebida.getCost();
        }

        System.out.println("Total: $" + total);
    }
}
