/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author estudiante
 */
public class archivos {

    public String leerTextoArchivo(String nombreArchivo) {
        String texto = "";
        FileReader archivo = null;
        String linea = "";
        try {
            archivo = new FileReader(nombreArchivo);
            BufferedReader lector = new BufferedReader(archivo);
            while ((linea = lector.readLine()) != null) {
                texto += linea + "\n";
            }            
        } catch (FileNotFoundException e) {
            escribirTextoArchivo(nombreArchivo, "");
            texto= "";
            return texto;           
        } catch (IOException e) {
            throw new RuntimeException("Ocurrio un error de entrada / salida");
        } finally {
            if (archivo != null) {
                try {
                    archivo.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return texto;
    }

    public void escribirTextoArchivo(String nombreArchivo, String texto) {
        FileWriter salida = null;
        try {
            salida = new FileWriter(nombreArchivo);
            BufferedWriter escritor = new BufferedWriter(salida);
            if(!texto.equals("")){
                salida.write(texto.replaceAll("\n", "\r\n"));
            }
            escritor.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (salida != null) {
                try {
                    salida.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    
    
}