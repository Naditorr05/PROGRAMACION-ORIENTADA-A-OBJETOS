/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.products;

/**
 *
 * @author prestamo
 */
public class Productos {
    //Crear atributos
    private String nombre;
    private String categoria;
    private double price;
    private int cantidadStock;
    
    //constructor
    public Productos(String nombre,String categoria,double price, int cantidadStock){
        this.nombre = nombre;
        this.categoria = categoria;
        this.price = price;
        this.cantidadStock = cantidadStock;
    }
    public Productos(){
    }
    
    //Getter and Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "Productos{" + "nombre=" + nombre + ", categoria=" + categoria + ", price=" + price + ", cantidadStock=" + cantidadStock + '}';
    }
    
    public double calcularDescuento(int porcentaje){
        double cal = this.price * (porcentaje/100);
        System.out.println("El porcentaje del precio es "+cal);
        return 0;
    }
    public double calcularDescuento(double porcentaje){
        double cal = this.price * (porcentaje/100);
        System.out.println("El porcentaje del precio es "+cal);
        return 0;
    }
    
    public double calcularPrecioFinal (double porcentaje){
        double pFinal = this.price - (porcentaje/100);
        System.out.println("El precio final del producto es "+pFinal);
        return 0;
    }
    public String vender(int cantidad){
        if (cantidad < this.cantidadStock){
            int resta = this.cantidadStock - cantidad;
            this.setCantidadStock(resta);
            return "Venta realizada quedan "+this.getCantidadStock();
        }
        else {
            return "No hay suficiente stock en el inventario ";
        }       
    }
    
    
}
