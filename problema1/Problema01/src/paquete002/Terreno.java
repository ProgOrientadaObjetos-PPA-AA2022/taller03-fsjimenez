/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author SALA I
 */
public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    
    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    
    public void establecerMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    
    public void calcularArea(){
        area = ancho * largo;
    }
    
    public void calcularCostoTerreno(){
       costo_terreno = area * valorMetroCuadrado;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValorM2(){
        return valorMetroCuadrado;
    }
    
    public double obtenerCostoTerreno(){
        return costo_terreno;
    }
}
