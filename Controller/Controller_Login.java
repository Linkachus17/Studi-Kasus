package Controller;
import java.util.Scanner;

import Entity.EntityUser;


class CheckCred{
    String User = "admin";
    String Passwd = "admin";

    void repeat(){
        Controller_Login repeat = new Controller_Login();
    }
}



public class Controller_Login extends EntityUser{
    CheckCred checkcred = new CheckCred();
    Scanner input = new Scanner(System.in);

    public Controller_Login(){
        
        // Ask User and Password
        System.out.print("Username : ");
        user = input.nextLine();

        System.out.print("Password : ");
        password = input.nextLine();

        // Check User Credetnial
        if (checkcred.User.equals(user)){ 
            if (checkcred.Passwd.equals(password)){
                System.out.println("Credential Valid!\n");

                // Enter to view.MainSepatu
                // new MainSepatu().mainsepatu();
                Controller_Menu mainSepatu = new Controller_Menu();


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