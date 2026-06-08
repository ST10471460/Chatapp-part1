
package chatapp;


public class Login {
    
     // User's cell phone number
    String number;
    
    // User's login username
    String username;
    
    // User's password
    String password;
    
    // Constructor to create a new user
    public Login(String number, String username, String password) {
        this.number = number;
        this.username = username;
        this.password = password;
    }
    
    // Get the user's cell number
    public String getCellNumber() {
        return number;
    }
    
    // Get the user's username
    public String getUserName() {
        return username;
    }
    
    // Get the user's password
    public String getPassword() {
        return password;
    }
    
}
