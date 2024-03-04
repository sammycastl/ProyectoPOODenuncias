package com.mycompany.proyectopoodenuncia;

import java.util.List;
import java.util.Scanner;

public class ProyectoPOODenuncia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido");
        System.out.println("Está a punto de crear una denuncia");
        System.out.print("Llene el documento con la informacion que se le pide, ");
        System.out.println("puede dejar los espacios en blancos si dice opcional.");

    
        CrearExpediente expediente = new CrearExpediente();
        expediente.setFecha("FechaActual"); 
        expediente.setNumeroExpediente(GenerarNumeroAleatorio()); // Método para generar número aleatorio
        expediente.setDescripcion("Descripción del expediente");
        
        // Agregar personajes al expediente (Denunciante, Denunciado, Ofendido)
        System.out.print("Nombre del Denunciante: ");
        expediente.getPersonajes().add(scanner.nextLine());

        System.out.print("Nombre del Denunciado: ");
        expediente.getPersonajes().add(scanner.nextLine());

        System.out.print("Nombre del Ofendido (opcional): ");
        String nombreOfendido = scanner.nextLine();
        if (!nombreOfendido.isEmpty()) {
            expediente.getPersonajes().add(nombreOfendido);
        }

        // Agregar delitos al expediente
        AggLista aggLista = new AggLista();
        AggHistorialExpedientes aggHistorialExpedientes = new AggHistorialExpedientes();
        CompararDelitos comparadorDelitos = new CompararDelitos(aggHistorialExpedientes, aggLista);

        System.out.println("Ingrese los delitos cometidos:");
        List<Delito> delitosCometidos = ingresarDelitos(scanner);
        expediente.setDelitos(delitosCometidos);


        aggHistorialExpedientes.AgregarExpediente(expediente);


        System.out.println("Lista de delitos asociados al expediente:");
        for (Delito delito : delitosCometidos) {
            aggLista.AgregarDelito(delito);
            System.out.println(delito.toString());
        }

        
        System.out.print("Ingrese el nombre de un personaje para buscar en el historial: ");
        String personajeBuscado = scanner.nextLine();
        List<Delito> historialDelitos = comparadorDelitos.BuscarDelitosHistorial(personajeBuscado);

        System.out.println("Delitos en el historial del personaje:");
        for (Delito delito : historialDelitos) {
            System.out.println(delito.toString());
        }

        boolean tieneDelitosEnComun = comparadorDelitos.CompararDelitosExpediente(expediente);

        if (tieneDelitosEnComun) {
            System.out.println("El expediente tiene delitos en común con el historial del personaje.");
        } else {
            System.out.println("El expediente no tiene delitos en común con el historial del personaje.");
        }
    }

    private static int GenerarNumeroAleatorio() {
        //aqui vos poné la logica man, ya estoy quemado
        return 123456; 
    }

    private static List<Delito> ingresarDelitos(Scanner scanner) {
        // aqui tambien, tengo sueño
        return List.of(new Delito("Personaje1", "Delito1", "Tipo1", "2022-01-01"),
                       new Delito("Personaje2", "Delito2", "Tipo2", "2022-02-01"));
    }
}
