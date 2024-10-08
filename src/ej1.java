/*
Ejercicio 1: Generador de Horóscopo
Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.
 */


import java.util.Scanner;

public class ej1 {
    static String Aries = ("Por fin encontrará el camino para cambiar su estilo de vida, lo que le hará sentir maravillosamente en todo lo que emprenda. No tenga miedo y hágalo.");
    static String Tauro = ("Prepárese, ya que su vida social tomará un giro positivo con la llegada de nuevos compromisos. Su entusiasmo se potenciará al máximo, así que aprovéchelo al máximo.");
    static String Geminis = ("Transitará un día un tanto complicado, ya que podrían surgir cambios que no estaban contemplados en sus responsabilidades. No se desespere, actúe con cautela y calma.");
    static String Cancer = ("Evite hacer las cosas con apuro. La prisa y la desesperación no garantizan resultados. Relájese y proceda con cuidado en todo lo que emprenda.");
    static String Leo = ("Es probable que necesite reflexionar sobre los inconvenientes recientes. Podrá identificar dudas que le impiden encontrar soluciones claras y avanzar.");
    static String Virgo = ("Recuerde que el éxito no dependerá solo de lo que diga. En este momento, su imagen personal será fundamental para destacarse en todo lo que haga.");
    static String Libra = ("Prepárese para un día lleno de contradicciones en lo que haga, lo que podría generarle desorientación. Si surge algún problema, mantenga la calma y no desespere.");
    static String Escorpio = ("Aproveche al máximo su vitalidad, ya que tendrá un día lleno de movimientos y sorpresas. Mantenga una actitud positiva y verá cómo logra sobrellevar cada situación de manera exitosa.");
    static String Sagitario = ("Esta semana, contará con toda la energía para hacer lo que desee, pero antes de avanzar, es importante que defina qué es lo que realmente quiere para su vida en este momento.");
    static String Capricornio = ("Aunque la mañana pueda empezar complicada, todo se resolverá a medida que avance el día. Relájese, ya que encontrará soluciones para cada problema que surja.");
    static String Acuario = ("Es probable que no esté atravesando su mejor momento, pero tenga paciencia. Pronto llegará una satisfacción que compensará las dificultades.");
    static String Piscis = ("Es un momento propicio para reordenar sus fuerzas internas. Comprenda que no es conveniente malgastar energías en asuntos que aún no domina completamente.");

    public static void horoscopo(int dia, int mes){
        if ((dia >= 21 && dia <= 31 && mes == 3) || dia > 0 && dia <= 20 && mes == 4 ){
            System.out.println("Aries: " + Aries);
        }
        else if ((dia >= 21 && dia <= 30 && mes == 4) || dia > 0 && dia <= 21 && mes == 5 ){
            System.out.println("Tauro: " + Tauro);
        }
        else if ((dia >= 22 && dia <= 31 && mes == 5) || dia > 0 && dia <= 21 && mes == 6 ){
            System.out.println("Geminis: " + Geminis);
        }
        else if ((dia >= 22 && dia <= 30 && mes == 6) || dia > 0 && dia <= 23 && mes == 7 ){
            System.out.println("Cancer: " + Cancer);
        }
        else if ((dia >= 24 && dia <= 31 && mes == 7) || dia > 0 && dia <= 23 && mes == 8 ){
            System.out.println("Leo: " + Leo);
        }
        else if ((dia >= 24 && dia <= 31 && mes == 8) || dia > 0 && dia <= 23 && mes == 9 ){
            System.out.println("Virgo: " + Virgo);
        }
        else if ((dia >= 24 && dia <= 30 && mes == 9) || dia > 0 && dia <= 23 && mes == 10 ){
            System.out.println("Libra: " + Libra);
        }
        else if ((dia >= 24 && dia <= 31 && mes == 10) || dia > 0 && dia <= 22 && mes == 11 ){
            System.out.println("Escorpio: " + Escorpio);
        }
        else if ((dia >= 23 && dia <= 30 && mes == 11) || dia > 0 && dia <= 22 && mes == 12 ){
            System.out.println("Sagitario: " + Sagitario);
        }
        else if ((dia >= 23 && dia <= 31 && mes == 12) || dia > 0 && dia <= 20 && mes == 1 ){
            System.out.println("Capricornio: " + Capricornio);
        }
        else if ((dia >= 21 && dia <= 31 && mes == 1) || dia > 0 && dia <= 19 && mes == 2 ){
            System.out.println("Acuario: " + Acuario);
        }
        else if ((dia >= 20 && dia <= 28 && mes == 2) || dia > 0 && dia <= 20 && mes == 3 ){
            System.out.println("Piscis: " + Piscis);
        }
        else System.out.println("Fecha invalida.");
    }
    public static void main(String[] args) {
        int dia = 0, mes = 0, anio = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento en formato DD/MM/AAAA: ");
        String fecha = sc.nextLine();
        try{
            dia = Integer.parseInt((fecha.split("/")[0]));
            mes = Integer.parseInt((fecha.split("/")[1]));
            anio = Integer.parseInt((fecha.split("/")[2]));
        } catch (Exception e){
            System.out.println("Formato invalido, error: " + e);
        }
        if (dia > 0 && dia <= 31){
            if (mes > 0 && mes <= 12){
                if (anio > 0){
                    horoscopo(dia, mes);
                } else System.out.println("Año invalido");
            } else System.out.println("Mes invalido");
        } else System.out.println("Dia invalido");
    }
}