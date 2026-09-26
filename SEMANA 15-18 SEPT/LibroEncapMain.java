/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sesion1.encapsulamiento;

/**
 *
 * @author patri
 */
public class Libro {
 
    // ATRIBUTOS: privados, solo la propia clase
    // Libro puede leer o modificarlos directamente.
    private String titulo;
    private String autor;
    private String genero;
    private int numPaginas;
 
    // CONSTRUCTOR: llena la "ficha" del libro al crear el objeto.
    public Libro(String titulo, String autor, String genero, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.numPaginas = numPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
 
    // Devuelve un texto con todos los datos del libro.
    // Concatenacion directa con "+": cada "+" crea un String nuevo en memoria,
    // por eso en clases con muchos atributos se prefiere StringBuilder,
    // pero aqui se hace asi para verlo de forma explicita.
    public String verDetalle() {
        String detalle = "Nombre del libro " + this.titulo;
        detalle = detalle + " Autor del libro " + this.autor;
        detalle = detalle + " Genero " + this.genero;
        detalle = detalle + " Numero de paginas " + this.numPaginas;
        return detalle;
    }
 
    // Recibe el nombre de la persona y devuelve un mensaje de prestamo.
    public String prestar(String nombrePersona) {
        String mensaje = "El libro \"" + this.titulo + "\" ";
        mensaje = mensaje + " fue prestado a " + nombrePersona + ".";
        return mensaje;
    }
 
    // No recibe parametros: devolver no depende de ningun dato externo.
    public String devolver() {
        return "El libro \"" + this.titulo + "\" fue devuelto.";
    }
 
    // No repite la logica de prestar y devolver: los llama y combina los mensajes.
    public String prestarYDevolver(String nombrePersona) {
        String mensajePrestamo = this.prestar(nombrePersona);
        String mensajeDevolucion = this.devolver();
        return mensajePrestamo + "\n" + mensajeDevolucion;
    }
 
    // SOBRECARGA: mismo nombre "calcularTiempoLectura", distinto tipo de segundo parametro.
 
    // Version 1: las horas disponibles por dia llegan en decimal (ej. 1.5f)
    public float calcularTiempoLectura(int paginasPorDia, float horasDisponibles) {
        float diasNecesarios = (float) this.numPaginas / paginasPorDia;
        return diasNecesarios;
    }
 
    // Version 2: las horas disponibles por dia llegan en entero (ej. 2)
    public float calcularTiempoLectura(int paginasPorDia, int horasDisponibles) {
        float horasDecimal = (float) horasDisponibles;
        return this.calcularTiempoLectura(paginasPorDia, horasDecimal);
    }
}
