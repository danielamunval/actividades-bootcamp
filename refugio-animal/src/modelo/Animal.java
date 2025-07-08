package modelo;

// Clase base que representa un animal genérico
public class Animal {

    // Atributos comunes a todos los animales
    protected String nombre; // Se usa protected para que los atributos puedan ser usados en subclases pero no accesibles directamente desde clases fuera del modelo.
    protected String especie;
    protected int edad;

    // Constructor
    public Animal(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    // Metodo para mostrar información
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }

    // Metodo genérico que puede ser sobrescrito
    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido genérico.");
    }
}

