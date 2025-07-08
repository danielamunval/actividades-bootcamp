import javax.swing.*;
import java.util.Scanner;

public class CineApp {
    public static void main(String[] args) {
        //Inicializo y declaro variables iniciales e instancia de Scanner para interacción de usuario por consola.
        Scanner teclado = new Scanner(System.in);
        String nombreUsuarioComprador = "usuario";
        int edadUsuarioComprador = 0;
        int cantidadDeEntradas = 0;
        double precioEntradaNormal = 3500;

        //Inicio programa, solicitud de nombre y edad.
        System.out.println("***     CINE     ***");
        System.out.println("¡Hola! Bienvenido/a al Cine, ¿cuál es su nombre?");
        nombreUsuarioComprador = teclado.nextLine();

        System.out.println("\n¡Bienvenido/a! " + nombreUsuarioComprador + ", por favor, ingrese su edad:");
        edadUsuarioComprador = teclado.nextInt();

        // Verificación de edad dentro de rango lógico.
        while (edadUsuarioComprador < 0 || edadUsuarioComprador > 100) {
            System.out.println("La edad registrada no corresponde, favor intente nuevamente");
            System.out.println("¿Cuál es su edad?");
            edadUsuarioComprador = teclado.nextInt();
        }

        // Cálculo descuentos, según condiciones solicitadas
        if (edadUsuarioComprador < 5) {
            double precioMenorCincoAnios = precioEntradaNormal * 0.4; // Descuento del 60%
            System.out.println("\n¡Genial! Posee un descuento activo del 60%. \nEl valor a pagar por la entrada es de $ " + precioMenorCincoAnios);

        } else if (edadUsuarioComprador > 60) {
            double precioMayorSesentaAnios = precioEntradaNormal * 0.45; // Descuento del 55%
            System.out.println("\n¡Genial! Posee un descuento activo del 55%. \nEl valor a pagar por la entrada es de $ " + precioMayorSesentaAnios);

            //Declaración valor precio normal, cálculo descuentos según cantidad de entradas compradas.
        } else {
            System.out.println("\n¡Oh no! Actualmente no posee descuentos activados, el valor de la entrada es de $ " + precioEntradaNormal);
            System.out.println("¿Cuántas entradas desea comprar?");
            cantidadDeEntradas = teclado.nextInt();

            if (cantidadDeEntradas >= 2) {
                double descuentoCantidad = precioEntradaNormal * 0.7;
                double precioFinal = cantidadDeEntradas * descuentoCantidad;
                System.out.println("\n¡Genial! Por la cantidad de entradas solicitadas recibe un descuento del 30%");
                System.out.println("\nEl valor total a pagar es de $ " + precioFinal);
            } else {
                System.out.println("\nEl valor total a pagar es de $ " + precioEntradaNormal);
            }

        }

        teclado.close();
    }

}
