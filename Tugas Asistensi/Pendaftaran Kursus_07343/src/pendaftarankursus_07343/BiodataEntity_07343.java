package pendaftarankursus_07343;

public abstract class BiodataEntity_07343 {
    protected String nama_07343, noTelp_07343, alamat_07343;
    
    public BiodataEntity_07343(String nama_07343, String noTelp_07343, String alamat_07343){
        this.nama_07343 = nama_07343;
        this.noTelp_07343 = noTelp_07343;
        this.alamat_07343 = alamat_07343;
    }
    
    public String getNama_07343(){
        return nama_07343;
    }
    
    public void setNama_07343(String nama_07343){
        this.nama_07343 = nama_07343;
    }
    
    public String getNoTelp_07343(){
        return noTelp_07343;
    }
    
    public void setNoTelp_07343(String noTelp_07343){
        this.noTelp_07343 = noTelp_07343;
    }
    
    public String getAlamat_07343(){
        return alamat_07343;
    }
    
    public void setalamat_07343(String alamat_07343){
        this.alamat_07343 = alamat_07343;
    }
}