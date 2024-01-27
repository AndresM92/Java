
package ejercicio_2_empleados;

import java.util.ArrayList;

public class Vendedor extends Empleado {
    //Automovil
    private String matricula;
    private String marca;
    private String modelo;
    
    private String telefono_movil;
    private String area_venta;
    private String porcentaje;
    
    //Lista de clientes, llevara unos datos por defaut
    private ArrayList<String> clientes=new ArrayList<>();

    public Vendedor() {
    }

    public Vendedor(String matricula, String marca, String modelo, String telefono_movil, String area_venta, String porcentaje, String nombre, String apellido, String doc, String direccion,String anios, String telefono, double salario) {
        super(nombre, apellido, doc, direccion,anios, telefono, salario);
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.telefono_movil = telefono_movil;
        this.area_venta = area_venta;
        this.porcentaje = porcentaje;
        this.clientes=new ArrayList<>();
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

    public String getTelefono_movil() {
        return telefono_movil;
    }

    public void setTelefono_movil(String telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public String getArea_venta() {
        return area_venta;
    }

    public void setArea_venta(String area_venta) {
        this.area_venta = area_venta;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }
   
    
    public void Insertar_cliente(String cliente1){
        String nuevo=cliente1;
        this.clientes.add(nuevo);
    }
    
    public void mostrar_clientes(){
        int cont=0;
        while(cont<this.clientes.size()){
            System.out.println(this.clientes.get(cont));
            cont=cont+1;
        }
    }
    
    public void eliminar_cliente(String nombre){
        int cont=0;
        while(cont<this.clientes.size()){
            if(nombre.equals(this.clientes.get(cont))){
                this.clientes.remove(cont);
            }
            cont=cont+1;
        }
        
    }
    
    public void cambiar_coche(String mat, String mar, String mod){
        this.matricula=mat;
        this.marca=mar;
        this.modelo=mod;
    }
     
    public void incrementar_salario(){
        this.setSalario(super.incrementar_saldo(10));
    }

    public ArrayList<String> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<String> clientes) {
        this.clientes = clientes;
    }
       
    
}
