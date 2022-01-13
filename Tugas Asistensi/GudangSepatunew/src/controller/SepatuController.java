package controller;

import entity.Original;
import entity.Kw;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import model.OriginalList;
import model.KwList;

public class SepatuController {
    
    final String MYSQL_URL    = "jdbc:mysql://localhost:3306/gudangsepatu_New";
    final String MYSQL_DRIVER = "com.mysql.cj.jdbc.Driver";
    final String USERNAME     = "root";
    final String PASSWORD     = "";
    
    Statement STATEMENT = null;
    PreparedStatement PREPARED_STMT = null;
    Connection CONN = null;
    ResultSet RS;
    
    private final OriginalList listOriginal = new OriginalList();
    private final KwList listKw = new KwList();
    
    public boolean proses(String query) {
        try {
            Class.forName(MYSQL_DRIVER);
            CONN = DriverManager.getConnection(MYSQL_URL, USERNAME, PASSWORD);
            PREPARED_STMT = CONN.prepareStatement(query);

            PREPARED_STMT.execute();

            PREPARED_STMT.close();
            CONN.close();
            
            return true;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public void setTable(String query1, String query2, JTable tabel) {
        
        DefaultTableModel tabelModel = new DefaultTableModel();
        tabelModel.addColumn("No");
        tabelModel.addColumn("Jenis");
        tabelModel.addColumn("ID");
        tabelModel.addColumn("Nama");
        tabelModel.addColumn("Harga");
        try{
            Class.forName(MYSQL_DRIVER);
            CONN = DriverManager.getConnection(MYSQL_URL, USERNAME, PASSWORD);
            STATEMENT = CONN.createStatement(); 
            RS = STATEMENT.executeQuery(query1);
            
            int i = 1;
            while(RS.next()) {
                tabelModel.addRow(new Object[]{
                    i,
                    "Original",
                    RS.getString("id"),
                    RS.getString("nama"),
                    RS.getString("harga"),
                });
                i++;
            }
            
            RS = STATEMENT.executeQuery(query2);
            
            while(RS.next()) {
                tabelModel.addRow(new Object[]{
                    (i+1),
                    "Kw",
                    RS.getString("id"),
                    RS.getString("nama"),
                    RS.getString("harga"),
                });
                i++;
            }
            tabel.setFont(new java.awt.Font("Roboto", 0, 12));
            tabel.setModel(tabelModel);
            
            RS.close();
            STATEMENT.close();
            CONN.close();
        } catch(HeadlessException | ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    
    public boolean isEmptyOriginal() {
        return listOriginal.len() == 0;
    }
    
    public boolean isEmptyKw() {
        return listKw.len() == 0;
    }
    
    public int lenOriginal() {
        return listOriginal.len();
    }
    
    public int lenKw() {
        return listKw.len();
    }
    
    public Original getOriginal(int idx) {
        return listOriginal.get(idx);
    }
    
    public Kw getkw(int idx) {
        return listKw.get(idx);
    }
    
    public void addOriginal(Original originalBaru, JLabel txtInformation) {
        
        
        String query = 
                "INSERT INTO `original`\n" +
                "(`id`, `nama`, `harga`, `stok`, `biaya_cukai`) VALUES \n" +
                "('"+ originalBaru.getId() +"', '"+ originalBaru.getNama() +"', '"+ originalBaru.getHarga() +"', '"+ originalBaru.getStok() +"', '"+ originalBaru.getBiayaCukai() +"')";
        
        if(proses(query)) {
            listOriginal.add(originalBaru);
            txtInformation.setText("Sepatu original \""+ originalBaru.getNama() +"\", berhasil disimpan");
        } else {
            txtInformation.setText("Sepatu original \""+ originalBaru.getNama() +"\", gagal disimpan");
        }
        
    }
    
    public void addKw(Kw kwBaru, JLabel txtInformation) {
        
        
        String query = 
                "INSERT INTO `kw`\n" +
                "(`id`, `nama`, `harga`, `stok`) VALUES \n" +
                "('"+ kwBaru.getId() +"', '"+ kwBaru.getNama() +"', '"+ kwBaru.getHarga() +"', '"+ kwBaru.getStok() +"')";
        
        if(proses(query)) {
            listKw.add(kwBaru);
            txtInformation.setText("Sepatu kw \""+ kwBaru.getNama() +"\", berhasil disimpan");
        } else {
            txtInformation.setText("Sepatu kw \""+ kwBaru.getNama() +"\", gagal disimpan");
        }
    }
    
    public void deleteOriginal(int idx, JLabel txtInformation) {
        
        Original originalDihapus = getOriginal(idx);
        
       
        String query = 
                "DELETE FROM `original` \n"
                + " WHERE `id` = '"+ originalDihapus.getId() +"'";
        
        if(proses(query)) {
            listOriginal.delete(idx);
            txtInformation.setText("Sepatu original \""+ originalDihapus.getNama() +"\", berhasil dihapus");
        } else {
            txtInformation.setText("Sepatu original \""+ originalDihapus.getNama() +"\", gagal dihapus");
        }
        
    }
    
    public void deleteKw(int idx, JLabel txtInformation) {
        
        Kw kwDihapus = listKw.get(idx);
        
       
        String query = 
                "DELETE FROM `kw` \n"
                + " WHERE `id` = '"+ kwDihapus.getId() +"'";
        
        if(proses(query)) {
            listKw.delete(idx);
            txtInformation.setText("Sepatu kw \""+ kwDihapus.getNama() +"\", berhasil dihapus");
        } else {
            txtInformation.setText("Sepatu kw \""+ kwDihapus.getNama() +"\", gagal dihapus");
        }
        
    }
    
    public void setKw(int idx, Kw kwBaru, JLabel txtInformation) {
        
       
        String query = 
                "UPDATE `kw` set \n"
                + "`nama` = '"+ kwBaru.getNama() +"', "
                + "`harga` = '"+ kwBaru.getHarga() +"', "
                + "`stok` = '"+ kwBaru.getStok() +"', "
                + " WHERE `id` = '"+ kwBaru.getId() +"'";
        
        if(proses(query)) {
            listKw.update(idx, kwBaru);
            txtInformation.setText("Sepatu kw \""+ kwBaru.getNama() +"\", berhasil dirubah");
        } else {
            txtInformation.setText("Sepatu kw \""+ kwBaru.getNama() +"\", gagal dirubah");
        }
        
    }
    
    public void setOriginal(int idx, Original originalBaru, JLabel txtInformation) {
        
   
        String query = 
                "UPDATE `original` set \n"
                + "`nama` = '"+ originalBaru.getNama() +"', "
                + "`harga` = '"+ originalBaru.getHarga() +"', "
                + "`stok` = '"+ originalBaru.getStok() +"', "
                + "`biaya_cukai` = '"+ originalBaru.getBiayaCukai() +"' "
                + " WHERE `id` = '"+ originalBaru.getId() +"'";
        
        if(proses(query)) {
            listOriginal.update(idx, originalBaru);
            txtInformation.setText("Sepatu original \""+ originalBaru.getNama() +"\", berhasil dirubah");
        } else {
            txtInformation.setText("Sepatu original \""+ originalBaru.getNama() +"\", gagal dirubah");
        }
        
    }
    
    public void init() {
        listOriginal.clear();
        listKw.clear();
        
        try {
            Class.forName(MYSQL_DRIVER);
            CONN = DriverManager.getConnection(MYSQL_URL, USERNAME, PASSWORD);
            STATEMENT = CONN.createStatement();
            RS = STATEMENT.executeQuery("SELECT * FROM original");

            while (RS.next()) {
                listOriginal.add(new Original(
                        RS.getString("id"), 
                        RS.getString("nama"),
                        RS.getInt("harga"),
                        RS.getInt("stok"),
                        RS.getInt("biaya_cukai")
                ));
            }
            
            RS = STATEMENT.executeQuery("SELECT * FROM kw");

            while (RS.next()) {
                listKw.add(new Kw(
                        RS.getString("id"), 
                        RS.getString("nama"),
                        RS.getInt("harga"),
                        RS.getInt("stok")
                ));
            }

            RS.close();
            STATEMENT.close();
            CONN.close();
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    
    public int cariOriginal(String diDicari) {
        return listOriginal.cari(diDicari);
    }
    
    public int cariKw(String diDicari) {
        return listKw.cari(diDicari);
    }
}