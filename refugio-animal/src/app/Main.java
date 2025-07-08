package app;

import modelo.Animal;
import animales.Perro;
import animales.Gato;

public class Main {
    public static void main(String[] args) {
        // 5.1 Creamos un objeto de tipo Animal
        Animal animal1 = new Animal("Animal", "Perro", 1);
        animal1.mostrarInformacion();
        animal1.hacerSonido();

        /*
         * Salida esperada:
         * Nombre: Animal
         * Especie: Perro
         * Edad: 1 años
         * Animal hace un sonido genérico.
         */

        System.out.println("\n---\n");

        // 5.2 Creamos un objeto de tipo Gato
        Gato gato1 = new Gato("Michi", 3);
        gato1.mostrarInformacion(); // metodo heredado
        gato1.hacerSonido();        // metodo sobrescrito

        /*
         * Salida esperada:
         * Nombre: Michi
         * Especie: Gato
         * Edad: 3 años
         * Michi dice: ¡Miau! 🐱
         */

        System.out.println("\n---\n");

        // 5.3 Creamos un objeto de tipo Perro
        Perro perro1 = new Perro("Firulais", 5);
        perro1.mostrarInformacion(); // metodo heredado
        perro1.hacerSonido();        // metodo sobrescrito

        /*
         * Salida esperada:
         * Nombre: Firulais
         * Especie: Perro
         * Edad: 5 años
         * Firulais dice: ¡Guau! 🐶
         */


        System.out.println("====================");

        //Uso de sobrecarga
        perro1.alimentar();
        perro1.alimentar("carnes");
        perro1.alimentar("carnes", 3);


    }
}