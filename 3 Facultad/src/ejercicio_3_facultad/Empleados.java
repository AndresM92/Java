/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_facultad;


public class Empleados extends Persona{
    private String incorporacion;
    private String despacho;
    

    public Empleados() {
    }

    public Empleados(String incorporacion, String despacho, String nombre, String apellido, String doc, String estado_civil) {
        super(nombre, apellido, doc, estado_civil);
        this.incorporacion = incorporacion;
        this.despacho = despacho;
        
    }

    

    
    public String getIncorporacion() {
        return incorporacion;
    }

    public void setIncorporacion(String incorporacion) {
        this.incorporacion = incorporacion;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    
    public void reasignar_despacho(String p){
        this.despacho=p;
    }

    
    
}
