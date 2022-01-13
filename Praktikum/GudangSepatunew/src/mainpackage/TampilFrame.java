package mainpackage;

import controller.SepatuController;

public class TampilFrame extends javax.swing.JFrame {

    private final SepatuController sepCont = new SepatuController();

    public TampilFrame() {
        initComponents();

        sepCont.setTable("SELECT * FROM original", "SELECT * FROM kw", tabelSepatu);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelSepatu = new javax.swing.JTable();
        txtDicari = new javax.swing.JTextField();
        btnCek = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 500, 10));

        jPanel2.setBackground(new java.awt.Color(31, 153, 154));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        jPanel3.setBackground(new java.awt.Color(153, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Data  Barang", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Roboto", 1, 10), new java.awt.Color(60, 63, 65))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabelSepatu.setFont(new java.awt.Font("Roboto", 0, 10)); // NOI18N
        tabelSepatu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Jenis", "ID", "Nama", "Harga"
            }
        ));
        jScrollPane1.setViewportView(tabelSepatu);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 440, 280));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 460, 320));

        txtDicari.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jPanel1.add(txtDicari, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 200, -1));

        btnCek.setFont(new java.awt.Font("Roboto", 1, 10)); // NOI18N
        btnCek.setText("cek");
        btnCek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCekActionPerformed(evt);
            }
        });
        jPanel1.add(btnCek, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 50, 25));

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TAMPIL DATA SEPATU");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCekActionPerformed
        String dicari = txtDicari.getText();
        sepCont.setTable(
                "SELECT * FROM original WHERE id LIKE '%"+ dicari +"%' OR nama LIKE '%"+ dicari +"%'", 
                "SELECT * FROM kw WHERE id LIKE '%"+ dicari +"%' OR nama LIKE '%"+ dicari +"%'", 
                tabelSepatu);
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
            java.util.logging.Logger.getLogger(TampilFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TampilFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCek;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabelSepatu;
    private javax.swing.JTextField txtDicari;
    // End of variables declaration//GEN-END:variables
}
