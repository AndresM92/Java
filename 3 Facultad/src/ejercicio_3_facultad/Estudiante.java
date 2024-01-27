/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_facultad;


public class Estudiante extends Persona{
    
    private String curso;

    public Estudiante() {
    }

    public Estudiante(String curso, String nombre, String apellido, String doc, String estado_civil) {
        super(nombre, apellido, doc, estado_civil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
}
