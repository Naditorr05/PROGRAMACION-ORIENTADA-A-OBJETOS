public class Automovil {
    //atributos
    String fabricante;
    String modelo;
    String color;
    double cilindraje;

    //constructor
    public Automovil(String fabricante, String modelo, String color, double cilindraje){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    //metodos String: Devuelve los datos sin necesidad de imprimirlos void: Imprime los datos en pantalla directamente
    public String acelerar(int rpm){
        return "el auto " + fabricante + " esta acelerando a " + rpm + " revoluciones por minuto ";
    
    }

    public String verDetalle(){
        return "El fabricante del auto es " + fabricante + " del modelo " + modelo + " de color " + color + " con un cilindraje de " + cilindraje;

    }

    public String frenar(){
        return "el auto " + fabricante + " esta frenando";
    
    }

    public String acelerarFrenar(int rpm) {
        return "Las rpm del auto " + modelo + " mientras esta frenando son " + rpm; 
    }
}

public void main(String[] args) {
    //crear objetos de la clase Automovil
    Automovil automovil1 = new Automovil("Toyota", "Supra", "Naranja", 2500);
    Automovil automovil2 = new Automovil("Toyota", "Honda", "Civic", 1300);
    Automovil automovil3 = new Automovil("Bugatti", "Chiron", "Morado", 8000);
    Automovil automovil4 = new Automovil("Suzuki", "Jeep", "Negro", 2000);
    Automovil automovil5 = new Automovil("Toyota", "Hilux", "Amarillo", 3000);
    
    //Metodos auto1
    System.out.println(automovil1.acelerar(13000));
    System.out.println(automovil1.verDetalle());
    System.out.println(automovil1.frenar());
    System.out.println(automovil1.acelerarFrenar(5000));
    //Metodos auto2
    System.out.println(automovil2.acelerar(12000));
    System.out.println(automovil2.verDetalle());
    System.out.println(automovil2.frenar());
    System.out.println(automovil2.acelerarFrenar(4000));
    //Metodos auto3
    System.out.println(automovil3.acelerar(15000));
    System.out.println(automovil3.verDetalle());
    System.out.println(automovil3.frenar());
    System.out.println(automovil3.acelerarFrenar(6000));
    //Metodos auto4
    System.out.println(automovil4.acelerar(11000));
    System.out.println(automovil4.verDetalle());
    System.out.println(automovil4.frenar());
    System.out.println(automovil4.acelerarFrenar(3000));
    //Metodos auto5
    System.out.println(automovil5.acelerar(14000));
    System.out.println(automovil5.verDetalle());
    System.out.println(automovil5.frenar());
    System.out.println(automovil5.acelerarFrenar(7000));
}
