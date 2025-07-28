package J3_Condicionales.Validador;

import java.util.Scanner;

public class Ejercicio_Validador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;
        int saldo;

        System.out.println("** VERIFICADOR SITIO APUESTAS **");
        System.out.println("Por favor, ingresa tu edad: ");
        edad = scanner.nextInt();

        if (edad >= 18) {
            System.out.println("Ingresa tu saldo inicial $: ");
            saldo = scanner.nextInt();
            if (saldo >= 50) {
                System.out.println("Tu registro ha sido exitoso.");
            } else {
                System.out.println("No posees saldo suficiente para continuar con el registro. El mínimo es $50.");
            }

        } else {
            System.out.println("La edad ingresada corresponde a un menor de edad. El registro no puede continuar.");
        }

        scanner.close();
    }
}
