/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;
import paquete002.EquipoCelular;
/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EquipoCelular cel1 = new EquipoCelular();
        EquipoCelular cel2 = new EquipoCelular();
        
        cel1.establecerSistema("Android");
        cel1.establecertamañoPantalla(13.4);
        cel1.establecerCostoInicial(1000);
        cel1.establecerPorcentajeIVA(12);
        cel1.calcularIvaCostoInicial();
        cel1.calcularCostoFinal();
        cel1.establecerMAC("F0:E1:D2:C3:B4:A5");
        cel1.establecerIMEI(1234567823);
        
        cel2.establecerSistema("Aplle");
        cel2.establecertamañoPantalla(15.6);
        cel2.establecerCostoInicial(800);
        cel2.establecerPorcentajeIVA(10);
        cel2.calcularIvaCostoInicial();
        cel2.calcularCostoFinal();
        cel2.establecerMAC("F3:E4:D14:C8:B4:A9");
        cel2.establecerIMEI(98765432);
        
        System.out.println("Equipo Celular #1\n");
        System.out.printf("Sistema Operativo: %s\nTamanyo de la Pantalla: %s\n"
                + "Costo Inicial: %.2f\nPorcentaje del IVA: %.2f\n"
                + "IVA del Costo Inicial: %.2f\nCosto Final: %.2f\nDireccionMAC: "
                + "%s\nDireccion IMEI: %s\n", cel1.obtenerSistema(),
                                              cel1.obtenerPantalla(),
                                              cel1.obtenerCostoInicial(),
                                              cel1.obtenerIvaPorcentaje(),
                                              cel1.obtenerIvaCostoInicial(),
                                              cel1.obtenerCostoFinal(),
                                              cel1.obtenerMAC(),
                                              cel1.obtenerIMEI());
        System.out.println("-----------------------------\nEquipo Celular 2\n");
        System.out.printf("Sistema Operativo: %s\nTamanyo de la Pantalla: %s\n"
                + "Costo Inicial: %.2f\nPorcentaje del IVA: %.2f\n"
                + "IVA del Costo Inicial: %.2f\nCosto Final: %.2f\nDireccionMAC: "
                + "%s\nDireccion IMEI: %s\n", cel2.obtenerSistema(),
                                              cel2.obtenerPantalla(),
                                              cel2.obtenerCostoInicial(),
                                              cel2.obtenerIvaPorcentaje(),
                                              cel2.obtenerIvaCostoInicial(),
                                              cel2.obtenerCostoFinal(),
                                              cel2.obtenerMAC(),
                                              cel2.obtenerIMEI());
    }
    
}
