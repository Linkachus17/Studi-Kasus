package Asistensi;
import java.util.Scanner;

import java.util.ArrayList;

public class ProsesSepatu extends DataInheritance{
    Scanner input = new Scanner(System.in);

    public ArrayList<InfoSepatu> arraydata = new ArrayList<>();

    public void add_data()
    {
        // String name, price;
        // int stock;

        System.out.print("\nNama Sepatu : ");
        nama_data = input.nextLine();
        System.out.print("Harga : Rp. ");
        harga_sepatu = input.nextLine();
        System.out.print("Stock : ");
        stock_sepatu = input.nextInt();
        input.nextLine();

        arraydata.add(new InfoSepatu(nama_data, harga_sepatu, stock_sepatu));
    }

    public void view(){
        System.out.println("Output -=-=-=-=-=-=-=-=-=-=-");
        for(int loop = 0; loop < arraydata.size(); loop++){
            arraydata.get(loop).cetak();
        }
    }

    public int sizeArray(){
        return arraydata.size();
    }

    public void editNama(int index){
        System.out.print("Edit Nama : ");
        String EditNama = input.nextLine();
        arraydata.get(index).setNama(EditNama);
        System.out.println("\n");
    }

    public void editHarga(int index){
        System.out.print("Edit Harga : Rp");
        String EditHarga = input.nextLine();
        arraydata.get(index).setHarga(EditHarga);
        System.out.println("\n");
    }

    public void editStock(int index){
        System.out.print("Edit Stock : ");
        int EditStock = input.nextInt();
        arraydata.get(index).setStok(EditStock);
        System.out.println("\n");
    }

    public void delete(int index){
        arraydata.remove(index);
    }

}