
package jardin;


public class comunidad extends cliente{
    
    private  String cantidad;
    
    public comunidad(){}

    public comunidad(String tipoJardin,String extencion,String contrato,String cantidad) {
        super(tipoJardin,extencion,contrato);
        this.cantidad = cantidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "comunidad{" + super.toString()+"cantidad=" + cantidad + '}';
    }
    
    
    
        
    
}
