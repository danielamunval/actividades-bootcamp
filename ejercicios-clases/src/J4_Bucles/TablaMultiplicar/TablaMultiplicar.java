package J4_Bucles.TablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroTabla;
        int multiplicador = 1;

        System.out.println("** Tabla de Multiplicar **");
        System.out.println("Ingresa el número del cual quieres la tabla (1 - 12): ");
        numeroTabla = scanner.nextInt();

        while (numeroTabla >= 12 || numeroTabla < 1) {
            System.out.println("Has ingresado un número incorrecto, intenta nuevamente, ingresando un número entre 1 y 12: ");
            numeroTabla = scanner.nextInt();
        }

        System.out.println("\nTabla del " + numeroTabla + ":");
        while(multiplicador <= 10){
            System.out.println(numeroTabla + " x " + multiplicador + " = " + (numeroTabla * multiplicador));
            multiplicador++;
        }

        scanner.close();
    }
}
