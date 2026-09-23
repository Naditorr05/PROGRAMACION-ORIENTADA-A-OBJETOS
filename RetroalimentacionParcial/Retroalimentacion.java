package com.mycompany.retroalimentacion.parcial1;

/**
 *
 * @author prestamo
 */
public class Empleado {
    
    private String nombre;
    private String cargo;
    private double salarioBase;
    private int anosExperiencia;
    
    //Constructor
    public Empleado (String nombre, String cargo, double salarioBase, int anosExperiencia){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.anosExperiencia = anosExperiencia;
    }
    public Empleado (String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getCargo(){
        return cargo;
    }
    
    public double getSalarioBase(){
        return salarioBase;
    }
    
    public int getAnosExperiencia(){
        return anosExperiencia;
    }
    
    public void setSalarioBase(int salarioBase){
        this.salarioBase = salarioBase;
    }
    
    public String verDetalle(){
        return "El empleado se llama "+this.nombre+" su cargo es "+this.cargo+ " su salario base es "+this.salarioBase+
                " años de experiencia "+this.anosExperiencia;
    }
    
    public String trabajar(int horas){
        return "\nEl empleado llamado "+this.nombre+ " trabaja "+horas+" al dia";
    }
    
    public String tomarDescanso(){
        return "\nEl empleado "+nombre+" tomo 1 descanso ";
    }
    
    public String trabajaryDescansar(int horas){
        String traba = this.trabajar(horas);
        String descan = this.tomarDescanso();
        return traba + descan;
        
    }
    
}
