package Asistensi;
import java.util.Scanner;


class CheckCred{
    String User = "admin";
    String Passwd = "admin";

    void repeat(){
        Cred repeat = new Cred();
    }
}



public class Cred extends DataInheritance{
    CheckCred checkcred = new CheckCred();
    Scanner input = new Scanner(System.in);

    Cred(){
        String pwd;
        
        // Ask User and Password
        System.out.print("Username : ");
        nama_data = input.nextLine();

        System.out.print("Password : ");
        pwd = input.nextLine();

        // Check User Credetnial
        if (checkcred.User.equals(nama_data)){ 
            if (checkcred.Passwd.equals(pwd)){
                System.out.println("Credential Valid!");

                //Enter to DataSepatu
                ProsesSepatu prosesSepatu = new ProsesSepatu();

            }
            else if (nama_data != checkcred.User || pwd != checkcred.Passwd){
                System.out.println("Credential Invalid! Wrong User or Password?");
                
                //Go back and retry
                checkcred.repeat();
            }
        }
        else if (nama_data != checkcred.User || pwd != checkcred.Passwd){
            System.out.println("Credential Invalid! Wrong User or Password?");
            
            //Go back and retry
            checkcred.repeat();
        }
    }
}