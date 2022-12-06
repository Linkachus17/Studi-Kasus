package Asistensi.Process;
import java.util.Scanner;

import Asistensi.MainSepatu;
import Asistensi.Entity.EntityUser;


class CheckCred{
    String User = "admin";
    String Passwd = "admin";

    void repeat(){
        ProsesLogin repeat = new ProsesLogin();
    }
}



public class ProsesLogin extends EntityUser{
    CheckCred checkcred = new CheckCred();
    Scanner input = new Scanner(System.in);

    public ProsesLogin(){
        
        // Ask User and Password
        System.out.print("Username : ");
        user = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        // Check User Credetnial
        if (checkcred.User.equals(user)){ 
            if (checkcred.Passwd.equals(password)){
                System.out.println("Credential Valid!\n");

                // Enter to MainSepatu
                MainSepatu mainSepatu = new MainSepatu();

            }
            else if (user != checkcred.User || password != checkcred.Passwd){
                System.out.println("Credential Invalid! Wrong User or Password?");
                
                //Go back and retry
                checkcred.repeat();
            }
        }
        else if (user != checkcred.User || password != checkcred.Passwd){
            System.out.println("Credential Invalid! Wrong User or Password?");
            
            //Go back and retry
            checkcred.repeat();
        }
    }
}