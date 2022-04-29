/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete001;
import paquete002.InstitucionEducativa;
/**
 *
 * @author SALA I
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InstitucionEducativa inst1 = new InstitucionEducativa();
        InstitucionEducativa inst2 = new InstitucionEducativa();
        
        inst1.establecerNombre("Colegio San Francisco");
        inst1.establecerTipo("Fiscal");
        inst1.establecerNumeroAlumnos(560);
        inst1.establecerNumeroDocentes(65);
        inst1.establecerNumeroSedes(3);
        inst1.establecerGastosEstudiante(200.50);
        inst1.calcularPresupuesto();
        
        inst2.establecerNombre("Colegio La Salle");
        inst2.establecerTipo("Fiscomicional");
        inst2.establecerNumeroAlumnos(680);
        inst2.establecerNumeroDocentes(72);
        inst2.establecerNumeroSedes(2);
        inst2.establecerGastosEstudiante(350.85);
        inst2.calcularPresupuesto();
        
        System.out.println("Institucion 1\n");
        System.out.printf("Nombre: %s\nTipo: %s\nNúmero de Alumnos: %s\n"
                + "Número Docentes: %s\nNúmero Sedes: %s\nGastos proyectados"
                + " por estudiante: %.2f\nPresupuesto: %.2f\n", 
                                                    inst1.obtenerNombre(),
                                                    inst1.obtenerTipo(),
                                                    inst1.obtenerNumeroAlumnos(),
                                                    inst1.obtenerNumeroDocentes(),
                                                    inst1.obtenerNumeroSedes(),
                                                    inst1.obtenerGastoAlumno(),
                                                    inst1.obtenerPresupuesto());
        
        System.out.println("------------------------------\nInstitucion 2\n");
        System.out.printf("Nombre: %s\nTipo: %s\nNúmero de Alumnos: %s\n"
                + "Número Docentes: %s\nNúmero Sedes: %s\nGastos proyectados"
                + " por estudiante: %.2f\nPresupuesto: %.2f\n", 
                                                    inst2.obtenerNombre(),
                                                    inst2.obtenerTipo(),
                                                    inst2.obtenerNumeroAlumnos(),
                                                    inst2.obtenerNumeroDocentes(),
                                                    inst2.obtenerNumeroSedes(),
                                                    inst2.obtenerGastoAlumno(),
                                                    inst2.obtenerPresupuesto());
    }
    
}
