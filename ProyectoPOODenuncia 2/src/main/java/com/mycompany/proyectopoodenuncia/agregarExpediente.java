package com.mycompany.proyectopoodenuncia;

import java.util.ArrayList;
import java.util.List;



public class agregarExpediente {
    
    int numeros;
    private List<crearExpediente> Expedientes=new ArrayList<>();
    
    public agregarExpediente(crearExpediente expediente){
        AgregarExpediente(expediente);
       // obtenerNumero(expediente.getNumero());
    }
    
    public void AgregarExpediente(crearExpediente expediente){
        Expedientes.add(expediente);
    }
    
    /*public void obtenerNumero(crearExpediente numero){
        numeros=set(obtenerNombre);
    }*/
    
    public void imprimirExpedientes(){
        System.out.println("-------------------------------------------------");
        System.out.println("Los expedientes existentes son: "+Expedientes.size());   
        //System.out.println(Expedientes.size()+" Expediente No: "+ numeros);  
        System.out.println("-------------------------------------------------");
    }
    
}
