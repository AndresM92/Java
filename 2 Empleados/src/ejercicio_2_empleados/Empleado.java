
package ejercicio_2_empleados;

public class Empleado {
    private String nombre;
    private String apellido;
    private String doc;
    private String direccion;
    private String anios_antiguedad;
    private String telefono;
    private double salario;
    private Empleado supervisor;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String doc, String direccion,String anios, String telefono, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.doc = doc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.anios_antiguedad=anios;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getAnios_antiguedad() {
        return anios_antiguedad;
    }

    public void setAnios_antiguedad(String anios_antiguedad) {
        this.anios_antiguedad = anios_antiguedad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisa) {
        this.supervisor = supervisa;
    }
    
    public void cambiar_supervisor(Empleado c){
        this.supervisor=c;
    }
    
    public double incrementar_saldo(double c){
        this.salario=this.salario+this.salario*(c / 100);
        return this.salario;
    }
    
}
