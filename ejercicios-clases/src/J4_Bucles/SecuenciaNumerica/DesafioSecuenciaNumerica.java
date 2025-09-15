package J4_Bucles.SecuenciaNumerica;

public class DesafioSecuenciaNumerica {
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
