/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete002;
import  paquete001.FacturaTelefono;
/**
 *
 * @author SALA I
 */
public class EjecutorDos {
    public static void main(String[] args) {
        FacturaTelefono tlf = new FacturaTelefono();
        // Valores de entrada
        String numeroTelefono = "098321321";
        double minutos = 100;
        double valorMinuto = 1.10;
        // uso de los métodos establecer para darle valores a los 
        // atributos del objeto.
        tlf.establecerNumeroTelefono(numeroTelefono);
        tlf.establecerMinutosMes(minutos);
        tlf.establecerValorMinuto(valorMinuto);
        // hasta aquí el objeto ya tiene valores para sus atributos:
        // número de telefono, número de minutos consumidos en el mes, 
        // valor de cada minuto.
        // LLamo al método calcularValorFactura, no se envía parámetros,
        // pues trabaja con los valores de los atributos: número de minutos 
        // consumidos en el mes, valor de cada minuto; que ya los tiene el 
        // objeto.
        
        tlf.calcularValorFactura();
        
        // Se hace uso de los métodos obtener para presentar en pantalla lo 
        // requerido
        System.out.printf("Factura de Teléfono\n\n\tNúmero de teléfono: %s\n"
                + "Minutos mensuales: %.2f\n\tValor por minuto: %.2f\n"
                + "Valor a cancelar: %.2f\n", tlf.obtenerNumeroTelefono(),
                tlf.obtenerMinutosMes(), tlf.obtenerValorMinuto(),
                tlf.obtenerValorFactura());
    }
}
