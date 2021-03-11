package javaapplication1;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Calendar;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class principal extends javax.swing.JFrame {

    JFileChooser RealizarBackupMySQL = new JFileChooser();

    public principal() {
        initComponents();
    }

    void GenerarBackupMySQL() {
        int resp;
        Calendar c = Calendar.getInstance();
        String fecha = String.valueOf(c.get(Calendar.DATE));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.MONTH));
        fecha = fecha + "-" + String.valueOf(c.get(Calendar.YEAR));
        String nombre = this.jTextField1.getText();
        String pass = this.jTextField2.getText();
        String user = this.usertxt.getText();
        resp = RealizarBackupMySQL.showSaveDialog(this);//JFileChooser de nombre RealizarBackupMySQL
        if (resp == JFileChooser.APPROVE_OPTION) {//Si el usuario presiona aceptar; se genera el Backup
            try {
                Runtime runtime = Runtime.getRuntime();
                File backupFile = new File(String.valueOf(RealizarBackupMySQL.getSelectedFile().toString())
                        + "_" + fecha + ".sql");
                FileWriter fw = new FileWriter(backupFile);
                Process child = runtime.exec("C:/xampp/mysql/bin/mysqldump.exe --opt --password= --user=" + user
                        + " --databases " + nombre + " -R");
                InputStreamReader irs = new InputStreamReader(child.getInputStream());
                BufferedReader br = new BufferedReader(irs);

                String line;
                while ((line = br.readLine()) != null) {
                    fw.write(line + "\n");
                }
                fw.close();
                irs.close();
                br.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error no se genero el archivo por el siguiente motivo:" + e.getMessage(), "Verificar", JOptionPane.ERROR_MESSAGE);
            }
            JOptionPane.showMessageDialog(null, "Archivogenerado", "Verificar", JOptionPane.INFORMATION_MESSAGE);
        } else if (resp == JFileChooser.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "Ha sido cancelada la generacion del Backup");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SeleccionarDirectorio = new javax.swing.JFileChooser();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        usertxt = new javax.swing.JTextField();

        SeleccionarDirectorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionarDirectorioActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("nombre base de datos");

        jLabel2.setText("Password");

        jButton2.setText("Crear Backup");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("PostgreSQL");

        jLabel5.setText("Usuario");

        usertxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usertxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                    .addComponent(usertxt)
                    .addComponent(jTextField2))
                .addContainerGap(123, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)))
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(usertxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //SeleccionarDirectorio.setLocation(500, 450);
        SeleccionarDirectorio.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        SeleccionarDirectorio.setFileFilter(new FileNameExtensionFilter("BackUp files (*.backup)", "backup"));
        SeleccionarDirectorio.setDialogTitle("Selecionar la ubicacion para guardar la BD");
        SeleccionarDirectorio.setDialogType(2);
        SeleccionarDirectorio.setApproveButtonText("Guardar ");
        SeleccionarDirectorio.showSaveDialog(this);
        conexion cx = new conexion(jTextField1.getText(), usertxt.getText(), jTextField2.getText());
        Backups b = new Backups();
        int resp = 0;
        if (resp == JFileChooser.APPROVE_OPTION) {
            try {
                Calendar c = Calendar.getInstance();
                String fecha = String.valueOf(c.get(Calendar.DATE));
                fecha = fecha + "-" + String.valueOf(c.get(Calendar.MONTH) + 1);
                fecha = fecha + "-" + String.valueOf(c.get(Calendar.YEAR));
                String path = SeleccionarDirectorio.getSelectedFile().getAbsolutePath() + fecha;//concatenamos el nombre que le ponemos a nuestro backup con la fecha del dia
                String user = cx.getUser();
                String dbase = cx.getNombre();
                String password = cx.getPass();
                b.Crear_Backups("plain", path, cx.getDireccion(), cx.getPuerto(), user, password, dbase);
                JOptionPane.showMessageDialog(null, "Copia de Seguridad realizada con Exito");
            } catch (HeadlessException e) {
            }

        }

    }//GEN-LAST:event_jButton2ActionPerformed


    private void SeleccionarDirectorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionarDirectorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionarDirectorioActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void usertxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usertxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usertxtActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFileChooser SeleccionarDirectorio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
