package myproject.s29315tpo04blog.exception;

public class UserNotFoundException extends Exception {
    public UserNotFoundException() {
        System.out.println("User not found");
    }
}
