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
public class Proveedores {
    String nombre;
    String cedula_juridica;
    String correo;
    String telefono;

    public Proveedores(String nombre, String cedula_juridica, String correo, String telefono) {
        this.nombre = nombre;
        this.cedula_juridica = cedula_juridica;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula_juridica() {
        return cedula_juridica;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula_juridica(String cedula_juridica) {
        this.cedula_juridica = cedula_juridica;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
}
