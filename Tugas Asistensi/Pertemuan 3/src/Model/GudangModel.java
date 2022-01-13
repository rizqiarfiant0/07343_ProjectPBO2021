package Model;
import Entity.GudangEntity;
import Controller.KoneksiDb;
import java.util.ArrayList;

public class GudangModel {
    protected KoneksiDb koneksi = new KoneksiDb();
    public ArrayList<GudangEntity> gudang = new ArrayList<GudangEntity>();
    public GudangModel(){
        koneksi.getconnection();
    }
    public void toSingkrone(){
        String sql = "select * from Gudangsepatu";
        try{
            koneksi.rs = koneksi.stmt.executeQuery(sql);    
            while (koneksi.rs.next()){
                gudang.add(new GudangEntity(koneksi.rs.getString("merek"), koneksi.rs.getString("size"), koneksi.rs.getString("warna"), koneksi.rs.getString("id")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void insert (String id, String merek, String size, String warna){
     gudang.add(new GudangEntity(id, merek, size, warna));
     try{
         String sql = "INSERT INTO Gudangsepatu (id, merek, size, warna) VALUES ('%s', '%s', '%s', '%s')";
         sql = String.format(sql, id, merek, size, warna);
         koneksi.stmt.execute(sql);
     }catch (Exception e){
         System.out.println("Data gagal dibuat.\n");
         e.printStackTrace();
     }
    }
    
    public void display(){
        System.out.println("====================");
        System.out.println("    Data Sepatu     ");
        System.out.println("====================");
    for (int i = 0; i < gudang.size(); i++){
        System.out.println(String.format(" id : %s \n merek : %s \n size : %s \n warna : %s \n+-----------------------------------+", gudang.get(i).getId(), gudang.get(i).getMerek(), gudang.get(i).getSize(), gudang.get(i).getWarna()));
        }
    }
    
    public void update(String id, String merek, String size, String warna){
        try{
            String sql = "UPDATE Gudangsepatu SET Merek ='%s', Size = '%s', warna = '%s' WHERE id = '%s'";
            sql = String.format(sql, merek, size, warna, id);
            koneksi.stmt.executeUpdate(sql);
            System.out.println("Data telah di update");
            gudang.clear();
            toSingkrone();
        }catch (Exception e){
            System.out.println("Update data gagal");
            e.printStackTrace();
        }
    }
    
    public void delete(String id){
        try{
            String sql = "DELETE FROM Gudangsepatu WHERE id = '%s' "; 
            sql = String.format(id);
            koneksi.stmt.execute(sql);
            System.out.println("Data telah terhapus");
            gudang.clear();
            toSingkrone();
        }catch (Exception e){
            System.out.println("Data gagal terhapus");
             e.printStackTrace();
        }
    }
}
