/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loginapp;

import java.util.ArrayList;
import java.util.Scanner;
import static loginapp.Login.registerUser;

/**
 *
 * @author Dell
 */
public class LoginApp {

    private static void loginUser(String userNameLogin, String PasswordLogin) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * @param args the command line arguments
     */
    String UserName = "kyl_1";
    String Password = "Ch&&sec@ke9";
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<User>();
          Scanner myObj = new Scanner(System.in); 
    System.out.println("Enter username");

    String userName = myObj.nextLine();  
    System.out.println("Enter Password");

    String Password = myObj.nextLine();  
        
   registerUser(userName,Password,user);    
        
        System.out.println("Enter Login username");

    String userNameLogin = myObj.nextLine();  
    System.out.println("Enter Login Password");

    String PasswordLogin = myObj.nextLine();  
        
    loginUser(userNameLogin ,PasswordLogin);
    }
    
}
