/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1_formas;


public class Rectangulo extends Formas{
    private int lado_menor;
    private int lado_mayor;

    
    public Rectangulo() {
        
    }
    
    public Rectangulo(int lado_menor, int lado_mayor, String color, int x, int y, String nombre) {
        super(color, x, y, nombre);
        this.lado_menor = lado_menor;
        this.lado_mayor = lado_mayor;
    }

    public int getLado_mayor() {
        return lado_mayor;
    }

    public void setLado_mayor(int lado_mayor) {
        this.lado_mayor = lado_mayor;
    }

    public int getLado_menor() {
        return lado_menor;
    }

    public void setLado_menor(int lado_menor) {
        this.lado_menor = lado_menor;
    }
    
    public int area(){
        int area_rect=this.lado_mayor*this.lado_menor;
        return area_rect;
    }
    
    public int perimetro(){
        int perimetro_rect= 2*this.lado_mayor + 2*this.lado_menor;
        return perimetro_rect;
    }
    
    public void cambiar_tamanio(int f){
        this.lado_mayor=this.lado_mayor*f;
        this.lado_menor=this.lado_menor*f;
    }
    
    public void imprimir(){
        if(this.lado_mayor==this.lado_menor){
            System.out.println("Cuadrado");
        }else{
        System.out.println("Rectangulo");
        }
        super.imprimir_Forma();
        if(this.lado_mayor==this.lado_menor){
            System.out.println("Lado: "+this.lado_mayor);
        }else{
        System.out.println("Lado 1: "+this.lado_mayor);
        System.out.println("Lado 2: "+this.lado_menor);
        }
        System.out.println("Area: "+this.area());
        System.out.println("Perimetro: "+this.perimetro());
    }
    
    
    
    
}
