public class Mascotas {
    //Atributos
    String nombre;
    String raza;
    int edad;

    //constructor
    public Mascotas(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }
    
    //metodo
    public void mostrarInfo(){
        System.out.println("Nombre de la mascota: " + nombre + " Raza: " + raza + " Edad: " + edad);
    }
}
