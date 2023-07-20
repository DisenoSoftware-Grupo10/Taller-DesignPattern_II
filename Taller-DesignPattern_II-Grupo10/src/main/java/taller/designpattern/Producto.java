/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller.designpattern;

/**
 *
 * @author lancervs
 */
public class Producto {
    
    private int ID;
    private String nombre;
    private double precio;
    
    public Producto(int id, String n, double p){
        this.ID = id;
        this.nombre = n;
        this.precio = p;
    }
    
    public int getID() {
        return ID;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
   
}
