/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.Serializable;

/**
 *
 * @author infor05
 */
public class Personas implements Serializable{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int nota1;
    private int nota2;
    private int nota3;
    private int nota4;
    private int nota5;
    private String notaFOL;

    public Personas() {
    }

    public Personas(String nombre, String apellido1, String apellido2, int nota1, int nota2, int nota3, int nota4, int nota5, String notaFOL) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
        this.nota5 = nota5;
        this.notaFOL = notaFOL;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public int getNota5() {
        return nota5;
    }

    public void setNota5(int nota5) {
        this.nota5 = nota5;
    }

    public String getNotaFOL() {
        return notaFOL;
    }

    public String setNotaFOL(String notaFOL) {
        this.notaFOL = notaFOL;
        return null;
    }
    
    
     public void mostrarnotas(){
        System.out.println("Nombre :" +nombre);
        System.out.println("Apellido1 :" +apellido1);
        System.out.println("Apellido2 :" +apellido2);
        System.out.println("Lenguaje de marcas :" +nota1);
        System.out.println("Programación :" +nota2);
        System.out.println("Entornos de desarrollo :" +nota3);
        System.out.println("Base de datos :" +nota4);
        System.out.println("Sistemas Informáticos :" +nota5);
        System.out.println("FOL :" +notaFOL);
    }
}