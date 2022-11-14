package Asistensi2;
import java.util.Scanner;

import java.util.ArrayList;

public class ProsesSepatu{
    Scanner input = new Scanner(System.in);

    public ArrayList<InfoSepatu> arraydata = new ArrayList<>();

    public void add_data()
    {

        
        String name, price;
        int stock;

        System.out.print("\nNama Sepatu : ");
        name = input.nextLine();
        System.out.print("Harga : Rp. ");
        price = input.nextLine();
        System.out.print("Stock : ");
        stock = input.nextInt();
        input.nextLine();

        arraydata.add(new InfoSepatu(name, price, stock));


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