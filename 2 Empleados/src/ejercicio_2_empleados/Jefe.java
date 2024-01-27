
package ejercicio_2_empleados;

import java.util.ArrayList;


public class Jefe extends Empleado {
    String despacho;
    private Secretario trabajador1; //secretario
    private ArrayList<Vendedor> vendedores=new ArrayList<>();
    
    //Automovil
    String matricula;
    String marca;
    String modelo;

    public Jefe() {
    }

    public Jefe(String despacho, String nombre, String apellido, String doc, String direccion,String anios, String telefono, double salario) {
        super(nombre, apellido, doc, direccion,anios, telefono, salario);
        this.despacho = despacho;
        this.trabajador1=new Secretario();
        this.trabajador1.setNombre("");
               
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretario getSecretario() {
        return trabajador1;
    }

    public void setSecretario(Secretario trabajador1) {
        this.trabajador1 = trabajador1;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void cambiar_secretario(Secretario p1){
        this.trabajador1.setNombre(p1.getNombre());
        this.trabajador1.setApellido(p1.getApellido());
        this.trabajador1.setDoc(p1.getDoc());
        
    }
    
    public void cambiar_coche(String mat, String mar, String mod){
        this.matricula=mat;
        this.marca=mar;
        this.modelo=mod;
    }
    
    public void Insertar_Vendedor(Vendedor p1){
        this.vendedores.add(p1);
    }
    
    public void Eliminar_Vendedor(Vendedor p1){
        this.vendedores.remove(p1);
    }
    
    public void incrementar_salario(){
        this.setSalario(super.incrementar_saldo(20));
    }

    public Secretario getTrabajador1() {
        return trabajador1;
    }

    public void setTrabajador1(Secretario trabajador1) {
        this.trabajador1 = trabajador1;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
    
    
}
