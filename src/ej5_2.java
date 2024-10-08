import java.util.Random;
import java.util.Scanner;

/*
Ejercicio 5: Juego de Piedra, Papel o Tijera
Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
elige una opción al azar y determina quién gana. Imprime el resultado del juego.
 */
public class ej5_2 {
    public static String verificar_jugada(int opcion, int random){
        if(opcion == 1){
            if(random == 2){
                return "Piedra vs Papel \nCPU gana!";
            }
            else if(random == 3){
                return "Piedra vs Tijera \nTu ganas!";
            }
            else return "Piedra vs Piedra \nEmpate!";
        }
        else if(opcion == 2){
            if(random == 1){
                return "Papel vs Piedra \nTu ganas!";
            }
            else if(random == 3){
                return "Papel vs Tijera \nCPU gana!";
            }
            else return "Papel vs Papel \nEmpate!";
        }
        else{
            if(random == 1){
                return "Tijera vs Piedra \nCPU gana!";
            }
            else if(random == 2){
                return "Tijera vs Papel \nTu ganas!";
            }
            else return "Tijera vs Tijera \nEmpate!";
        }
    }
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        try{
            int op = 0;
            while(op < 1 || op > 3) {
                System.out.print("Ingrese una opcion: \n1. Piedra \n2. Papel \n3. Tijera \nSu opción: ");
                op = sc.nextInt();
            }
            System.out.println(verificar_jugada(op, rand.nextInt(3)+1));
        } catch(Exception e){
            System.out.println("Error: " +e);
        }
    }
}