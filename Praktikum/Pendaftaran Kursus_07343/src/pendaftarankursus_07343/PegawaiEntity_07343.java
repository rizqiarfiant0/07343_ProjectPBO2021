package pendaftarankursus_07343;

public class PegawaiEntity_07343 extends BiodataEntity_07343 {
    private  String password_07343;
    
    public PegawaiEntity_07343(String password_07343, String nama_07343, String noTelp_07343, String alamat_07343){
        super(nama_07343, noTelp_07343, alamat_07343);
        this.password_07343 = password_07343;
    }
    
    public String getpassword_07343() {
        return password_07343;
    }
    
    public void setPassword_07343(String password_07343){
        this.password_07343 = password_07343;
    }

    @Override
    public String getNama_07343() {
        return nama_07343;
    }

    @Override
    public void setNama_07343(String nama_07343) {
        this.nama_07343 = nama_07343;
    }

    @Override
    public String getNoTelp_07343() {
        return noTelp_07343;
    }

    @Override
    public void setNoTelp_07343(String noTelp_07343) {
        this.noTelp_07343 = noTelp_07343;
    }

    @Override
    public String getAlamat_07343() {
        return alamat_07343;
    }

    public void setAlamat_07343(String alamat_07343) {
        this.alamat_07343 = alamat_07343;
    }
}