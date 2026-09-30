/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.products;

/**
 *
 * @author prestamo
 */
public class Products {

    public static void main(String[] args) {
        //crear objetos
        Productos p1 = new Productos();
        p1.setNombre("Computador portatil");
        p1.setCategoria("Tecnologia");
        p1.setPrice(2500000.0);
        p1.setCantidadStock(8);
        
       Productos p2 = new Productos("MOuse inalambrico", "Accesorios", 85000.0,20);
       Productos p3 = new Productos("Teclado", "Accesorios", 120000.0,15);
       
       //Llamar metodos
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
       
       p1.calcularDescuento(10);
       p2.calcularDescuento(20);
       p3.calcularDescuento(50);
       
       p1.calcularPrecioFinal(10);
       p2.calcularPrecioFinal(15);
       p3.calcularPrecioFinal(50);
       
        System.out.println(p1.vender(5));
        System.out.println(p2.vender(21));
        System.out.println(p3.vender(10));
       
    }
}
