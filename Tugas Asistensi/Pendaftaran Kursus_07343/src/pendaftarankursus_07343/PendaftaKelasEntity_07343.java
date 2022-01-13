package pendaftarankursus_07343;

public class PendaftaKelasEntity_07343 extends BiodataEntity_07343 {
    private String umur_07343;
    
    public PendaftaKelasEntity_07343(String umur_07343, String nama_07343, String noTelp_07343, String alamat_07343){
        super(nama_07343, noTelp_07343, alamat_07343);
        this.umur_07343 = umur_07343;
    }
    
    public String getumur_07343(){
        return umur_07343;
    }
    
    public void setUmur_07343(String umur_07343){
        this.umur_07343 = umur_07343;
    }
}