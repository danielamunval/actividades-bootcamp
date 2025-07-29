package J4_Bucles.SecuenciaNumerica;

public class DesafioSecuenciaNumerica {
    /**
     * ACTIVIDAD:
     * Desarrolla un programa en Java que imprima la siguiente secuencia numérica:
     * 10, 20, 30, 40, 50, 60, 70, 80, 90 y 100
     * Debes implementar la solución de tres maneras diferentes:
     * 1. Utilizando un bucle for
     * 2. Utilizando un bucle while
     * 3. Utilizando un bucle do-while
     * Observación importante:
     * El último número (100) debe estar precedido por la conjunción "y" en lugar de una coma (,).
     * El formato de salida debe ser exactamente como se muestra en el ejemplo.
     **/
    public static void main(String[] args) {

        System.out.println("Secuencia numérica usando bucle 'for': ");
        for (int i = 10; i <= 100; i += 10) {
            if (i < 100) {
                System.out.print(i + ", ");
            } else {
                System.out.print("y " + i);
            }
        }

        System.out.println("\n\nUsando while:");
        int i = 10;
        while (i <= 100) {
            if (i < 100) {
                System.out.print(i + ", ");
            } else {
                System.out.print("y " + i);
            }
            i += 10;
        }

        System.out.println("\n\nUsando do-while:");
        int numero = 10;
        do {
            if (numero < 100) {
                System.out.print(numero + ", ");
            } else {
                System.out.print("y " + numero);
            }
            numero += 10;
        } while (numero <= 100);
    }

}
