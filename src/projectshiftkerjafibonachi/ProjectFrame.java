/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectshiftkerjafibonachi;

import com.sun.glass.events.KeyEvent;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sigit Yudhianto
 */
public class ProjectFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProjectFrame
     */
    public ProjectFrame() {
        initComponents();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension frameSize = getSize();
        setLocation(
        (screenSize.width - frameSize.width) / 2,
        (screenSize.height - frameSize.height) / 2);
    }
    
    public void FilterAngka(java.awt.event.KeyEvent evt){
        char vchar = evt.getKeyChar();
        if (!((Character.isDigit(vchar)
                || (vchar == KeyEvent.VK_BACKSPACE)
                || (vchar == KeyEvent.VK_DELETE)))) {
            evt.consume();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Bschdule = new javax.swing.JButton();
        Ipekerja = new javax.swing.JTextField();
        Ihari = new javax.swing.JTextField();
        Breset = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("PENJADWALAN SHIFT FIBONACCI");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Jumlah Pekerja");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Jumlah Hari Kerja");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Orang");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Hari");

        Bschdule.setText("SCHEDULE!!");
        Bschdule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BschduleActionPerformed(evt);
            }
        });

        Ipekerja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpekerjaActionPerformed(evt);
            }
        });
        Ipekerja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IpekerjaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IpekerjaKeyTyped(evt);
            }
        });

        Ihari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IhariActionPerformed(evt);
            }
        });
        Ihari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                IhariKeyTyped(evt);
            }
        });

        Breset.setText("Reset");
        Breset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BresetActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Ipekerja, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(Ihari))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(46, 46, 46)
                        .addComponent(Bschdule)
                        .addGap(18, 18, 18)
                        .addComponent(Breset)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(160, 160, 160))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Ipekerja, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(Ihari, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(7, 7, 7))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Breset, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bschdule, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BschduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BschduleActionPerformed
        if (Ipekerja.getText().equals("")||(Ihari.getText().equals("")))
        {
            JOptionPane.showMessageDialog(null, "Jumlah Pekerja dan Jumlah hari TIDAK BOLEH Kosong!!");
            Ipekerja.requestFocus();
        }else{
        Integer vpekerja = Integer.valueOf(Ipekerja.getText());
        Integer vhari = Integer.valueOf(Ihari.getText());
        
        Pekerja p1=new Pekerja();
        Hari h2=new Pekerja();
        List hp = null;
        List hr = null;
        try {
            hp = p1.HitungPekerja(vpekerja);
            hr = h2.HitungHari(vhari);
        }catch(NullPointerException ne){
            System.exit(0);
        } catch (CustomException ex) {
            System.out.println(ex.getMessage());
        }    
        p1.print(hp, hr, vpekerja, jTable1);
    }//GEN-LAST:event_BschduleActionPerformed
    }
    
    private void IpekerjaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IpekerjaKeyReleased
        
    }//GEN-LAST:event_IpekerjaKeyReleased

    private void IpekerjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpekerjaActionPerformed
        if (Ipekerja.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Jumlah Pekerja TIDAK BOLEH Kosong!!");
            Ipekerja.requestFocus();
        }else{
        Integer vpekerja = Integer.valueOf(Ipekerja.getText());
        try {
            if (Validasi.validasiPekerja(vpekerja)) {
                Ihari.requestFocus();
            }
        }catch(NumberFormatException nfe){
            System.out.println("input harus int");
        } catch (CustomException ex) {
            Ipekerja.setText("");
            Ipekerja.requestFocus();
        }// TODO add your handling code here:
    }//GEN-LAST:event_IpekerjaActionPerformed
    }
    
    private void IhariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IhariActionPerformed
        
        if (Ihari.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Jumlah hari TIDAK BOLEH Kosong!!");
            Ihari.requestFocus();
        }else{
        Integer vhari = Integer.valueOf(Ihari.getText());
        try {
            if (Validasi.validasiHari(vhari)) {
                BschduleActionPerformed(evt);
            }
        }catch(NumberFormatException nfe){
            System.out.println("input harus int");
        } catch (CustomException ex) {
            Ihari.setText("");
            Ihari.requestFocus();
        }// TOD// TODO add your handling code here:
    }//GEN-LAST:event_IhariActionPerformed
    }
    
    private void BresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BresetActionPerformed
        Ipekerja.setText("");
        Ihari.setText("");
//        Otext.setText("");
        DefaultTableModel oModel = (DefaultTableModel)jTable1.getModel();
        while (oModel.getRowCount()> 0) {            
            for (int i = 0; i < oModel.getRowCount() ; i++) {
                oModel.removeRow(i);
            }
        }
        Ipekerja.requestFocus();        // TODO add your handling code here:
        
    }//GEN-LAST:event_BresetActionPerformed

    private void IpekerjaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IpekerjaKeyTyped
        FilterAngka(evt);
    }//GEN-LAST:event_IpekerjaKeyTyped

    private void IhariKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IhariKeyTyped
        FilterAngka(evt);
    }//GEN-LAST:event_IhariKeyTyped

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
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Breset;
    private javax.swing.JButton Bschdule;
    private javax.swing.JTextField Ihari;
    private javax.swing.JTextField Ipekerja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
