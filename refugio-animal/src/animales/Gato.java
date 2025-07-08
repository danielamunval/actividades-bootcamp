package animales;

import modelo.Animal;

//Sublcase que extiende de Animal
public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, "Gato", edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Miau! 🐱");
    }

}
