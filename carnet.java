# tarea-1

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1;

/**
 *
 * @author mcdre
 */
public class carnet {
    String nombres;
    String apellidos;
    int edad;
    String fn;
    String carnet;
    
    public carnet(String nombre,String apellido,int edad,String fn,String carnet) {
        this.nombres = nombre;
        this.apellidos = apellido;
        this.edad = edad;
        this.fn = fn;
        this.carnet = carnet;
    }
    
    public void imprimir() {
        System.out.println("Nombres: " +nombres + "\nApellidos: "+ apellidos + "\nEdad: " + edad + "\nFecha de nacimiento: " + fn + "\nCarnet: " + carnet );
    }
}
