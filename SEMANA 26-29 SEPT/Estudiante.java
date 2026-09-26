/**@author prestamo
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
