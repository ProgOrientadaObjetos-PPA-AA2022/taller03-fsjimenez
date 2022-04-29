/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;
import paquete002.EquivalenteHora;
/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EquivalenteHora hora1 = new EquivalenteHora();
        EquivalenteHora hora2 = new EquivalenteHora();
        
        hora1.establecerHoras(30);
        hora1.calcularMinutos();
        hora1.calcularSegundos();
        hora1.calcularDias();
        
        hora2.establecerHoras(4);
        hora2.calcularMinutos();
        hora2.calcularSegundos();
        hora2.calcularDias();
        
        System.out.println("Calculo 1 \n");
        System.out.printf("Horas Ingresadas: %.2f\nMinutos: %.2f\nSegundos: "
                + "%.2f\nDias: %.2f\n", hora1.obtenerHoras(),
                                        hora1.obtenerMinutos(),
                                        hora1.obtenerSegundos(),
                                        hora1.obtenerDias());
        System.out.println("-------------------------\nCalculo 2\n");
 
        System.out.printf("Horas Ingresadas: %.2f\nMinutos: %.2f\nSegundos: "
                + "%.2f\nDias: %.2f\n", hora2.obtenerHoras(),
                                        hora2.obtenerMinutos(),
                                        hora2.obtenerSegundos(),
                                        hora2.obtenerDias());
    }
    
}
