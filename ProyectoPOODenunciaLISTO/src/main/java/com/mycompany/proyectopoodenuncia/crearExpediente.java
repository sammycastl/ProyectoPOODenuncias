/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nelsonmartinez
 */

package com.mycompany.proyectopoodenuncia;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class crearExpediente {

    private LocalDateTime fecha = LocalDateTime.now();
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private String descripcion;
    private String denunciante;
    private String denunciado;
    private String ofendido;
    private String delito;

    private int numero = 10000 + random.nextInt(90000);

    public crearExpediente() {
        escribirExpediente();
    }

    private void escribirExpediente() {
        System.out.println("----------------------------------------------------------");
        System.out.println("                    Expediente                            ");
        System.out.println("Fecha y hora de creación: " + fecha);
        System.out.println("No. " + numero);
        System.out.print("Nombre del denunciante: ");
        denunciante = scanner.nextLine();
        System.out.print("Nombre del acusado (opcional): ");
        denunciado = scanner.nextLine();
        System.out.print("Nombre del ofendido: ");
        ofendido = scanner.nextLine();
        System.out.print("Tipo de delito:");
        delito = scanner.nextLine();
        System.out.print("Descripción de lo ocurrido: ");
        descripcion = scanner.nextLine();
        System.out.println("----------------------------------------------------------");
    }

    public String getDenunciado() {
        return denunciado;
    }

    public String getDenunciante() {
        return denunciante;
    }

    public String getOfendido() {
        return ofendido;
    }

    public String getDelito() {
        return delito;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    List<compararDelitos.Delito> getDelitos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
