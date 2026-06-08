
package chatapp;

import java.util.regex.Pattern;


public class LoginClass {
    
    // Check if username meets requirements
    public static boolean checkUserName(String userName) {
        // Check if username is null or empty
        if (userName == null || userName.isEmpty()) {
            System.out.println("Error: Username cannot be empty.");
            return false;
        }
        
        // Check if username contains required underscore
        if (!userName.contains("_")) {
            System.out.println("Error: Username must contain an underscore (_).");
            return false;
        }
        
        // Check if username is not too long
        if (userName.length() > 5) {
            System.out.println("Error: Username must not exceed 5 characters.");
            return false;
        }
        
        return true;
    }
    
    //  check if password meets complexity requirements
    public static boolean checkPasswordComplexity(String password) {
        // Check if password is null or empty
        if (password == null || password.isEmpty()) {
            System.out.println("Error: Password cannot be empty.");
            return false;
        }
        
        // Check minimum length requirement
        if (password.length() < 8) {
            System.out.println("Error: Password must be at least 8 characters.");
            return false;
        }
        
        // Check for uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Error: Password must contain an uppercase letter.");
            return false;
        }
        
        // Check for at least one digit
        if (!password.matches(".*\\d.*")) {
            System.out.println("Error: Password must include at least one digit.");
            return false;
        }
        
        // Check for special character
        if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*")) {
            System.out.println("Error: Password must include a special character.");
            return false;
        }
        
        return true;
    }
    
    // Check if cell number is valid South African format
    public static boolean checkCellNumber(String cellNumber) {
        // Check if cell number is null or empty
        if (cellNumber == null || cellNumber.trim().isEmpty()) {
            System.out.println("Error: Please enter a number.");
            return false;
        }
        
        // Validate against South African cell number pattern
        boolean isValid = Pattern.matches("^(\\+27|0)[6-8][0-9]{8}$", cellNumber);
        
        // Show error message if invalid
        if (!isValid) {
            System.out.println("Error: Enter a valid SA number. Examples: 0821234567 or +27821234567");
        }
        
        return isValid;
    }
    
    // Check if login credentials match registered user
    public static boolean loginUser(String userName, String password, Login user) {
        // Compare provided credentials with user's stored credentials
        boolean loginSuccess = userName.equals(user.getUserName()) && password.equals(user.getPassword());
        
        // Show error message if login fails
        if (!loginSuccess) {
            System.out.println("Login failed: Username or password incorrect.");
        }
        
        return loginSuccess;
    }
}
