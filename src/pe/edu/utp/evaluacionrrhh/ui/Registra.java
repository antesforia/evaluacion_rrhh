package pe.edu.utp.evaluacionrrhh.ui;

import pe.edu.utp.evaluacionrrhh.model.Registrarse;
import pe.edu.utp.evaluacionrrhh.service.RegistrarseService;
import pe.edu.utp.evaluacionrrhh.service.impl.RegistrarseServicesImpl;
import javax.swing.JOptionPane;

public class Registra extends javax.swing.JFrame {

    private RegistrarseService registrarseService = new RegistrarseServicesImpl();

    public Registra() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_Registro = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        Panel_DatRegis = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtdni = new javax.swing.JTextField();
        txtedad = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtusername = new javax.swing.JTextField();
        txtcontraseña = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        Panel_Button = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_Registro.setBackground(new java.awt.Color(102, 102, 102));
        Panel_Registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/samsungIcon.png"))); // NOI18N
        Panel_Registro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 0, 234, 75));

        Panel_DatRegis.setBackground(new java.awt.Color(51, 51, 51));
        Panel_DatRegis.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRIMER NOMBRE");
        Panel_DatRegis.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 31, -1, -1));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("APELLIDO PATERNO");
        Panel_DatRegis.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 143, -1, -1));

        jLabel6.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DNI");
        Panel_DatRegis.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 249, 37, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("EDAD");
        Panel_DatRegis.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 303, -1, -1));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CORREO");
        Panel_DatRegis.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 352, 100, -1));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USERNAME");
        Panel_DatRegis.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 402, 78, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("CONTRASEÑA");
        Panel_DatRegis.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 452, 100, -1));
        Panel_DatRegis.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 31, 206, -1));
        Panel_DatRegis.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 140, 206, -1));
        Panel_DatRegis.add(txtdni, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 246, 88, -1));
        Panel_DatRegis.add(txtedad, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 297, 46, -1));
        Panel_DatRegis.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 349, 206, -1));
        Panel_DatRegis.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 399, 206, -1));
        Panel_DatRegis.add(txtcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 449, 206, -1));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("SEGUNDO NOMBRE");
        Panel_DatRegis.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 88, -1, -1));

        jLabel11.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("APELLIDO MATERNO");
        Panel_DatRegis.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 197, -1, -1));
        Panel_DatRegis.add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 85, 208, -1));
        Panel_DatRegis.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 197, 206, -1));

        Panel_Registro.add(Panel_DatRegis, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 380, 510));

        Panel_Button.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Panel_ButtonLayout = new javax.swing.GroupLayout(Panel_Button);
        Panel_Button.setLayout(Panel_ButtonLayout);
        Panel_ButtonLayout.setHorizontalGroup(
            Panel_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_ButtonLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        Panel_ButtonLayout.setVerticalGroup(
            Panel_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel_ButtonLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Panel_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        Panel_Registro.add(Panel_Button, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 670, 320, 80));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/IconRegistrar.png"))); // NOI18N
        Panel_Registro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, 100));

        getContentPane().add(Panel_Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 760));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        txtPrimerNombre.setText("");
        txtSegundoNombre.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtdni.setText("");
        txtedad.setText("");
        txtcorreo.setText("");
        txtusername.setText("");
        txtcontraseña.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Registrarse registrarse = new Registrarse();
        registrarse.setPrimer_nombre(txtPrimerNombre.getText());
        registrarse.setSegundo_nombre(txtSegundoNombre.getText());
        registrarse.setApellido_paterno(txtApellidoPaterno.getText());
        registrarse.setApellido_materno(txtApellidoMaterno.getText());
        registrarse.setDni(txtdni.getText());
        registrarse.setEdad(Integer.parseInt(txtedad.getText()));
        registrarse.setCorreo(txtcorreo.getText());
        registrarse.setUsername(txtusername.getText());
        registrarse.setContraseña(txtcontraseña.getText());

        boolean guardoCorrectamente = registrarseService.guardar(registrarse);

        if (guardoCorrectamente) {
            JOptionPane.showMessageDialog(this, "Guardo correctamente");
        } else {
            JOptionPane.showMessageDialog(this, "No se guardo correctamente");
        }


    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Registra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel_Button;
    private javax.swing.JPanel Panel_DatRegis;
    private javax.swing.JPanel Panel_Registro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtcontraseña;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedad;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
