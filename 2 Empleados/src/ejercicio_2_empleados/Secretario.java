

package ejercicio_2_empleados;


public class Secretario extends Empleado {
    private String despacho;
    private String fax;

    public Secretario() {
    }

    public Secretario(String despacho, String fax, String nombre, String apellido, String doc, String direccion,String anios, String telefono, double salario) {
        super(nombre, apellido, doc, direccion,anios, telefono, salario);
        this.despacho = despacho;
        this.fax = fax;
    }

    public void incremetar_salario(){
        double y;
        y=super.incrementar_saldo(5);
        this.setSalario(y);     
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }
    
}
