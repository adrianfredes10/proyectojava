/*
Ejercicio 2: Calculadora de Descuentos
Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
15% para jubilados. Imprime el precio final después del descuento.
 */

import java.util.Scanner;

public class ej2_2 {
    public static double aplicar_descuento(int opcion, float precio){
        double estudiante = 0.10;
        double adulto = 0.05;
        double jubilado = 0.15;
        return switch (opcion) {
            case 1 -> precio - precio * estudiante;
            case 2 -> precio - precio * adulto;
            case 3 -> precio - precio * jubilado;
            default -> {
                System.out.println("Opcion incorrecta.");
                yield precio;
            }
        };
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Ingrese el precio de su producto: ");
            float precio = sc.nextFloat();
            System.out.print("Ingrese una opcion para su descuento: \n1. Estudiante \n2. Adulto \n3. Jubilado \nSu opción: ");
            int opcion = sc.nextInt();
            System.out.println("Su precio con descuento es: " + aplicar_descuento(opcion, precio));
        } catch (Exception e){
            System.out.println("Error: " + e);
        }
    }
}