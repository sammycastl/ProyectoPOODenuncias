/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nelsonmartinez
 */
package com.mycompany.proyectopoodenuncia;

import java.util.List;

public class compararDelitos {

    private AggHistorialExpedientes aggHistorialExpedientes;
    private AggLista aggLista;

    public compararDelitos(AggHistorialExpedientes aggHistorialExpedientes, AggLista aggLista) {
        this.aggHistorialExpedientes = aggHistorialExpedientes;
        this.aggLista = aggLista;
    }

    public List<Delito> buscarDelitosHistorial(String personaje) {
        return aggHistorialExpedientes.buscarDelitosHistorial(personaje);
    }

    public boolean compararDelitosExpediente(crearExpediente expediente) {
        List<Delito> delitosExpediente = expediente.getDelitos();
        List<Delito> listaDelitos = aggLista.obtenerListaDelitos();

        for (Object delitoExpediente : delitosExpediente) {
            for (Delito delitoLista : listaDelitos) {
                if (delitoExpediente.equals(delitoLista)) {
                    return true;
                }
            }
        }

        return false;
    }

    private static class AggHistorialExpedientes {

        public AggHistorialExpedientes() {
        }

        private List<Delito> buscarDelitosHistorial(String personaje) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class AggLista {

        public AggLista() {
        }

        private List<Delito> obtenerListaDelitos() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    public static class Delito {

        public Delito() {
        }
    }
}
