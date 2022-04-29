/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author SALA I
 */
public class InstitucionEducativa {
    private String nombre;
    private String tipo;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosEstudiante;
    private double presupuesto;
    
    public void establecerNombre(String name){
        nombre = name;
    }
    
    public void establecerTipo(String type){
        tipo = type;
    }
    
    public void establecerNumeroAlumnos(int a){
        numeroAlumnos = a;
    }
    
    public void establecerNumeroDocentes(int a){
        numeroDocentes = a;
    }
    
    public void establecerNumeroSedes(int a){
        numeroSedes = a;
    }
    
    public void establecerGastosEstudiante(double a){
        gastosEstudiante = a;
    }
    
    public void calcularPresupuesto(){
        presupuesto = numeroAlumnos * gastosEstudiante;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public int obtenerNumeroAlumnos(){
        return numeroAlumnos;
    }
    
    public int obtenerNumeroDocentes(){
        return numeroDocentes;
    }
    
    public int obtenerNumeroSedes(){
        return numeroSedes;
    }
    
    public double obtenerGastoAlumno(){
        return gastosEstudiante;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
