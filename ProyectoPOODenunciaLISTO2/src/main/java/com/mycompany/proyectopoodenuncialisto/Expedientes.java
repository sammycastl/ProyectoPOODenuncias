/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectopoodenuncialisto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Expedientes {

    private LocalDateTime fecha = LocalDateTime.now();
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    private String descripcion;
    private String denunciante;
    private String denunciado;
    private String ofendido;
    private String delito;

    private int numero = 10000 + random.nextInt(90000);

    public Expedientes() {
        escribirExpediente();
    }
    

    public void escribirExpediente() {
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
    
    
    //////////////////////////////////////////////////////////////////////////////////////////////
    
    
     private List<Expedientes> expedientes = new ArrayList<>();

    public Expedientes(Expedientes expediente) {
        agregarExpediente(expediente);
        agregarDelito();
        agregarDenunciado(expediente.getDenunciado());
    }

    public void agregarExpediente(Expedientes expediente) {
        expedientes.add(expediente);
    }

    public void imprimirExpedientes() {
        System.out.println("-------------------------------------------------");
        System.out.println("Los expedientes existentes son: " + expedientes.size());
        for (Expedientes exp : expedientes) {
            System.out.println("Expediente No: " + exp.getNumero());
        }
        System.out.println("-------------------------------------------------");
    }
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////
    
    
    
    ///////////////////////////////////////////////////////////////////////////////////////////
    
    private List<String> listaDelitos = new ArrayList<>();

    public void agregarDenunciado(String nombre) {
        listaDelitos.add(nombre);
    }

    public void agregarDelito() {
        listaDelitos.add(delito);
    }

    public void imprimirDelitos() {
        System.out.println("Lista de Delitos:");
        for (String delito : listaDelitos) {
            System.out.println("- " + delito);
        }
    }
    
    ///////////////////////////////////////////////////////////////////////////////////////////////////
}
