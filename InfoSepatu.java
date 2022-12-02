package Asistensi;

public class InfoSepatu extends DataInheritance{
    // String nama;
    // String harga;
    // int stok;


    public InfoSepatu(String name, String price, int stock){
        // this.nama = name;
        // this.harga = price;
        // this.stok = stock;
        nama_data = name;
        harga_sepatu = price;
        stock_sepatu = stock;

    }

    public void cetak()
    {
        System.out.println("Nama : "+ nama_data);
        System.out.println("Harga : "+ harga_sepatu);
        System.out.println("Stok : "+ stock_sepatu +"\n");
    }

    public String getNama() {
        return nama_data;
    }

    public String getHarga() {
        return harga_sepatu;
    }

    public int getStok() {
        return stock_sepatu;
    }

    public void setNama(String nama) {
        this.nama_data = nama;
    }

    public void setHarga(String harga) {
        this.harga_sepatu = harga;
    }
    public void setStok(int stok) {
        this.stock_sepatu = stok;
    }
}
