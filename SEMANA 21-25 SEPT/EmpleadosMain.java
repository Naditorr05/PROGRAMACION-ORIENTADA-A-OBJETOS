package com.mycompany.retroalimentacion.parcial1;

public class RetroalimentacionParcial1 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado();
        empleado1.setNombre("Manuel");
        empleado1.setSalarioBase(5000000);
        empleado1.setCargo("Gerente");
        empleado1.setAnosExperiencia(6);
        
        System.out.println(empleado1.getNombre());
        System.out.println(empleado1.getCargo());
        
        System.out.println(empleado1.verDetalle());
        System.out.println(empleado1.trabajar(8));
        System.out.println(empleado1.tomarDescanso());
        System.out.println(empleado1.trabajaryDescansar(2));
        System.out.println(empleado1.calcularBono(10));
        System.out.println(empleado1.calcularSalarioTotal(0, 28));
        
    }
}
