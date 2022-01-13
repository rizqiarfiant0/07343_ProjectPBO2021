package mainpackage;

import controller.SepatuController;
import entity.Original;
import entity.Kw;

public class HapusFrame extends javax.swing.JFrame {

    private final SepatuController sepCont = new SepatuController();

    public HapusFrame() {
        initComponents();

        sepCont.init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        txtHarga = new javax.swing.JTextField();
        comboBoxJenis = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtStok = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCukai = new javax.swing.JTextField();
        btnHapus = new javax.swing.JButton();
        btnBersihkan = new javax.swing.JButton();
        btnCek = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtInformation = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 10));

        jPanel2.setBackground(new java.awt.Color(31, 153, 154));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        jPanel4.setBackground(new java.awt.Color(153, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(60, 63, 65));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Nama");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 50, -1));

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(60, 63, 65));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Harga");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 50, -1));

        txtNama.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel4.add(txtNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 260, -1));

        txtHarga.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel4.add(txtHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 260, -1));

        comboBoxJenis.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        comboBoxJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lokal", "Import" }));
        jPanel4.add(comboBoxJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 260, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(60, 63, 65));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Stok");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 50, -1));

        txtStok.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel4.add(txtStok, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 260, -1));

        jLabel9.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(60, 63, 65));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Cukai");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 50, -1));

        txtCukai.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel4.add(txtCukai, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 260, -1));

        btnHapus.setBackground(new java.awt.Color(255, 255, 255));
        btnHapus.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnHapus.setForeground(new java.awt.Color(150, 56, 80));
        btnHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete_20x20.png"))); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });
        jPanel4.add(btnHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 120, 50));

        btnBersihkan.setBackground(new java.awt.Color(255, 255, 255));
        btnBersihkan.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnBersihkan.setForeground(new java.awt.Color(133, 108, 57));
        btnBersihkan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear_20x20.png"))); // NOI18N
        btnBersihkan.setText("Bersihkan");
        btnBersihkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBersihkanActionPerformed(evt);
            }
        });
        jPanel4.add(btnBersihkan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 120, 50));

        btnCek.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        btnCek.setText("cek");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        jPanel4.add(btnCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 50, 25));

        txtID.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel4.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 200, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(60, 63, 65));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("ID");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 50, -1));

        jLabel10.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(60, 63, 65));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Jenis");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, -1));

        txtInformation.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        txtInformation.setForeground(new java.awt.Color(60, 63, 65));
        txtInformation.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jPanel4.add(txtInformation, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 350, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 380, 390));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("HAPUS DATA");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        String jenis = comboBoxJenis.getSelectedItem().toString();
        String id = txtID.getText();

        if (jenis.equals("Kw")) {
            int idxDicari = sepCont.cariKw(id);

            if (idxDicari == -1) {
                txtInformation.setText("Barang dengan ID \"" + id + "\" tidak ditemukan");
            } else {
                sepCont.deleteKw(idxDicari, txtInformation);
            }
        } else {
            int idxDicari = sepCont.cariOriginal(id);

            if (idxDicari == -1) {
                txtInformation.setText("Barang dengan ID \"" + id + "\" tidak ditemukan");
            } else {
                sepCont.deleteOriginal(idxDicari, txtInformation);
            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void btnBersihkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBersihkanActionPerformed
        comboBoxJenis.setSelectedIndex(0);
        txtID.setText("");
        txtNama.setText("");
        txtHarga.setText("");
        txtStok.setText("");

        txtInformation.setText("");
    }//GEN-LAST:event_btnBersihkanActionPerformed

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        String jenis = comboBoxJenis.getSelectedItem().toString();
        String id = txtID.getText();

        if (jenis.equals("Kw")) {
            int idxDicari = sepCont.cariKw(id);

            if (idxDicari == -1) {
                txtInformation.setText("Barang dengan ID \"" + id + "\" tidak ditemukan");
            } else {
                Kw kwDirubah = sepCont.getkw(idxDicari);

                txtNama.setText(kwDirubah.getNama());
                txtHarga.setText("" + kwDirubah.getHarga());
                txtStok.setText("" + kwDirubah.getStok());
            }
        } else {
            int idxDicari = sepCont.cariOriginal(id);

            if (idxDicari == -1) {
                txtInformation.setText("Barang dengan ID \"" + id + "\" tidak ditemukan");
            } else {
                Original originalDirubah = sepCont.getOriginal(idxDicari);

                txtNama.setText(originalDirubah.getNama());
                txtHarga.setText("" + originalDirubah.getHarga());
                txtStok.setText("" + originalDirubah.getStok());
            }
        }
    }//GEN-LAST:event_btnCekActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HapusFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HapusFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBersihkan;
    private javax.swing.JButton btnCek;
    private javax.swing.JButton btnHapus;
    private javax.swing.JComboBox<String> comboBoxJenis;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtCukai;
    private javax.swing.JTextField txtHarga;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtInformation;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}