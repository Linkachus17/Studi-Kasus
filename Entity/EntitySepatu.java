package Asistensi.Entity;

public class EntitySepatu implements Interface{
    protected String namaSepatu;
    protected int hargaSepatu;
    protected int stockSepatu;

    public EntitySepatu(String nama, int harga, int stock){
        this.namaSepatu = nama;
        this.hargaSepatu = harga;
        this.stockSepatu = stock;
    }

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

    public void view() {
        System.out.print("-=-=-=-=-=-=-=-=-=-\n");
        System.out.println("Nama Sepatu : " + namaSepatu);
        System.out.println("Harga Sepatu : " + hargaSepatu);
        System.out.println("Stock Sepatu : " + stockSepatu);
        System.out.println("\n");
    }
}
