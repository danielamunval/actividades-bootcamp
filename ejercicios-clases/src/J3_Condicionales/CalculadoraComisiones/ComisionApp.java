package J3_Condicionales.CalculadoraComisiones;

import java.util.Scanner;

public class ComisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalVentas;

        System.out.println("** CALCULADORA COMISIONES **");
        System.out.print("Por favor, ingresa tu total de ventas: ");
        totalVentas = scanner.nextDouble();

        if (totalVentas > 0) {
            if (totalVentas >= 100000) {
                double comision30 = totalVentas * 0.3;
                System.out.println("Tienes una comisión del 30%. Tu total de ventas es: " + totalVentas + " y tu comisión es: $" + comision30);
            } else if (totalVentas >= 50001 && totalVentas <= 99999) {
                double comision20 = totalVentas * 0.2;
                System.out.println("Tienes una comisión del 20%. Tu total de ventas es: " + totalVentas + " y tu comisión es: $" + comision20);
            } else if (totalVentas >= 10000 && totalVentas <= 49999) {
                double comision10 = totalVentas * 0.1;
                System.out.println("Tienes una comisión del 10%. Tu total de ventas es: " + totalVentas + " y tu comisión es: $" + comision10);
            } else {
                System.out.println("No aplican descuentos en ventas inferiores a 10000.");
            }
        } else {
            System.out.println("Valor ingresado no válido, por favor intenta nuevamente.");
        }

        scanner.close();
    }
}
