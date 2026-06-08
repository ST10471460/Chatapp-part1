package chatapp;

import java.util.Scanner;
import java.util.regex.*;

public class Register3 {
    
    //minimum lentgh country code (3 digits), + (1 digit),
    //7 digit number{short inter national number}
    private static final int MIN_PHONE_LENGTH = 9;
    
    //max length 12 digit number is longest
    private static final int MAX_PHONE_LENGTH = 16;
    
    //method to validate length of number
    public static boolean ValidNumber(String number){
       if(number.length()< MIN_PHONE_LENGTH ||number.length()> MAX_PHONE_LENGTH){
           System.out.println("Error: Phonumber must be between 9 and 16 digits");
           return false;
       }
         
    
    //method to validate the number being given to have an country number
          String regex = "^\\+(?:[0-9]{1,3})[0-9]{10,}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(number);
            return matcher.matches();  
    }
    
  
    public static String phone(){
    
        //scanner for user input for the phonenumber
        Scanner userinput3 = new Scanner(System.in);
        
        
        //loop until valid number
        while(true){
        System.out.println("Please enter your country number and phone number. ");
        
        String number = userinput3.nextLine();
        
        //validates rules
        if (ValidNumber(number)){
            System.out.println("Cell phone number successfully added.");
            return number;  //return so chatApp can store it
        }
        //show format error
        else {
            if(number.length()>= MIN_PHONE_LENGTH && number.length() <= MAX_PHONE_LENGTH){
            System.out.println("Cell phone number incorrectly formatted "
                    + "or does not contain international code");
        }
        }
    }
   }
   
}