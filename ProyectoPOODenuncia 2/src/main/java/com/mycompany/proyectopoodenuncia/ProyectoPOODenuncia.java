package com.mycompany.proyectopoodenuncia;

import java.util.Scanner;

public class ProyectoPOODenuncia {
    public static void main(String[] args) {
        
        //String respuesta="si";
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Bienvenido");
        System.out.println("Está a punto de crear una denuncia");
        System.out.print("Llene el documento con la informacion que se le pide, ");
        System.out.println("puede dejar los espacios en blancos si dice opcional.");
        
        //while (respuesta.equals("si")){
        crearExpediente expediente=new crearExpediente();
        agregarDelito delitos=new agregarDelito(expediente);
        delitos.imprimirDelitos();
        agregarExpediente ListaExpedientes= new agregarExpediente(expediente);
        ListaExpedientes.imprimirExpedientes();
        //System.out.println("¿Desea crear otro expediente?");
        //respuesta = scanner.nextLine();
        
        //}
    }
}
