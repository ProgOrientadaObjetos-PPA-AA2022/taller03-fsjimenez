/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;

/**
 *
 * @author SALA I
 */
public class EquipoCelular {
    private String sistemaOperativo;
    private double tamañoPantalla;
    private double costoInicial;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private double costoFinal;
    private String direccionMAC;
    private int infoIMEI;
    
   public void establecerSistema(String a){
       sistemaOperativo = a;
   }
   
   public void establecertamañoPantalla(double a){
       tamañoPantalla = a;
   }
   
   public void establecerCostoInicial(double a){
       costoInicial = a;
   }
   
   public void establecerPorcentajeIVA(double a){
       ivaPorcentaje = a;
   }
   
   public void calcularIvaCostoInicial(){
       ivaCostoInicial = (costoInicial * ivaPorcentaje)/100;
   }
   
   public void calcularCostoFinal(){
       costoFinal = ivaCostoInicial + costoInicial;
   }
   
   public void establecerMAC(String a){
       direccionMAC = a;
   }
   
   public void establecerIMEI(int a){
       infoIMEI = a;
   }
   
   public String obtenerSistema(){
       return sistemaOperativo;
   }
   
   public double obtenerPantalla(){
       return tamañoPantalla;
   }
   
   public double obtenerCostoInicial(){
       return costoInicial;
   }
   
   public double obtenerIvaPorcentaje(){
       return ivaPorcentaje;
   }
   
   public double obtenerIvaCostoInicial(){
       return ivaCostoInicial;
   }
   
   public double obtenerCostoFinal(){
       return costoFinal;
   }
   
   public String obtenerMAC(){
       return direccionMAC;
   }
   
   public int obtenerIMEI(){
       return infoIMEI;
   }
}
