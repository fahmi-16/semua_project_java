/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilai_mhs;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import static nilai_mhs.Filter.digitFilter;
import static nilai_mhs.SimpanTxt.Simpan;

/**
 *
 * @author fahmi
 */
public class NilaiMhs extends javax.swing.JFrame {

    /**
     * Creates new form NilaiMhs
     */
    public NilaiMhs() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        namaTF = new javax.swing.JTextField();
        NilaiJP = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        utsTF = new javax.swing.JTextField();
        tmTF = new javax.swing.JTextField();
        uasTF = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        namaL = new javax.swing.JLabel();
        rataL = new javax.swing.JLabel();
        gradeL = new javax.swing.JLabel();
        hasilL = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButtonHitung3 = new javax.swing.JButton();
        jButtonHapus3 = new javax.swing.JButton();
        jButtonSimpan3 = new javax.swing.JButton();
        jButtonExit3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Penghitung Nilai Mahasiswa");

        jPanel1.setBackground(new java.awt.Color(255, 255, 153));

        jLabel1.setText("Nama Lengkap");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        NilaiJP.setBorder(javax.swing.BorderFactory.createTitledBorder("Nilai"));
        NilaiJP.setToolTipText("");

        jLabel3.setText("UTS");

        jLabel4.setText("TM");

        jLabel5.setText("UAS");

        utsTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                utsTFKeyTyped(evt);
            }
        });

        tmTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tmTFKeyTyped(evt);
            }
        });

        uasTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uasTFKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout NilaiJPLayout = new javax.swing.GroupLayout(NilaiJP);
        NilaiJP.setLayout(NilaiJPLayout);
        NilaiJPLayout.setHorizontalGroup(
            NilaiJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NilaiJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NilaiJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NilaiJPLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uasTF, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(NilaiJPLayout.createSequentialGroup()
                        .addGroup(NilaiJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(5, 5, 5)
                        .addGroup(NilaiJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tmTF)
                            .addComponent(utsTF))))
                .addContainerGap())
        );
        NilaiJPLayout.setVerticalGroup(
            NilaiJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NilaiJPLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(NilaiJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(utsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NilaiJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tmTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(NilaiJPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(uasTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Hasil"));

        namaL.setText("Nama   : ");

        rataL.setText("Nilai Rata-rata : ");

        gradeL.setText("Grade  : ");

        hasilL.setText("Hasil    :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namaL)
                    .addComponent(rataL)
                    .addComponent(gradeL)
                    .addComponent(hasilL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(namaL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rataL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gradeL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(hasilL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 153));

        jButtonHitung3.setText("Hitung");
        jButtonHitung3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonHitung3MouseReleased(evt);
            }
        });

        jButtonHapus3.setText("Bersih");
        jButtonHapus3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonHapus3MouseReleased(evt);
            }
        });

        jButtonSimpan3.setText("Simpan");
        jButtonSimpan3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonSimpan3MouseReleased(evt);
            }
        });

        jButtonExit3.setText("Exit");
        jButtonExit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButtonExit3MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jButtonHitung3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonHapus3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSimpan3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExit3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonHitung3)
                    .addComponent(jButtonHapus3)
                    .addComponent(jButtonSimpan3)
                    .addComponent(jButtonExit3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NilaiJP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NilaiJP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonHapus3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHapus3MouseReleased
        // TODO add your handling code here:
        namaTF.setText("");
        utsTF.setText("");
        tmTF.setText("");
        uasTF.setText("");
        namaL.setText("Nama   : ");
        rataL.setText("Nilai Rata-rata : ");
        gradeL.setText("Grade  : ");
        hasilL.setText("Hasil   : ");
    }//GEN-LAST:event_jButtonHapus3MouseReleased

    private void jButtonSimpan3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSimpan3MouseReleased
        // TODO add your handling code here:
        String n = namaL.getText();
        String r = rataL.getText();
        String g = gradeL.getText();
        String has = hasilL.getText();
        Simpan (n,r,g,has);
    }//GEN-LAST:event_jButtonSimpan3MouseReleased

    private void jButtonExit3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExit3MouseReleased
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this,
            "Konfirmasi Keluar Aplikasi",
            "Yakin untuk keluar dari program",
        JOptionPane.YES_NO_OPTION,
        JOptionPane.QUESTION_MESSAGE);
        if (confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButtonExit3MouseReleased

    private void jButtonHitung3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHitung3MouseReleased
        // TODO add your handling code here:
        double inputuas, inputtm, inpututs, rata;
        String grade, hasil;
        
        if(namaTF.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Error : Nama Belum DiIsi!",
                    "Error: Masukan Nama!", JOptionPane.WARNING_MESSAGE);
        }else{
        
            if (utsTF.getText().isEmpty()){
                inpututs = 0;
            }else{
                inpututs = Double.parseDouble(utsTF.getText());
            }
            
            if (tmTF.getText().isEmpty()){
                inputtm = 0;
            }else{
                inputtm = Double.parseDouble(tmTF.getText());
            }
            
            if(uasTF.getText().isEmpty()){
                inputuas = 0;
            }else{
                inputuas = Double.parseDouble(uasTF.getText());
            }
            
            //rata-rata
            DecimalFormat df = new DecimalFormat("#.##");
            rata = ((inpututs + inputtm + inputuas)/3);
            
            //grade
            if (rata>=90){
                grade = "A";
            }else if (rata >=80 && rata <90){
                grade = "B";
            }else if (rata >=70 && rata <80){
                grade = "C";
            }else{
                grade = "D";
            }
            
            //hasil
            if (grade.equals("A") || grade.equals("B") || grade.equals("C")){
                hasil = "Lulus";
            }else{
                hasil = "Silahkan Mengulang";
            }
            
            //output
            namaL.setText("Nama   : "+namaTF.getText());
            rataL.setText("Nilai Rata-rata : "+df.format(rata)); 
            gradeL.setText("Grade  : "+grade);
            hasilL.setText("Hasil  : "+hasil);
        }
    }//GEN-LAST:event_jButtonHitung3MouseReleased

    private void utsTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_utsTFKeyTyped
        // TODO add your handling code here:
        digitFilter(evt);
    }//GEN-LAST:event_utsTFKeyTyped

    private void tmTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tmTFKeyTyped
        // TODO add your handling code here:
        digitFilter(evt);
    }//GEN-LAST:event_tmTFKeyTyped

    private void uasTFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uasTFKeyTyped
        // TODO add your handling code here:
        digitFilter(evt);
    }//GEN-LAST:event_uasTFKeyTyped

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
            java.util.logging.Logger.getLogger(NilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NilaiMhs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NilaiMhs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel NilaiJP;
    private javax.swing.JLabel gradeL;
    private javax.swing.JLabel hasilL;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonExit1;
    private javax.swing.JButton jButtonExit2;
    private javax.swing.JButton jButtonExit3;
    private javax.swing.JButton jButtonHapus;
    private javax.swing.JButton jButtonHapus1;
    private javax.swing.JButton jButtonHapus2;
    private javax.swing.JButton jButtonHapus3;
    private javax.swing.JButton jButtonHitung;
    private javax.swing.JButton jButtonHitung1;
    private javax.swing.JButton jButtonHitung2;
    private javax.swing.JButton jButtonHitung3;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JButton jButtonSimpan1;
    private javax.swing.JButton jButtonSimpan2;
    private javax.swing.JButton jButtonSimpan3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel namaL;
    private javax.swing.JTextField namaTF;
    private javax.swing.JLabel rataL;
    private javax.swing.JTextField tmTF;
    private javax.swing.JTextField uasTF;
    private javax.swing.JTextField utsTF;
    // End of variables declaration//GEN-END:variables
}
