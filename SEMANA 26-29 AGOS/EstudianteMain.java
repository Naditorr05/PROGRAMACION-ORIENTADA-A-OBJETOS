/**@author prestamo
*/

public class EstuJapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Camila",20,5);
        Estudiante estudiante2 = new Estudiante("Andres",21,3);
        
        estudiante1.mostrarInfo();
        estudiante2.mostrarInfo();
    }
    
}
