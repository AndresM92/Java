/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JOptionPane;
import ejercicio_1_formas.Circulo;
import ejercicio_1_formas.Cuadrado;
import ejercicio_1_formas.Elipse;
import ejercicio_1_formas.Rectangulo;
import java.util.ArrayList;


public class interfazInicial extends javax.swing.JFrame {
    
    ArrayList<Circulo> circulos= new ArrayList<>();
    ArrayList<Cuadrado> cuadrados= new ArrayList<>();
    ArrayList<Elipse> elipses= new ArrayList<>();
    ArrayList<Rectangulo> rectangulos= new ArrayList<>();

    /**
     * Creates new form interfazInicial
     */ 
    public interfazInicial() {
        initComponents();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 204));
        jButton1.setText("Circulo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 255));
        jButton2.setText("Consultar Lista de Circulos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(204, 0, 204));
        jButton4.setText("Cuadrado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setForeground(new java.awt.Color(204, 0, 204));
        jButton5.setText("Elipse");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setForeground(new java.awt.Color(204, 0, 204));
        jButton6.setText("Rectangulo");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Malgun Gothic", 2, 24)); // NOI18N
        jLabel1.setText("NEW FORMS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel2.setText("BUSCAR FORMAS ");

        jButton7.setBackground(new java.awt.Color(0, 204, 255));
        jButton7.setText("Consultar Lista de Cuadrados");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 204, 255));
        jButton8.setText("Consultar Lista de Elipses");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(0, 204, 255));
        jButton9.setText("Consultar Lista de Rectangulos");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        jLabel3.setText("OTROS");

        jButton10.setBackground(new java.awt.Color(153, 153, 0));
        jButton10.setText("Cambiar Color");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton11.setBackground(new java.awt.Color(153, 153, 0));
        jButton11.setText("Cambiar Tamaño de lados");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setBackground(new java.awt.Color(153, 153, 0));
        jButton12.setText("Cambiar Centro");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton13.setBackground(new java.awt.Color(153, 153, 0));
        jButton13.setText("Cambiar color de todas las formas");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton4)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton6))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton8)
                                        .addComponent(jButton2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton7)
                                        .addComponent(jButton9))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton10)
                                .addGap(30, 30, 30)
                                .addComponent(jButton11)))
                        .addGap(19, 53, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton13)
                                .addGap(27, 27, 27)
                                .addComponent(jButton12)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton10)
                    .addComponent(jButton11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton13)
                    .addComponent(jButton12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // BOTON DE CIRCULO
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // TODO add your handling code here:
       String nombre =  JOptionPane.showInputDialog("Nombre");
       String radio =  JOptionPane.showInputDialog("Radio");
       String color =  JOptionPane.showInputDialog("Color");
       String pos_x =  JOptionPane.showInputDialog("Posicion en X");
       String pos_y =  JOptionPane.showInputDialog("Posicion en Y");
       Circulo p1=new Circulo();
       double r= Double.parseDouble(radio);
       int x=Integer.parseInt(pos_x);
       int y=Integer.parseInt(pos_y);
       p1.setNombre(nombre);
       p1.setRadio_mayor(r);
       p1.setRadio_menor(r);
       p1.setColor(color);
       p1.setX(x);
       p1.setY(y);
       circulos.add(p1);        
    }//GEN-LAST:event_jButton1ActionPerformed

    // BOTON DE CONSULTAR CIRCULO
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Consulta ir=new Consulta();
        ir.setCirculos(circulos);
        this.setVisible(true);
        ir.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    
    // BOTON DE SALIR
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0); 
    }//GEN-LAST:event_jButton3ActionPerformed

    
    //BOTON DE CREAR CUADRADO
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
       String nombre =  JOptionPane.showInputDialog("Nombre");
       String lado =  JOptionPane.showInputDialog("Lado");
       String color =  JOptionPane.showInputDialog("Color");
       String pos_x =  JOptionPane.showInputDialog("Posicion en X");
       String pos_y =  JOptionPane.showInputDialog("Posicion en Y");
       int l= Integer.parseInt(lado);
       int x=Integer.parseInt(pos_x);
       int y=Integer.parseInt(pos_y);
       Cuadrado p1=new Cuadrado(l,color,x,y,nombre);
       cuadrados.add(p1);
    }//GEN-LAST:event_jButton4ActionPerformed

    
    //BOTON CREAR ELIPSE
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
       String nombre =  JOptionPane.showInputDialog("Nombre");
       String radio1 =  JOptionPane.showInputDialog("Radio Mayor");
       String radio2 =  JOptionPane.showInputDialog("Radio Menor");
       String color =  JOptionPane.showInputDialog("Color");
       String pos_x =  JOptionPane.showInputDialog("Posicion en X");
       String pos_y =  JOptionPane.showInputDialog("Posicion en Y");
       double r1= Double.parseDouble(radio1);
       double r2= Double.parseDouble(radio2);
       int x=Integer.parseInt(pos_x);
       int y=Integer.parseInt(pos_y);
       
       Elipse p1=new Elipse(r1,r2,color,x,y,nombre);
       elipses.add(p1);
        
        
    }//GEN-LAST:event_jButton5ActionPerformed

    
    //BOTON PARA CREAR RECTANGULO
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
       String nombre =  JOptionPane.showInputDialog("Nombre");
       String lado1 =  JOptionPane.showInputDialog("Lado Mayor");
       String lado2 =  JOptionPane.showInputDialog("Lado Menor");
       String color =  JOptionPane.showInputDialog("Color");
       String pos_x =  JOptionPane.showInputDialog("Posicion en X");
       String pos_y =  JOptionPane.showInputDialog("Posicion en Y");
       int l1= Integer.parseInt(lado1);
       int l2= Integer.parseInt(lado2);
       int x=Integer.parseInt(pos_x);
       int y=Integer.parseInt(pos_y);
       Rectangulo p1=new Rectangulo(l1,l2,color,x,y,nombre);
       rectangulos.add(p1);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        Consulta_cuadrado ir=new Consulta_cuadrado();
        ir.setCuadrados(cuadrados);
        this.setVisible(true);
        ir.setVisible(true);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        Consulta_elipse ir=new Consulta_elipse();
        ir.setElipses(elipses);
        this.setVisible(true);
        ir.setVisible(true);
        
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        Consultar_rectangulo ir=new Consultar_rectangulo();
        ir.setRectangulos(rectangulos);
        this.setVisible(true);
        ir.setVisible(true);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
       String nombre =  JOptionPane.showInputDialog("Nombre");
       String color =  JOptionPane.showInputDialog("Nuevo Color");
       
       for(int i=0; i<circulos.size();i++){
           if(nombre.compareTo(circulos.get(i).getNombre())==0){
               circulos.get(i).setColor(color);
           }   
       }
       for(int i=0; i<cuadrados.size();i++){
           if(nombre.compareTo(cuadrados.get(i).getNombre())==0){
               cuadrados.get(i).setColor(color);
           }          
       }
       for(int i=0; i<elipses.size();i++){
           if(nombre.compareTo(elipses.get(i).getNombre())==0){
               elipses.get(i).setColor(color);
           }   
       }
       for(int i=0; i<rectangulos.size();i++){
           if(nombre.compareTo(rectangulos.get(i).getNombre())==0){
               rectangulos.get(i).setColor(color);
           }        
       }   
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
       String nombre =  JOptionPane.showInputDialog("Nombre");
       String escala =  JOptionPane.showInputDialog("Escalar");
       int esc=Integer.parseInt(escala);
       
       
       for(int i=0; i<cuadrados.size();i++){
           if(nombre.compareTo(cuadrados.get(i).getNombre())==0){
               cuadrados.get(i).cambiar_tamanio(esc);
           }          
       }
       
       for(int i=0; i<rectangulos.size();i++){
           if(nombre.compareTo(rectangulos.get(i).getNombre())==0){
               rectangulos.get(i).cambiar_tamanio(esc);
           }        
       }  
        
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
       String nombre =  JOptionPane.showInputDialog("Nombre");
       String x1 =  JOptionPane.showInputDialog("Nuevo x");
       String y1 =  JOptionPane.showInputDialog("Nuevo y");
       
       int x=Integer.parseInt(x1);
       int y=Integer.parseInt(y1);       
       
       for(int i=0; i<circulos.size();i++){
           if(nombre.compareTo(circulos.get(i).getNombre())==0){
               circulos.get(i).cambiar_centro(x, y);
           }   
       }
       for(int i=0; i<cuadrados.size();i++){
           if(nombre.compareTo(cuadrados.get(i).getNombre())==0){
               cuadrados.get(i).cambiar_centro(x, y);
           }          
       }
       for(int i=0; i<elipses.size();i++){
           if(nombre.compareTo(elipses.get(i).getNombre())==0){
               elipses.get(i).cambiar_centro(x, y);
           }   
       }
       for(int i=0; i<rectangulos.size();i++){
           if(nombre.compareTo(rectangulos.get(i).getNombre())==0){
               rectangulos.get(i).cambiar_centro(x, y);
           }        
       } 
        
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        String color =  JOptionPane.showInputDialog("Nuevo Color");
        String c= JOptionPane.showInputDialog("¿Esta Seguro?   Y/N");
        
        if(c.compareTo("Y")==0 ||c.compareTo("y")==0){
        for(int i=0; i<circulos.size();i++){
           circulos.get(i).cambiar_color(color);
             
       }
       for(int i=0; i<cuadrados.size();i++){
            cuadrados.get(i).cambiar_color(color);
                    
       }
       for(int i=0; i<elipses.size();i++){
            elipses.get(i).cambiar_color(color);
            
       }
       for(int i=0; i<rectangulos.size();i++){
           rectangulos.get(i).cambiar_color(color);
                
       } 
        
        } 
    }//GEN-LAST:event_jButton13ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(interfazInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfazInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfazInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfazInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfazInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}