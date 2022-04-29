/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;
import paquete002.Terreno;
/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Terreno ter1 = new Terreno();
        Terreno ter2 = new Terreno();
        
        //double largo = 60;
        //double ancho = 50;
        //double costoPorMetro = 10;
        
        ter1.establecerLargo(50);
        ter1.establecerAncho(60);
        ter1.establecerMetroCuadrado(15.5);
        ter1.calcularArea();
        ter1.calcularCostoTerreno();
        ter2.establecerLargo(30);
        ter2.establecerAncho(45);
        ter2.establecerMetroCuadrado(10);
        ter2.calcularArea();
        ter2.calcularCostoTerreno();
        
        System.out.println("Terreno 1 \n");
        System.out.printf("Largo: %.2f\nAncho: %.2f\nCosto por metro cuadrado: "
                + "%.2f\nArea: %.2f\nCosto Final: %.2f\n", ter1.obtenerLargo(),
                                                    ter1.obtenerAncho(),
                                                    ter1.obtenerValorM2(),
                                                    ter1.obtenerArea(),
                                                    ter1.obtenerCostoTerreno());
        System.out.println("----------------------------------\nTerreno 2\n");
        System.out.printf("Largo: %.2f\nAncho: %.2f\nCosto por metro cuadrado: "
                + "%.2f\nArea: %.2f\nCosto Final: %.2f\n", ter2.obtenerLargo(),
                                                    ter2.obtenerAncho(),
                                                    ter2.obtenerValorM2(),
                                                    ter2.obtenerArea(),
                                                    ter2.obtenerCostoTerreno());
    }
    
}
