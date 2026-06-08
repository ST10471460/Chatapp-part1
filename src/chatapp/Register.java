
package chatapp;

import java.util.Scanner;

public class Register {
    
    //---------username---------
    //validate username restrictions
    public static boolean ValidUsername(String username){
        //cannot exceed 5 chars
        return username.length()<=5 && username.contains("_");
    }
    //-----------------------------
    
    public static String UserName(){
        
        //used scanner import to allow user input
         Scanner userinput = new Scanner(System.in);
        
        //---------username---------
        //loop until correct format
        while(true){
        System.out.println("Hi user, please enter your Username(It should contain"
                + " an underscore and not exceed 5 characters).");
        String username = userinput.nextLine();
        
            //shows if the username is correct or incorrect 
            //with the following "if" or "else" statements.
        boolean usernameValid = ValidUsername(username);
        
        if (usernameValid){
            System.out.println("Username sucessfully captured.");
            System.out.println("Hi, " + (username));
            return username;    //return so ChatApp can store it
        }
        else{
            System.out.println("Username is not correctly formatted,"
                    + " please ensure that your "
                    + "username contains an underscore and is no more"
                    + " than five characters in length.");
        }
        }//-----------------------------
        
    }
}
