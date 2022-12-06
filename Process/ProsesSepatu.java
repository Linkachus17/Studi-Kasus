package Asistensi.Process;
import java.util.Scanner;

import Asistensi.Entity.EntitySepatu;

import java.util.ArrayList;

public class ProsesSepatu extends EntitySepatu{

    public ProsesSepatu(String nama, int harga, int stock) {
        super(nama, harga, stock);
    }

    Scanner input = new Scanner(System.in);

    public ArrayList<EntitySepatu> arraydata = new ArrayList<>();

    public void add_data()
    {

        System.out.print("\nNama Sepatu : ");
        namaSepatu = input.nextLine();
        System.out.print("Harga : Rp. ");
        hargaSepatu = input.nextInt();
        System.out.print("Stock : ");
        stockSepatu = input.nextInt();
        input.nextLine();

        arraydata.add(new EntitySepatu(namaSepatu, hargaSepatu, stockSepatu));
    }

    public void view(){
        System.out.println("Output -=-=-=-=-=-=-=-=-=-=-");
        for(int loop = 0; loop < arraydata.size(); loop++){
            System.out.println("Index : " + loop);
            arraydata.get(loop).view();
        }
    }

    public int sizeArray(){
        return arraydata.size()-1;
    }

    public void editNama(int index){
        System.out.print("Edit Nama : ");
        String EditNama = input.nextLine();
        arraydata.get(index).setNama(EditNama);
        System.out.println("\n");
    }

    public void editHarga(int index){
        System.out.print("Edit Harga : Rp");
        int EditHarga = input.nextInt();
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