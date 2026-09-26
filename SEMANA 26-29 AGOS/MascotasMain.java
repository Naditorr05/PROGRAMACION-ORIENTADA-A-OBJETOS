public class MacJapp {
    public static void main(String[] args){ 
        //crear objeto de la clase Mascotas
        Mascotas mascota1 = new Mascotas("firulais","labrador", 4);
        Mascotas mascota2 = new Mascotas("Hochy", "Begal", 12);
        
        //llamar al metodo mostrarInfo para cada objeto
        mascota1.mostrarInfo();
        mascota2.mostrarInfo();
    }
}
