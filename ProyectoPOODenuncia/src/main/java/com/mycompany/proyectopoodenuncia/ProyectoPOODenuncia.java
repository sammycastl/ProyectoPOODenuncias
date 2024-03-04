package com.mycompany.proyectopoodenuncia;


public class ProyectoPOODenuncia {

    public static void main(String[] args) {
        
        System.out.println("Bienvenido");
        System.out.println("Está a punto de crear una denuncia");
        System.out.print("Llene el documento con la informacion que se le pide, ");
        System.out.println("puede dejar los espacios en blancos si dice opcional.");
        
        crearExpediente expediente=new crearExpediente();
        agregarDelito delitos=new agregarDelito(expediente);
        
        delitos.imprimirDelitos();
        
    }
}
