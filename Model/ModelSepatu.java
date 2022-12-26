package Model;

public class ModelSepatu {
    protected String namaSepatu;
    protected int hargaSepatu;
    protected int stockSepatu;

    public void setNama(String nama) {
        this.namaSepatu = nama;
    }

    public void setHarga(int harga) {
        this.hargaSepatu = harga;
    }

    public void setStok(int stock) {
        this.stockSepatu = stock;
    }

    public String getNama() {
        return namaSepatu;
    }

    public int getHarga() {
        return hargaSepatu;
    }

    public int getStok() {
        return stockSepatu;
    }
}
