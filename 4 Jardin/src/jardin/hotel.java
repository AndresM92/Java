/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jardin;


public class hotel extends cliente {
    private String nombre;
    private String direccion;
    private String telefono ;
    
    public hotel(){}

    public hotel(String tipoJardin,String extencion,String contrato,String nombre, String direccion, String telefono) {
        super(tipoJardin,extencion,contrato); 
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "particular{"+ super.toString()+ 
                "nombre=" + nombre +
                ", direccion=" + direccion + 
                ", telefono=" + telefono + '}';    
    
    }
}
    
