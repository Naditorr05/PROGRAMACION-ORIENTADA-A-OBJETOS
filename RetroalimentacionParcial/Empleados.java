package com.mycompany.retroalimentacion.parcial1;

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
    public Empleado (){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
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
    
    public double calcularBono (float porcentaje){
        return salarioBase*porcentaje/100;
    }
    
    public double calcularBono (int porcentaje){
        return salarioBase*porcentaje/100;
    }
    
    public double calcularSalarioTotal(double bono, int diasTrabajados){
        double salarioPorDia = this.salarioBase/30;
        double salarioTrabajado = salarioPorDia*diasTrabajados;
        return this.calcularBono(diasTrabajados) + salarioTrabajado;
    }

    
}
