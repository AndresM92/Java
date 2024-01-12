
package ejercicio_1_formas;



public class Elipse extends Formas{
    private double radio_mayor;
    private double radio_menor;

    public Elipse() {
    }

    public Elipse(double radio_mayor, double radio_menor, String color, int x, int y, String nombre) {
        super(color, x, y, nombre);
        this.radio_mayor = radio_mayor;
        this.radio_menor = radio_menor;
    }

    public double getRadio_menor() {
        return radio_menor;
    }

    public void setRadio_menor(double radio_menor) {
        this.radio_menor = radio_menor;
    }

    public double getRadio_mayor() {
        return radio_mayor;
    }

    public void setRadio_mayor(double radio_mayor) {
        this.radio_mayor = radio_mayor;
    }
    
    public double Area(){
        double area=(3.1415926535897932384626)*this.radio_mayor*this.radio_menor;
        area= Math.rint(area*1000)/1000;
        return area;
    }
    
    public void imprimir(){
        if(this.radio_mayor==this.radio_menor){
            System.out.println("Circulo");
        }else{
        System.out.println("Elipse");
        }
        super.imprimir_Forma();
        if(this.radio_mayor==this.radio_menor){
            System.out.println("Radio: "+this.radio_mayor);
        }else{        
        System.out.println("Radio mayor: "+this.radio_mayor);
        System.out.println("Radio menor: "+this.radio_menor);
        }
        System.out.println("Area: "+this.Area());
    }
    
    
}
