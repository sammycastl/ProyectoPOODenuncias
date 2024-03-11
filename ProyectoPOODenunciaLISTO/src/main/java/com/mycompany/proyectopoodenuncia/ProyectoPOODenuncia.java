/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectopoodenuncia;

/**
 *
 * @author nelsonmartinez
 */

import java.util.Scanner;


public class ProyectoPOODenuncia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta = "si";

        System.out.println("Bienvenido");
        System.out.println("Está a punto de crear una denuncia");
        System.out.println("Llene el documento con la informacion que se le pide, " +
                "puede dejar los espacios en blancos si dice opcional.");

        while (respuesta.equals("si")) {
            crearExpediente expediente = new crearExpediente();
            agregarDelito delitos = new agregarDelito(expediente);
            delitos.imprimirDelitos();
            agregarExpediente listaExpedientes = new agregarExpediente(expediente);
            listaExpedientes.imprimirExpedientes();

            System.out.println("¿Desea crear otro expediente? (si/no)");
            respuesta = scanner.nextLine();
        }
    }
}
