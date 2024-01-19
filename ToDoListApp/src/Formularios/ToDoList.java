package Formularios;

import Clases.Conexion;
import Clases.TextPrompt;
import javax.swing.JOptionPane;
import java.sql.*;

public class ToDoList extends javax.swing.JFrame {
    
    Conexion conectar = Conexion.getInstancia();

    public ToDoList() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("To-Do List");
        TextPrompt placeHolder = new TextPrompt("Agregar tarea...",tf_agregarTarea);
        TextPrompt placeHolder1 = new TextPrompt("Click en el boton \"Consultar Tareas\" para ver todas las tareas",informacion);
        TextPrompt placeHolder2 = new TextPrompt("Numero de tarea a eliminar...",tf_eliminarId);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_simboloMas = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        tf_agregarTarea = new javax.swing.JTextField();
        btn_consultarTareas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        informacion = new javax.swing.JTextArea();
        tf_eliminarId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_eliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(112, 145, 255));

        btn_simboloMas.setBackground(new java.awt.Color(51, 204, 0));
        btn_simboloMas.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        btn_simboloMas.setForeground(new java.awt.Color(255, 255, 255));
        btn_simboloMas.setText("+");
        btn_simboloMas.setAlignmentY(0.0F);
        btn_simboloMas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_simboloMas.setFocusPainted(false);
        btn_simboloMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simboloMasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lista de Tareas");

        tf_agregarTarea.setBackground(new java.awt.Color(255, 255, 255));
        tf_agregarTarea.setForeground(new java.awt.Color(0, 0, 0));
        tf_agregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_agregarTareaActionPerformed(evt);
            }
        });

        btn_consultarTareas.setText("Consultar Tareas");
        btn_consultarTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarTareasActionPerformed(evt);
            }
        });

        informacion.setColumns(20);
        informacion.setRows(5);
        jScrollPane1.setViewportView(informacion);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingresa numero de la tarea a eliminar:");

        btn_eliminar.setText("ELIMINAR");
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tf_eliminarId)
                            .addComponent(btn_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(tf_agregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btn_simboloMas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btn_consultarTareas)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tf_agregarTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_simboloMas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_eliminarId, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_consultarTareas)
                        .addGap(44, 44, 44))))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarTarea(){
        
        if (tf_agregarTarea.getText().equals("")) {
            mostrarErrorTarea();
        }
        
        else {
            try {
                Connection conexion = conectar.conectar();
                PreparedStatement insertar = conexion.prepareStatement("Insert into todolist(tarea) values(?)");
                insertar.setString(1, tf_agregarTarea.getText().trim());
                insertar.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Tarea Registrada");
                
                conectar.cerrarConexion();
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "Error: "+e);
            } 
        }
    }
    
    private void mostrarErrorTarea(){
        JOptionPane.showMessageDialog(rootPane, "Rellenar el campo", "ERROR", JOptionPane.PLAIN_MESSAGE);
    }
    
    private void btn_simboloMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simboloMasActionPerformed
        registrarTarea();
        tf_agregarTarea.setText("");
    }//GEN-LAST:event_btn_simboloMasActionPerformed

    private void tf_agregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_agregarTareaActionPerformed

    }//GEN-LAST:event_tf_agregarTareaActionPerformed

    private void consultarTareas(){
    informacion.setText("");
        
        try {
            Connection conexion = conectar.conectar();
            PreparedStatement seleccionar = conexion.prepareStatement("SELECT * from todolist");
            ResultSet consulta = seleccionar.executeQuery();
            
            while(consulta.next()){
                informacion.append(consulta.getString(2));
                informacion.append("   ");
                informacion.append(consulta.getString(1));
                informacion.append("\n");
            }
            
            conectar.cerrarConexion();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        } 
    }
    
        
    private void btn_consultarTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarTareasActionPerformed
        consultarTareas();
    }//GEN-LAST:event_btn_consultarTareasActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        try {
            Connection conexion = conectar.conectar();
            PreparedStatement eliminar = conexion.prepareStatement("delete from todolist WHERE id=?");
            
            eliminar.setString(1, tf_eliminarId.getText().trim());
            
            JOptionPane.showMessageDialog(null, "Tarea Eliminada");
            
            eliminar.executeUpdate();
            
            conectar.cerrarConexion();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        informacion.setText("");
        consultarTareas();
    }//GEN-LAST:event_btn_eliminarActionPerformed

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
            java.util.logging.Logger.getLogger(ToDoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ToDoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ToDoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ToDoList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ToDoList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultarTareas;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_simboloMas;
    private javax.swing.JTextArea informacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tf_agregarTarea;
    private javax.swing.JTextField tf_eliminarId;
    // End of variables declaration//GEN-END:variables
}
