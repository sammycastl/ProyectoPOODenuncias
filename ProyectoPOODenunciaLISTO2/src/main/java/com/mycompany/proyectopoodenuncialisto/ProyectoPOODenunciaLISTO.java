/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectopoodenuncialisto;

import java.util.Scanner;

public class ProyectoPOODenunciaLISTO {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        System.out.println("Bienvenido");
        System.out.println("Está a punto de crear una denuncia");
        System.out.println("Llene el documento con la informacion que se le pide, " +
                "puede dejar los espacios en blancos si dice opcional.");

        
        Expedientes expediente = new Expedientes();
        expediente.agregarExpediente(expediente);
        expediente.agregarDelito();
        
        System.out.println("¿Desea crear otro expediente? (si/no)");
            respuesta = scanner.nextLine();
        
        while (respuesta.equals("si")) {
            expediente.escribirExpediente();
            expediente.agregarExpediente(expediente);
            expediente.agregarDelito();
            expediente.imprimirDelitos();
            expediente.imprimirExpedientes();
            
        System.out.println("¿Desea crear otro expediente? (si/no)");
            respuesta = scanner.nextLine();
            
        }
    }
}
