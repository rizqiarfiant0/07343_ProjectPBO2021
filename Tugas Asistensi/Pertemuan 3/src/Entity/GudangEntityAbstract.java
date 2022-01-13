package Entity;

public abstract class GudangEntityAbstract {
    private String merek;
    private String size;
    private String warna;

    public GudangEntityAbstract(String merek, String size, String warna){
        this.merek = merek;
        this.size = size;
        this.warna = warna;
    }

    public String getMerek(){
        return merek;
    }
    public void setMerek (String merek){
        this.merek = merek;
    }
    public String getSize(){
        return size;
    }
    public void setSize (String size){
        this.size = size;
    }
    public String getWarna(){
        return warna;
    }
    public void setWarna (String warna){
        this.warna = warna;
    }
}
