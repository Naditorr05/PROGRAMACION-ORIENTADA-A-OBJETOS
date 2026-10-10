
package com.mycompany.jherencia;

public class JHerencia {

    public static void main(String[] args) {

        // Objetos de la clase padre Animal
        Animal animal1 = new Animal("Mamifero");

        System.out.println("ESPECIE: " + animal1.getEspecie());
        animal1.comer();
        animal1.dormir();

        System.out.println();

        // Objetos de la clase hija Perro
        Perro perro1 = new Perro("Mamifero", "Labrador");
        Perro perro2 = new Perro("Mamifero", "Pastor Aleman");

        System.out.println("PERRO 1");
        System.out.println("Especie: " + perro1.getEspecie());
        System.out.println("Raza: " + perro1.getRaza());
        perro1.comer();
        perro1.dormir();
        perro1.hacerSonido();

        System.out.println();

        System.out.println("PERRO 2");
        System.out.println("Especie: " + perro2.getEspecie());
        System.out.println("Raza: " + perro2.getRaza());
        perro2.hacerSonido();

        System.out.println();

        // Objetos de la clase hija Gato
        Gato gato1 = new Gato("Mamifero", "Siames", "Blanco");
        Gato gato2 = new Gato("Mamifero", "Persa", "Gris");

        System.out.println("GATO 1");
        gato1.mostrarInformacion();
        gato1.comer();
        gato1.dormir();
        gato1.maullar();
        gato1.jugar();

        System.out.println();

        System.out.println("GATO 2");
        gato2.mostrarInformacion();
        gato2.maullar();
        gato2.jugar();

        System.out.println();

        // Objetos de la clase hija Pajaro
        Pajaro ave1 = new Pajaro("Ave", "Canario", "Amarillo");
        Pajaro ave2 = new Pajaro("Ave", "Loro", "Verde");

        System.out.println("PAJARO 1");
        ave1.mostrarInformacion();
        ave1.comer();
        ave1.dormir();
        ave1.volar();
        ave1.cantar();

        System.out.println();

        System.out.println("PAJARO 2");
        ave2.mostrarInformacion();
        ave2.volar();
        ave2.cantar();
    }
}
