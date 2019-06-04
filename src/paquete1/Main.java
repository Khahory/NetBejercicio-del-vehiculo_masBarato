/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author Lugue
 */
public class Main {
    public static void main(String args[]){
        String marca, modelo;
        float precio;
        int numVehiculos, idelcarro;
        
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Digita la cantidad de vehiculos");
        numVehiculos = in.nextInt();
        
        Vehiculo carros[] = new Vehiculo[numVehiculos];
        
        for(int i = 0; i<carros.length; i++){
            in.nextLine();
         System.out.println("Digite la marca del vehiculo");
            marca = in.nextLine();
            System.out.println("Digite el modelo del vehiculo");
            modelo = in.nextLine();
            System.out.println("Digite el precio del vehiculo");
            precio = in.nextFloat();
            
            
            carros[i] = new Vehiculo(modelo, marca, precio);
        }
        
        idelcarro = indiceDelCarroMasBarato(carros);
        System.out.println("El carro mas barato es: ");
        System.out.print(carros[idelcarro].mostrarDatos());
    }
    
    //metodo mara sacar al carro mas barato de la lista
    public static int indiceDelCarroMasBarato(Vehiculo carros[]){
        int indice = 0;
        float precio;
        
        precio = carros[0].getPrecio();
        for (int i = 1; i < carros.length; i++) {
            if (carros[i].getPrecio() < precio) {
                precio = carros[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }
}

