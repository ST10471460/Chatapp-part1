package chatapp;

import java.util.Scanner;

public class ChatApp {
    
   
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        //----------Registeration----------
        
       System.out.println("----------Registeration----------");
       
        //collect and validate inputs in their own loops until condiontions are met
       String username = Register.UserName();
       String password = Register2.password();
       String phone = Register3.phone();
    
       //store registered user in Login object
       Login registeredUser = new Login(phone, username, password);
        System.out.println("\n Registeration complete.");
    
        //----------Login----------
        System.out.println("\n----------Login----------");
        // attempts before lockout 
        int attempts = 3;
        
        //loop to add limited amount of login attempts
        while (attempts > 0){
            System.out.println("Enter username:");
            String loginUsername = scanner.nextLine();
            
            System.out.println("Enter password:");
            String loginPassword = scanner.nextLine();
            
          //Validate crediantials against stored user
         if (LoginClass.loginUser(loginUsername, loginPassword, registeredUser)){
             
            //credintials matched
             System.out.println("\n Login successfull, welcome " + registeredUser.getUserName());
             return;
         }
         else{
         attempts--; //credintials didnt match
         //the counter for attempts left
            if (attempts >0){
                System.out.println("Attempts remaining: " + attempts);
            }
         }
        }
   
        //used all attempts and program closes
        System.out.println("Too many failed attempts. The program will now exit.");
        scanner.close();        //close scanner to free system resorces
    }
}
