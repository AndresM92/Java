/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import ejercicio_2_empleados.Jefe;
import ejercicio_2_empleados.Secretario;
import ejercicio_2_empleados.Vendedor;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Vent_Jefe extends javax.swing.JFrame {

    private ArrayList<Jefe> jefes=new ArrayList<>();
    private ArrayList<Vendedor> vendedores=new ArrayList<>();
    private ArrayList<Secretario> secretarios=new ArrayList<>();
    
    
    /**
     * 
     * Creates new form Vent_Jefe
     */
    public Vent_Jefe() {
        initComponents();
        this.setTitle(" JRL.inc");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 255, 0));
        jLabel1.setText("JEFES DE ZONAS");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setText("Aumentar Salario");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setText("Buscar y/o Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setText("Agregar Vendedores");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setText("Dar de baja a Vendedor");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setText("Agregar Secretario");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setText("Cambiar Automovil");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setBackground(new java.awt.Color(255, 0, 0));
        jButton9.setText("Regresar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton6))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton2)
                                    .addComponent(jButton1))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3)
                                    .addComponent(jButton8)
                                    .addComponent(jButton5))))
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton9)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5)
                            .addComponent(jButton2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton8)
                            .addComponent(jButton4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addGap(13, 13, 13)))
                .addComponent(jButton9)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //BOTON CREAR JEFE DE ZONA
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String nombre=JOptionPane.showInputDialog("Nombre");
        String apellido=JOptionPane.showInputDialog("Apellido");
        String doc=JOptionPane.showInputDialog("Documento");
        String direccion=JOptionPane.showInputDialog("Direccion");
        String anios=JOptionPane.showInputDialog("Años de Antiguedad");
        String telefono=JOptionPane.showInputDialog("Telefono");
        String salario=JOptionPane.showInputDialog("Salario");
        String despacho=JOptionPane.showInputDialog("Despacho");
        String matricula=JOptionPane.showInputDialog("Matricula Carro");
        String marca=JOptionPane.showInputDialog("Marca de Carro");
        String modelo=JOptionPane.showInputDialog("Modelo Carro");
        double pago=Double.parseDouble(salario);
        Jefe p1=new Jefe(despacho,nombre,apellido,doc,direccion,anios,telefono,pago);
        p1.setMatricula(matricula);
        p1.setMarca(marca);
        p1.setModelo(modelo);
        jefes.add(p1);
        
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //BOTON AUMENTAR SALARIO
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String doc=JOptionPane.showInputDialog("Documento");
        for(int i=0; i<jefes.size();i++){
            if(doc.compareTo(jefes.get(i).getDoc())==0){
                jefes.get(i).incrementar_salario();
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //BOTON DE BUSCAR Y/O MODIFICAR
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Consulta_jefe ir=new Consulta_jefe();
        ir.setJefes(jefes);
        this.setVisible(true);
        ir.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    //BOTON AGREGAR VENDEDORES
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String doc=JOptionPane.showInputDialog("Documento del Jefe de Zona");
        for(int i=0; i<jefes.size();i++){
            if(doc.compareTo(jefes.get(i).getDoc())==0){
                String doc1=JOptionPane.showInputDialog("Documento del Vendedor");
                for(int j=0; j<vendedores.size();j++){
                    if(doc1.compareTo(vendedores.get(j).getDoc())==0){
                        jefes.get(i).Insertar_Vendedor(vendedores.get(j));
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //BOTON DAR DE BAJA A VENDEDOR
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String doc=JOptionPane.showInputDialog("Documento del Jefe de Zona");
        for(int i=0; i<jefes.size();i++){
            if(doc.compareTo(jefes.get(i).getDoc())==0){
                String doc1=JOptionPane.showInputDialog("Documento del Vendedor");
                for(int j=0; j<vendedores.size();j++){
                    if(doc1.compareTo(vendedores.get(j).getDoc())==0){
                        jefes.get(i).Eliminar_Vendedor(vendedores.get(j));
                    }
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    
    //AGREGAR SECRETARIO CORRESPONDIENTE
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
         String doc=JOptionPane.showInputDialog("Documento del Jefe de Zona");
        for(int i=0; i<jefes.size();i++){
            if(doc.compareTo(jefes.get(i).getDoc())==0){
                String doc1=JOptionPane.showInputDialog("Documento del Secretario");
                for(int j=0; j<secretarios.size();j++){
                    if(doc1.compareTo(secretarios.get(j).getDoc())==0){
                        jefes.get(i).cambiar_secretario(secretarios.get(j));
                    }
                }
            }
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    
    //BOTON CAMBIAR AUTOMOVIL
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        String documento=JOptionPane.showInputDialog("Documento");     
        String matricula=JOptionPane.showInputDialog("Nueva Matricula Carro");
        String marca=JOptionPane.showInputDialog("Nueva Marca de Carro");
        String modelo=JOptionPane.showInputDialog("Nuevo Modelo Carro");
        
        for(int i=0; i<jefes.size(); i++){
            if(documento.compareTo(jefes.get(i).getDoc())==0){
                jefes.get(i).setMatricula(matricula);
                jefes.get(i).setMarca(marca);
                jefes.get(i).setModelo(modelo);
            }
        }
        
    }//GEN-LAST:event_jButton8ActionPerformed

    
    //BOTON REGRESAR
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Vent_Jefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vent_Jefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vent_Jefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vent_Jefe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vent_Jefe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

    public ArrayList<Jefe> getJefes() {
        return jefes;
    }

    public void setJefes(ArrayList<Jefe> jefes) {
        this.jefes = jefes;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    public ArrayList<Secretario> getSecretarios() {
        return secretarios;
    }

    public void setSecretarios(ArrayList<Secretario> secretarios) {
        this.secretarios = secretarios;
    }
}
