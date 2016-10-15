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
public class Carros {
    String marca;
    String placa;
    String modelo;
    String precio_compra;
    String precio_venta;
    String exposicion;

    public Carros(String marca, String placa, String modelo, String precio_compra, String precio_venta, String exposicion) {
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.exposicion = exposicion;
    }

    public String getMarca() {
        return marca;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPrecio_compra() {
        return precio_compra;
    }

    public String getPrecio_venta() {
        return precio_venta;
    }

    public String getExposicion() {
        return exposicion;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio_compra(String precio_compra) {
        this.precio_compra = precio_compra;
    }

    public void setPrecio_venta(String precio_venta) {
        this.precio_venta = precio_venta;
    }

    public void setExposicion(String exposicion) {
        this.exposicion = exposicion;
    }

    @Override
    public String toString() {
        return "Carros{" + "marca=" + marca + ", placa=" + placa + ", modelo=" + modelo + ", precio_compra=" + precio_compra + ", precio_venta=" + precio_venta + ", exposicion=" + exposicion + '}';
    }
    
    
   
}
