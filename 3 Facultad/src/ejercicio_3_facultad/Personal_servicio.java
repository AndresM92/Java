/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3_facultad;


public class Personal_servicio extends Empleados {
    
    private String seccion;
    private double salario;

    public Personal_servicio() {
    }

    public Personal_servicio(String seccion, String incorporacion, String despacho, String nombre, String apellido, String doc, String estado_civil) {
        super(incorporacion, despacho, nombre, apellido, doc, estado_civil);
        this.seccion = seccion;
    }

    
    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }
    
    public void trasaldar_seccion(String c){
        this.seccion=c;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void calcular_salario(double saldo){
        if((this.getEstado_civil().toUpperCase().compareTo("CASADO")==0)||(this.getEstado_civil().toUpperCase().compareTo("CASADA")==0)){
            double sal=saldo+saldo*0.05;
            this.setSalario(sal);
        }else{
            this.setSalario(saldo);
        }
    }
  
}
