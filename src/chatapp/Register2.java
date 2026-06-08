
package chatapp;

import java.util.Scanner;

public class Register2 {
    
    //Special character
     private static boolean SpecialCharacter(char ch) {
         //define special char
        String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>/?`~";
        return specialChars.indexOf(ch) >= 0;
    }
    
    //validate username restrictions
    //length, capitalisation, number, special character
    public static boolean ValidPassword(String password){
        //reject short passwords
        if (password.length() < 8){
        return false;
        }
        
        //flags to see if requirements are met
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

            //loop to ensure all rules apply
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if (SpecialCharacter(ch)) {
                hasSpecial = true;
            }
        }
        return hasUpper && hasNumber && hasSpecial;
    }
    
    
     //---------password---------
    public static String password (){
        
        // userinput for the password
        Scanner userinput2 = new Scanner(System.in);
        
        //loop until valid password
    while(true){
        System.out.println("Please create a password"
                + "(it should includea capital letter, number, "
                + "special character and be atleast 8 characters.");
        
        String password = userinput2.nextLine();
        
       
        // if or else statement if requirements are met
         if (ValidPassword(password)) {
            System.out.println("Password is sucessfully captured.");
            return password;    //return so ChatApp can store it
        } else {
            System.out.println("Password is not correctly formatted;"
                    + " please ensure that the "
                    + "password contains at least eight characters, "
                    + "a capital letter, a number, and a special character");
       
        }
    }
    }         
}
