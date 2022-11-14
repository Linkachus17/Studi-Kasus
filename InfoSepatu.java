package Asistensi2;

public class InfoSepatu{
    String nama;
    String harga;
    int stok;


    public InfoSepatu(String name, String price, int stock){
        this.nama = name;
        this.harga = price;
        this.stok = stock;
    }

    public void cetak()
    {
        System.out.println("Nama : "+this.nama);
        System.out.println("Harga : "+this.harga);
        System.out.println("Stok : "+this.stok+"\n");
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
}
