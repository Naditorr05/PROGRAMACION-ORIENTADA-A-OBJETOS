public class LibrJapp {
    public static void main(){
        //crear objeto
        Libros libro1 = new Libros("Harry potter","J. K. Rowling", 1997);
        Libros libro2 = new Libros("El sobrino del mago", "C. S. Lewis", 1995);
        
        //Usar metodo
        libro1.mostrarInfo();
        libro2.mostrarInfo();

    }    
}
