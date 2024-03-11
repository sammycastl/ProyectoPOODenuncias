/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectopoodenuncia;

/**
 *
 * @author nelsonmartinez
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProyectoPOODenuncia {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuesta = "si";

        System.out.println("Bienvenido");
        System.out.println("Está a punto de crear una denuncia");
        System.out.println("Llene el documento con la información que se le pide, " +
                "puede dejar los espacios en blanco si dice opcional.");

        // Prueba de conexión a la base de datos
        try (Connection conexion = ConexionBD.obtenerConexion()) {
            System.out.println("Conexión exitosa a la base de datos");

            while (respuesta.equals("si")) {
                // Crear un nuevo expediente
                crearExpediente expediente = new crearExpediente();

                // Insertar el expediente en la base de datos
                insertarExpediente(conexion, expediente);

                // Preguntar si desea crear otro expediente
                System.out.println("¿Desea crear otro expediente? (si/no)");
                respuesta = scanner.nextLine();
            }
        } catch (SQLException e) {
        }
    }

    private static void insertarExpediente(Connection conexion, crearExpediente expediente) {
        String sql = "INSERT INTO expedientes (fecha, numero, descripcion, denunciante, denunciado, ofendido, delito) " +
                     "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement pstmt = conexion.prepareStatement(sql)) {
            pstmt.setString(1, expediente.getFecha().toString());
            pstmt.setInt(2, expediente.getNumero());
            pstmt.setString(3, expediente.getDescripcion());
            pstmt.setString(4, expediente.getDenunciante());
            pstmt.setString(5, expediente.getDenunciado());
            pstmt.setString(6, expediente.getOfendido());
            pstmt.setString(7, expediente.getDelito());

            // Ejecutar la inserción
            pstmt.executeUpdate();
            System.out.println("Expediente insertado en la base de datos");
        } catch (SQLException e) {
            System.out.println("Error al insertar el expediente en la base de datos");
        }
    }
}

