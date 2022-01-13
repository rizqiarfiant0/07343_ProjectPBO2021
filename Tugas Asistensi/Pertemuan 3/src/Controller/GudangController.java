package Controller;
import Model.GudangModel;

public class GudangController {

    public GudangModel GudangModel = new GudangModel();
    public void Singkrone(){
        GudangModel.toSingkrone();
    }
    public void insert(String id, String merek, String size, String warna){
        GudangModel.insert(id, merek, size, warna);
    }

    public void display(){
        GudangModel.display();
    }

    public void update(String id, String merek, String size, String warna){
        GudangModel.update(id, merek, size, warna);
    }

    public void delete(String id){
        GudangModel.delete(id);
    }

    private void toSyc() {
        throw new UnsupportedOperationException("Not supported yet.");                                                   
    }
    
}
