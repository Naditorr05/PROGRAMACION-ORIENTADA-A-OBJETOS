public class Libros {
    //atributos
    String titulo;
    String autor;
    int anioPublicacion;
    
    //constructor
    public Libros (String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    //metodo
    public void mostrarInfo(){
        //Imprimir informacion
        System.out.println("Titulo del libro: " + titulo +  "Autor del libro: " + autor + "Año de publicacion: " + anioPublicacion);
    }
}
