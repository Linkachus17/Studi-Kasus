package Asistensi;
import java.util.Scanner;

import Asistensi.Process.ProsesLogin;
import Asistensi.Process.ProsesSepatu;

public class MainSepatu{

    public static Scanner input = new Scanner(System.in);
    // public static ArrayList <InfoSepatu> info = new ArrayList<InfoSepatu>();

    public static void main(String[]args) {
        int pil = -1;
        ProsesSepatu proses_sepatu = new ProsesSepatu(null, 0, 0);
        ProsesLogin proseslogin = new ProsesLogin();

        do{
            System.out.println("Indexes : " + proses_sepatu.sizeArray());
            System.out.println("Menu -=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("1.Create\n2.Read\n3.Update\n4.Delete");
            pil = input.nextInt();
            switch(pil){
                case 1:             // Create
                    proses_sepatu.add_data();
                    System.out.println("Debug Item : " + proses_sepatu.sizeArray() + "\n");
                    break;
                
                case 2:         // Read
                    System.out.println("\n");
                    proses_sepatu.view();
                    break;
                
                case 3:         // Update
                    System.out.println("Indexes : " + proses_sepatu.sizeArray());
                    System.out.println("\nMenu Edit -=-=-=-=-=-=-=-=-=-=-=-");
                    System.out.println("1.Nama\n2.Harga\n3.Stock");
                    int piledit = input.nextInt();

                    switch(piledit){
                        case 1:{    // Update Nama
                            System.out.print("Pilih index : ");
                            int indexEdit = input.nextInt();

                            if(indexEdit > proses_sepatu.sizeArray()){
                                // ...
                            }
                            else{
                                proses_sepatu.editNama(indexEdit);

                            }
                            break;
                        }
                        case 2:{        // Update Harga
                            System.out.print("Pilih index : ");
                            int indexEdit = input.nextInt();

                            if(indexEdit > proses_sepatu.sizeArray()){
                                // ...
                            }
                            else{
                                proses_sepatu.editHarga(indexEdit);

                            }
                            break; 
                        }
                        case 3:{        // Update Stock
                            System.out.print("Pilih index : ");
                            int indexEdit = input.nextInt();

                            if(indexEdit > proses_sepatu.sizeArray()){
                                // ...
                            }
                            else{
                                proses_sepatu.editStock(indexEdit);

                            }
                            break;
                        }
                    }
                    break;
                case 4:{    // Delete
                    System.out.println("Pilih Index : ");
                    int indexEdit = input.nextInt();

                    if(indexEdit > proses_sepatu.sizeArray()){
                        // ...
                    }
                    else{
                        proses_sepatu.delete(indexEdit);
                    }
                    break;
                }
                
            }

        }while(pil != 0);
    }
}