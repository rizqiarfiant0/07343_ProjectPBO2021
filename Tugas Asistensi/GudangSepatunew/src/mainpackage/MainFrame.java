package mainpackage;

public class MainFrame extends javax.swing.JFrame {
    
    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnTampil = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        btnRubah = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 410, 10));

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PROGRAM GUDANG SEPATU ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 100));

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnTampil.setBackground(new java.awt.Color(255, 255, 255));
        btnTampil.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnTampil.setForeground(new java.awt.Color(62, 93, 117));
        btnTampil.setText("Tampil");
        btnTampil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTampilActionPerformed(evt);
            }
        });
        jPanel3.add(btnTampil, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 160, 50));

        btnTambah.setBackground(new java.awt.Color(255, 255, 255));
        btnTambah.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnTambah.setForeground(new java.awt.Color(62, 93, 117));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });
        jPanel3.add(btnTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 160, 50));

        btnRubah.setBackground(new java.awt.Color(255, 255, 255));
        btnRubah.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnRubah.setForeground(new java.awt.Color(62, 93, 117));
        btnRubah.setText("Rubah");
        btnRubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRubahActionPerformed(evt);
            }
        });
        jPanel3.add(btnRubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 160, 50));

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(62, 93, 117));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 160, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 230, 300));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 500));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        TambahFrame tambah = new TambahFrame();
        tambah.setVisible(true);
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnRubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRubahActionPerformed
        RubahFrame rubah = new RubahFrame();
        rubah.setVisible(true);
    }//GEN-LAST:event_btnRubahActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        HapusFrame hapus = new HapusFrame();
        hapus.setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnTampilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTampilActionPerformed
        TampilFrame tampil = new TampilFrame();
        tampil.setVisible(true);
    }//GEN-LAST:event_btnTampilActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRubah;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnTampil;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}