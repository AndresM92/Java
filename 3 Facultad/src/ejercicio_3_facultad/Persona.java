/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_facultad;


public class Persona {
    
    private String nombre;
    private String apellido;
    private String doc;
    private String estado_civil;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String doc, String estado_civil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.doc = doc;
        this.estado_civil = estado_civil;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }
    
    public void cambiar_estado_civil(String c){
        this.estado_civil=c;
    }
    
    
}
