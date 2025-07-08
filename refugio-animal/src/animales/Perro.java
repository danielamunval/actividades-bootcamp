package animales;

import modelo.Animal;

//Subclase que extiende de Animal
public class Perro extends Animal {

    // Constructor
    public Perro(String nombre, int edad) {
        super(nombre, "Perro", edad); // Llamamos al constructor del padre
    }

    // Metodo sobrescrito para sonido específico
    @Override
    public void hacerSonido() {
        System.out.println(nombre + " dice: ¡Guau! 🐶");
    }

    //Sobrecarga 1: Este metodo no trae parametro.
    public void alimentar(){
        System.out.println(nombre + " está comiendo croquetas");
    }

    //Sobrecarga 2: Este metodo si trae parámetros
    public void alimentar(String comida) {
        System.out.println(nombre + " está comiendo croquetas de " + comida);
    }

    //Sobrecarga 3: con tipo de comida y cantidad
    public void alimentar(String comida, int cantidad){
        System.out.println(nombre + " está comiendo " + cantidad + " croquetas ");
    }

}
