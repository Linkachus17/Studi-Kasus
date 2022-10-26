import java.util.Scanner;

class infoSepatu{
    String nama_sepatu;
    int ukuran_sepatu;
    int harga_sepatu;
    
    public infoSepatu(String nama,int ukuran,int harga){
        nama_sepatu = nama;
        ukuran_sepatu = ukuran;
        harga_sepatu = harga;
    }
}

public class praktikum{
    public void main(String[]args) {
        String nama;
        int ukuran;
        int harga;

        Scanner input = new Scanner(System.in);

        System.out.print("Nama Sepatu : ");
        nama = input.nextLine();

        System.out.print("Ukuran Speatu : ");
        ukuran = input.nextInt();

        System.out.print("Harga Sepatu : Rp");
        harga = input.nextInt();

        infoSepatu inf = new infoSepatu(nama, ukuran, harga);

        System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");

        System.out.println("Nama Sepatu : " + inf.nama_sepatu);
        System.out.println("Ukuran Sepatu : " + inf.ukuran_sepatu);
        System.out.println("Harga Sepatu : Rp" + inf.harga_sepatu);
        
    }
}
