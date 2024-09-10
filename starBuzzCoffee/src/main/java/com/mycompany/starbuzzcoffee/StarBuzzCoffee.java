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

        // Al final, mostrar el pedido completo y el costo total
        mostrarResumen(bebidas);
        System.out.println("Gracias por tu pedido.");
    }

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
