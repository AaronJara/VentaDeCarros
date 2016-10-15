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
public class logica {
    private archivos archivo;

    public logica() {
       archivo = new archivos();
    }
                                        
public void agregarCliente(Clientes persona, String nombreArchivo) {//Clientes.txt
    String texto = archivo.leerTextoArchivo(nombreArchivo);
    String[] personasList = texto.split("");
    boolean existe = false;
    for (int i = 0; i < personasList.length; i++) {
        String cedulaActual = personasList[i].split(" ; ")[0].trim();
        String nuevaCedula = String.valueOf(persona.getCedula());
        if (nuevaCedula.equals(cedulaActual)) {
            existe = true;
            break;
        }
    }
    if (!existe) {
        archivo.escribirTextoArchivo(nombreArchivo, texto + (persona.getCedula()
                + " ; " + persona.getNombre() + " ; "
                + persona.getDireccion() + " ; " + persona.getTelefono()+ " ; " + persona.getCorreo()));     
    } else {
            System.out.println("El cliente ya existe en el sistema");
    }
}    

public void agregarVendedor(Vendedores persona, String nombreArchivo) {//Vendedores.txt
    String texto = archivo.leerTextoArchivo(nombreArchivo);
    String[] personasList = texto.split("");
    boolean existe = false;
    for (int i = 0; i < personasList.length; i++) {
        String cedulaActual = personasList[i].split(" ; ")[0].trim();
        String nuevaCedula = String.valueOf(persona.getCedula());
        if (nuevaCedula.equals(cedulaActual)) {
            existe = true;
            break;
        }
    }
    if (!existe) {
        archivo.escribirTextoArchivo(nombreArchivo, texto + (persona.getCedula()
                + " ; " + persona.getNombre() + " ; "
                + persona.getDireccion() + " ; " + persona.getTelefono()+ " ; " + persona.getCorreo()+ " ; " + persona.getSalario()));
    } else {
            System.out.println("El vendedor ya existe en el sistema");
    }
} 

public void agregarCarro(Carros carro, String nombreArchivo) {//Carros.txt
    String texto = archivo.leerTextoArchivo(nombreArchivo);
    String[] carrosList = texto.split("");
    boolean existe = false;
    for (int i = 0; i < carrosList.length; i++) {
        String placaActual = carrosList[i].split(" ; ")[0].trim();
        String nuevaPlaca = String.valueOf(carro.getPlaca());
        if (nuevaPlaca.equals(placaActual)) {
            existe = true;
            break;
        }
    }
    if (!existe) {
        archivo.escribirTextoArchivo(nombreArchivo, texto + (carro.getPlaca()
                + " ; " + carro.getMarca() + " ; "
                + carro.getModelo() + " ; " + carro.getPrecio_compra() + " ; " + carro.getPrecio_venta()+ " ; " + carro.getExposicion()));
    } else {
            System.out.println("El carro ya existe en el sistema");
    }
    
    
} 
public Clientes[] cargarClientes() {

        String texto = archivo.leerTextoArchivo(("Clientes.txt"));
        Clientes resultado[]= null;
        if (!texto.trim().equals("")) {
            String[] datos = texto.split("\n");
            Clientes clientes[]= new Clientes[datos.length];
            for (int i = 0; i < datos.length; i++) {
                String[] aux = datos[i].split(" ; ");
                ///
                String clienteNombre= aux[0];
                String clienteCedula= aux[1];
                String clienteTelefono= aux[2];
                String clienteCorreo= aux[3];
                String clienteDireccion= aux[4];
                ///
                Clientes cli = new Clientes(clienteNombre, clienteCedula, clienteTelefono, clienteCorreo, clienteDireccion);
                
                clientes[i] = cli;
            }
            resultado= clientes;
        }
        return resultado;
    }

}
