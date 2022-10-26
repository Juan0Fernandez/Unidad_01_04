/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_01_04;

/**
 *
 * @author LAB-2
 */
public class DirectorTecnico extends Persona{

 
    private String nacionalidad;
    private int yearsTrayectoria;

    public String mostrarInfo() {
        return this.mostrarInfo() + " es de nacionalidad"
                + this.nacionalidad +  " tiene " + this.yearsTrayectoria
                + " años de trayectoria";
    }

  

    public void setNacionalidad(String n) {
        this.nacionalidad = n;
    }

    

    public void setYearsTrayectoria(int yearsTrayectoria) {
        this.yearsTrayectoria = yearsTrayectoria;
    }

 
    

    
}
