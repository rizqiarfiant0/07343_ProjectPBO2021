package entity;
public class Original extends Sepatu {
    
    private int biayaCukai;
    
    public Original(String id, String nama, int harga, int stok, int biayaCukai) {
        super(id, nama, harga, stok);
        
        this.biayaCukai = biayaCukai;
    }

    @Override
    public int getTotal() {
        return getHarga() + getBiayaCukai();
    }

    public int getBiayaCukai() {
        return biayaCukai;
    }

    public void setBiayaCukai(int biayaCukai) {
        this.biayaCukai = biayaCukai;
    }
    
    
}
