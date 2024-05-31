/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pe.edu.utp.evaluacionrrhh.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import pe.edu.utp.evaluacionrrhh.model.OfertaTrabajo;
import pe.edu.utp.evaluacionrrhh.service.OfertaTrabajoService;
import pe.edu.utp.evaluacionrrhh.service.impl.OfertaTrabajoServicesImpl;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author jalvarea
 */
public class GenerarOfertaTrabajo extends javax.swing.JFrame {

    private HashMap<String, String[]> cargosPorArea;
    private OfertaTrabajoService ofertaTrabajoService = new OfertaTrabajoServicesImpl();

    /**
     * Creates new form GenerarOferta
     */
    public GenerarOfertaTrabajo() {
        initComponents();

    }

    public String[] datos(String datos) {
        String[] informacion = new String[6];
        if (datos.equalsIgnoreCase("Artes y Entretenimiento")) {
            informacion[0] = "Actor/Actriz";
            informacion[1] = "Artista visual";
            informacion[2] = "Director de cine";
            informacion[3] = "Músico";
        }
        if (datos.equalsIgnoreCase("Educación")) {
            informacion[0] = "Coordinador de formación y desarrollo";
            informacion[1] = "Director escolar";
            informacion[2] = "Instructor(a) de capacitación";
            informacion[3] = "Maestro de primaria/secundaria";
        }
        if (datos.equalsIgnoreCase("Finanzas y Contabilidad")) {
            informacion[0] = "Analista de riesgos";
        }
        if (datos.equalsIgnoreCase("Ingeniería")) {
            informacion[0] = "Ingeniero civil";
            informacion[1] = "Ingeniero de control de calidad";
            informacion[2] = "Ingeniero de redes";
            informacion[3] = "Ingeniero de software";
            informacion[4] = "Ingeniero eléctrico";
            informacion[5] = "Ingeniero mecánico";
        }
        if (datos.equalsIgnoreCase("Marketing y Publicidad")) {
            informacion[0] = "Analista de mercado";
            informacion[1] = "Director de marketing";
            informacion[2] = "Especialista en marketing digital";
            informacion[3] = "Publicista";
        }
        if (datos.equalsIgnoreCase("Recursos Humanos")) {
            informacion[0] = "Especialista en compensación y beneficios";
            informacion[1] = "Especialista en desarrollo organizacional";
            informacion[2] = "Especialista en reclutamiento";
            informacion[3] = "Gerente de recursos humanos";
        }
        if (datos.equalsIgnoreCase("Salud y Medicina")) {
            informacion[0] = "Farmacéutico";
            informacion[1] = "Investigador médico";
            informacion[2] = "Médico";
            informacion[3] = "Terapeuta físico";
        }
        if (datos.equalsIgnoreCase("Servicios al Cliente")) {
            informacion[0] = "Coordinador de servicios al cliente";
            informacion[1] = "Especialista en experiencia del cliente";
            informacion[2] = "Representante de atención al cliente";
            informacion[3] = "Gerente de éxito del cliente";
        }
        if (datos.equalsIgnoreCase("Tecnología de la Información (TI)")) {
            informacion[0] = "Desarrollador de software";
            informacion[1] = "Especialista en soporte técnico";
        }
        if (datos.equalsIgnoreCase("Ventas")) {
            informacion[0] = "Asociado de ventas internacionales";
            informacion[1] = "Gerente de cuentas";
            informacion[2] = "Gerente de producto";
            informacion[3] = "Gerente de ventas";
            informacion[4] = "Representante de ventas";
        }
        return informacion;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cboArea = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        cboCargo = new javax.swing.JComboBox<>();
        JLabel4 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        JLabel5 = new javax.swing.JLabel();
        txtEdadMaxima = new javax.swing.JTextField();
        JLabel6 = new javax.swing.JLabel();
        txtSueldoMaximo = new javax.swing.JTextField();
        JLabel7 = new javax.swing.JLabel();
        txtFechaEntrevista = new javax.swing.JTextField();
        cboModalidad = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 51));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Area:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cargo a postular:");

        cboArea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Area", "Artes y Entretenimiento", "Educación", "Finanzas y Contabilidad", "Ingeniería", "Marketing y Publicidad", "Recursos Humanos", "Salud y Medicina", "Servicios al Cliente", "Tecnología de la Información (TI)", "Ventas" }));
        cboArea.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboAreaItemStateChanged(evt);
            }
        });
        cboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAreaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Modalidad:");

        btnCancelar.setBackground(new java.awt.Color(0, 0, 0));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar1.setBackground(new java.awt.Color(0, 0, 0));
        btnGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setText("Guardar");
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });

        cboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Cargo" }));
        cboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCargoActionPerformed(evt);
            }
        });

        JLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JLabel4.setForeground(new java.awt.Color(255, 255, 255));
        JLabel4.setText("Ingresar Direccion:");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        JLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JLabel5.setForeground(new java.awt.Color(255, 255, 255));
        JLabel5.setText("Ingresar Edad Maxima:");

        txtEdadMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadMaximaActionPerformed(evt);
            }
        });

        JLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JLabel6.setForeground(new java.awt.Color(255, 255, 255));
        JLabel6.setText("Ingresar Sueldo Tope:");

        txtSueldoMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoMaximoActionPerformed(evt);
            }
        });

        JLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        JLabel7.setForeground(new java.awt.Color(255, 255, 255));
        JLabel7.setText("Ingresar Fecha Entrevista:");

        txtFechaEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaEntrevistaActionPerformed(evt);
            }
        });

        cboModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Remoto", "Presencial", "Mixto" }));
        cboModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboModalidadActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/OfertaTrabajo.png"))); // NOI18N
        jLabel5.setText("GENERAR OFERTA DE TRABAJO");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(JLabel6)
                                        .addComponent(JLabel7)
                                        .addComponent(JLabel5))
                                    .addGap(33, 33, 33))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(85, 85, 85)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtEdadMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(txtSueldoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFechaEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cboCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel5)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5)
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboModalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel4)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel5)
                    .addComponent(txtEdadMaxima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel6)
                    .addComponent(txtSueldoMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabel7)
                    .addComponent(txtFechaEntrevista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboModalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboModalidadActionPerformed

    private void txtFechaEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaEntrevistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaEntrevistaActionPerformed

    private void txtSueldoMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoMaximoActionPerformed

    private void txtEdadMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadMaximaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadMaximaActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void cboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCargoActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed

        OfertaTrabajo ofertaTrabajo = new OfertaTrabajo();
        ofertaTrabajo.setArea(cboArea.getSelectedItem().toString());
        ofertaTrabajo.setCargo(cboCargo.getSelectedItem().toString());
        ofertaTrabajo.setModalidad(cboModalidad.getSelectedItem().toString());
        ofertaTrabajo.setDireccion(txtDireccion.getText());
        ofertaTrabajo.setEdadMaxima(Integer.parseInt(txtEdadMaxima.getText()));
        ofertaTrabajo.setSueldoTope(Integer.parseInt(txtSueldoMaximo.getText()));
        ofertaTrabajo.setFechaDeEntrevista(LocalDate.parse(txtFechaEntrevista.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        boolean guardoCorrectamente = ofertaTrabajoService.guardar(ofertaTrabajo);

        if (guardoCorrectamente) {
            JOptionPane.showMessageDialog(this, "Guardo correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se guardo correctamente");
        }

    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAreaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboAreaActionPerformed

    private void cboAreaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboAreaItemStateChanged
        // TODO add your handling code here:
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (this.cboArea.getSelectedIndex() > 0) {
                this.cboCargo.setModel(new DefaultComboBoxModel(this.datos(this.cboArea.getSelectedItem().toString())));
            }
        }
    }//GEN-LAST:event_cboAreaItemStateChanged

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
            java.util.logging.Logger.getLogger(GenerarOfertaTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenerarOfertaTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenerarOfertaTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenerarOfertaTrabajo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenerarOfertaTrabajo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabel4;
    private javax.swing.JLabel JLabel5;
    private javax.swing.JLabel JLabel6;
    private javax.swing.JLabel JLabel7;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JComboBox<String> cboCargo;
    private javax.swing.JComboBox<String> cboModalidad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEdadMaxima;
    private javax.swing.JTextField txtFechaEntrevista;
    private javax.swing.JTextField txtSueldoMaximo;
    // End of variables declaration//GEN-END:variables
}
