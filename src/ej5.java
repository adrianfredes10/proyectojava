/*
Ejercicio 5: Calculadora de Costo de Viaje
Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje.
 */

import java.util.Scanner;

public class ej5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la distancia del viaje en kilometros: ");
        float distancia = sc.nextFloat();
        System.out.println("Ingrese el consumo en litros por kilometro: ");
        float consumo = sc.nextFloat();
        System.out.println("Ingrese el precio del combustible por litro: ");
        float precio = sc.nextFloat();
        double costo_total = distancia * consumo * precio;
        System.out.println("El costo total es: " + costo_total);
    }
}