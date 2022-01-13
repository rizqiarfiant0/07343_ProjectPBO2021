package entity;
public class Kw extends Sepatu {
    
    public Kw(String id, String nama, int harga, int stok) {
        super(id, nama, harga, stok);
    }

    @Override
    public int getTotal() {
        return getHarga();
    }
    
}
