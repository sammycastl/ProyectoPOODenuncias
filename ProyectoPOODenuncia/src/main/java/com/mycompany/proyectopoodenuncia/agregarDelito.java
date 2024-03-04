package com.mycompany.proyectopoodenuncia;
import java.util.ArrayList;
import java.util.List;

public class agregarDelito {
    
    private String nombre;
    private String delito;
    
   List<ArrayList> listaDelitos = new ArrayList<ArrayList> ();
    private ArrayList<String> delitos = new ArrayList<>();
    private ArrayList<String> nombres = new ArrayList<>();
    
    public agregarDelito(crearExpediente expediente){
        
        AgregarDelito(expediente.getDelito());
        AgregarDenunciado(expediente.getDenunciado());
        
        listaDelitos.add(nombres);
        listaDelitos.add(delitos);
    }
    
    public void AgregarDenunciado(String nombre) {
        nombres.add(nombre);
    }
    
     public void AgregarDelito(String delito) {
        delitos.add(delito);
    }
     
     public void imprimirDelitos(){
         System.out.println("Delitos asociados al expediente:");
        for (String delito : delitos) {
            System.out.println("- " + listaDelitos);
        }
 
     }
}
