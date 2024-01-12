/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_1_formas;



public class Formas {
    private String color;
    private int x;
    private int y;
    private String nombre;

    public Formas() {
    }
    
    

    public Formas(String color, int x, int y, String nombre) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
        public void imprimir_Forma(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Color: "+getColor());
        System.out.println("Coordenadas X,Y: ("+getX()+","+getY()+")");
    }
    
    
    public void cambiar_color(String c){
        this.color=c;   
    }
    
    public void cambiar_centro(int x, int y){
        this.x=x;
        this.y=y;        
    }

    
}
