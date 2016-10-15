/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

/**
 *
 * @author estudiante
 */
public class Exposiciones {
    String nombre;
    String direccion;
    String fecha_inicio;
    String fecha_final;

    public Exposiciones(String nombre, String direccion, String fecha_inicio, String fecha_final) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_final = fecha_final;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String getFecha_final() {
        return fecha_final;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_final(String fecha_final) {
        this.fecha_final = fecha_final;
    }
    
    
    
    
    
}
