/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author Lugue
 */
public class Vehiculo {
    private String modelo, marca;
    private float precio;

    
    public Vehiculo(String modelo, String marca, float precio) {
        this.modelo = modelo;
        this.marca = marca;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return "Modelo: "+modelo +"\nMarca: "+marca +"\nPrecio: $"+precio;
    }
}
