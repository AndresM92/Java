/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_facultad;


public class Profesor extends Empleados{
    
    private String departamento;
    private double salario;

    public Profesor() {
    }

    public Profesor(String departamento, String incorporacion, String despacho, String nombre, String apellido, String doc, String estado_civil) {
        super(incorporacion, despacho, nombre, apellido, doc, estado_civil);
        this.departamento = departamento;
        
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void cambiar_dep(String p){
        this.departamento=p;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcular_salario(double saldo){
        if(Integer.parseInt(this.getIncorporacion())<2000){
            double sal=saldo+saldo*0.08;
            this.setSalario(sal);
        }else{
            this.setSalario(saldo);
        }
    }
    
    
}
