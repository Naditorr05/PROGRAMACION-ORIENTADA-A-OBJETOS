/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sesion1.encapsulamiento;

/**
 *
 * @author patri
 */
public class Sesion1Encapsulamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //crear objetos
        Libro libro1 = new Libro(
            "Cien años de soledad",
            "Gabriel García Márquez",
            "Novela",
            417);
        //llamar metodos
        System.out.println(libro1.verDetalle());
        System.out.println(libro1.prestar("Naren Dimate"));
        System.out.println(libro1.devolver() + "\n");
        System.out.println(libro1.prestarYDevolver("Naren Dimate"));
        System.out.println("Tiempo de lectura por dia de: " + libro1.calcularTiempoLectura(5, 6)+ "\n");
        System.out.println("El tiempo de lectura fue de: " + libro1.calcularTiempoLectura(3, 5.5f));
        //Llenar atributos uno por uno 
        libro1.setTitulo("Cien añitos de diversión");
        System.out.println("El nuevo titulo para el libro es " + libro1.verDetalle());
        
    }
    
}
