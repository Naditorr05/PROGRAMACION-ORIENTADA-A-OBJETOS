class Automovil {
    //atributos
    String fabricante;
    String modelo;
    String color;
    double cilindraje;

    //constructor
    public class Automovil(String fabricante, String modelo, String color, double cilindraje){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    //metodos
    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " esta acelerando a " + rpm + " revoluciones por minuto ";
    
    }
}

public class Main{
    public static void main (String[] args){
        Automovil automovil1 = new Automovil("Toyota", "Supra", "Naranja", 2500);
        Automovil automovil1 = new Automovil("Toyota", "Honda", "Civic", 1300);
        Automovil automovil1 = new Automovil("Bugatti", "Chiron", "Morado", 8000);
        Automovil automovil1 = new Automovil("Suzuki", "Jeep", "Negro", 2000);
        Automovil automovil1 = new Automovil("Toyota", "Hilux", "Amarillo", 3000);
        
        System.out.println (automovil1.acelerar(13000));
    }
}
