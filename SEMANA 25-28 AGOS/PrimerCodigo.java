/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapp1;

/**
 *
 * @author prestamo
 */
public class Estudiante {
    String nombre;
    int edad;
    int numeroDeMaterias;
    
    //constructor
    public Estudiante(String nombre, int edad, int numeroDeMaterias){
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeMaterias = numeroDeMaterias;
    }
    
    //metodo
    public void mostrarInfo(){
        System.out.println("Nombre del estudiante: " + nombre + " Edad: " + edad + " Numero de materias: " + numeroDeMaterias);
    }
}
