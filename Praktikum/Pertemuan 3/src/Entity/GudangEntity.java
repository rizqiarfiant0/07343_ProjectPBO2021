package Entity;

public class GudangEntity extends GudangEntityAbstract {
    protected String id;

    public GudangEntity(String id, String merek, String size, String warna){
        super (merek, size, warna);
        this.id = id;
    }
    public String getId(){
        return id;
    }

    public void setId (String id){
        this.id = id;
    }
}
