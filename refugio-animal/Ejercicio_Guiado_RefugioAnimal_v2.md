# 🐾 Desafío Guiado en Java: Refugio Animal Avanzado

Este proyecto es un desafío educativo paso a paso que cubre:

- ✅ Condicionales (if, else-if, ternarios)
- 🔁 Bucles (for, while, do-while, foreach)
- 🧺 Collections (`ArrayList`, `Set`, `Map`, `Stream`)
- 👨‍🏫 POO: Herencia, Polimorfismo, Abstracción e Interfaces

---

## 🎯 Enunciado del Desafío

El refugio animal necesita un sistema que permita registrar animales, clasificarlos por edad, emitir sonidos según su especie, llevar historial de cuidados y gestionar quién los atiende.

Todo el sistema debe aplicar buenas prácticas de programación orientada a objetos y estructuras modernas de Java.

---

## 🧱 Parte 1: Estructura Base del Proyecto

### 📦 Crear package
```java
package com.refugioanimal;
```

### 🚪 Clase principal: `RefugioApp.java`
```java
public class RefugioApp {
    public static void main(String[] args) {
        System.out.println("🏠 Bienvenido al sistema del Refugio Animal");
    }
}
```

---

## 🐶 Parte 2: POO con Herencia, Abstracción y Polimorfismo

### 🧩 Clase abstracta `Animal.java`
```java
public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public abstract void emitirSonido();

    public void mostrarInfo() {
        System.out.println("\n📋 Mostrando Información");
        System.out.println(nombre + " tiene " + edad + " años.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
```

### 🐕 Subclase `Perro.java`
```java
public class Perro extends Animal {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("🐶 " + nombre + " dice: ¡Guau!");
    }
}
```

### 🐱 Subclase `Gato.java`
```java
public class Gato extends Animal {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void emitirSonido() {
        System.out.println("🐱 " + nombre + " dice: ¡Miau!");
    }
}
```

### 🔍 Probar desde `RefugioApp`:
```java
Animal firulais = new Perro("Firulais", 3);
Animal michi = new Gato("Michi", 2);

firulais.emitirSonido();
michi.emitirSonido();
```

---

## 🔄 Parte 3: Bucles y Condicionales

> ⚠️ **Importante:** A partir de este punto, no olvides importar las clases necesarias para trabajar con `ArrayList`, `HashMap`, `HashSet`, `Map`, `List`, `Set`, y `Stream`. Usa `import java.util.*;` y `import java.util.stream.*;` cuando sea necesario.


### 📋 Lista de animales (`ArrayList`)
```java
List<Animal> animales = new ArrayList<>();
animales.add(new Perro("Max", 1));
animales.add(new Gato("Luna", 5));
animales.add(new Perro("Rocky", 7));
```

### 🔁 Usar foreach y condicional ternario
```java
for (Animal a : animales) {
    a.mostrarInfo();
    a.emitirSonido();

    // Ternario para clasificar por edad
    String categoria = a.getEdad() < 5 ? "Joven" : "Adulto";
    System.out.println("Categoría: " + categoria);
}
```

---

## 📚 Parte 4: Collections y Stream API

### 📌 Mapa de historial de cuidados
```java
System.out.println("\n🗂️ Historial de cuidados:");
Map<String, String> historialCuidados = new HashMap<>();
historialCuidados.put("Max", "Vacunado");
historialCuidados.put("Luna", "Desparasitada");
historialCuidados.put("Rocky", "Pendiente vacunación");

for (String nombre : historialCuidados.keySet()) {
    System.out.println("🐾 " + nombre + ": " + historialCuidados.get(nombre));
}
```

### 📤 Stream para filtrar animales jóvenes
```java
System.out.print("\n🐾 Animales jóvenes: ");
animales.stream()
        .filter(a -> a.getEdad() < 5)
        .forEach(a -> System.out.println(a.getNombre()));
```

---

## 🧩 Parte 5: Interfaces

### 🧑‍⚕️ Interfaz `Cuidador.java`
```java
public interface Cuidador {
    void cuidar(Animal animal);
}
```

### 🙋 Clase `Voluntario.java` que implementa `Cuidador`
```java
public class Voluntario implements Cuidador {
    private String nombre;

    public Voluntario(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void cuidar(Animal animal) {
        System.out.println("👨‍⚕️ " + nombre + " cuida a " + animal.getNombre());
    }
}
```

### 🧪 Probar en `RefugioApp.java`
```java
Cuidador pedro = new Voluntario("Pedro");
pedro.cuidar(firulais);
```

---

## 🎓 Explicación clave: Polimorfismo con Interfaces

```java
Cuidador pedro = new Voluntario("Pedro");
```

> Aquí estamos usando **polimorfismo basado en interfaces**.  
> No se puede hacer `new Cuidador()` porque es una interfaz.  
> Pero sí se puede declarar una variable de tipo `Cuidador` y asignarle un objeto de una clase que **implementa** esa interfaz (`Voluntario` en este caso).

### ✔️ Ventaja
Permite intercambiar comportamientos de forma flexible:

```java
Cuidador maria = new Veterinario("María"); // si implementa Cuidador también
```

---

## 🔒 Bonus: Set para evitar duplicados

```java
Set<String> nombresUnicos = new HashSet<>();
nombresUnicos.add("Max");
nombresUnicos.add("Luna");
nombresUnicos.add("Max"); // Ignorado

System.out.println("Animales únicos: " + nombresUnicos.size());
```

---

## ✅ Conclusiones

Este desafío guiado incluyó:

| Tema                   | Aplicación                                                       |
|------------------------|------------------------------------------------------------------|
| Condicionales          | `if`, `else`, y operador ternario                               |
| Bucles                 | `for`, `foreach`, y uso combinado con colecciones                |
| Collections            | `ArrayList`, `HashMap`, `HashSet`, `Stream API`                 |
| Herencia               | Clases `Perro` y `Gato` extienden de `Animal`                   |
| Polimorfismo           | Llamadas a `emitirSonido()` y uso de interfaces                 |
| Abstracción            | Clase `Animal` como abstracta, fuerza implementación en hijos   |
| Interfaces             | `Cuidador`, implementada por `Voluntario`                       |

---

¡Este proyecto te prepara para construir sistemas más grandes usando los pilares de Java moderno!