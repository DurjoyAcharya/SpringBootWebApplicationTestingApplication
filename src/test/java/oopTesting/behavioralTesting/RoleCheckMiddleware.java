package oopTesting.behavioralTesting;

public class RoleCheckMiddleware extends Middleware{
    public boolean check(String email, String password) {
        if (email.equals("da-durjoy@outlook.com")) {
            System.out.println("Hello, Durjoy Acharya!");
            return true;
        }
        System.out.println("Hello, user!");
        return checkNext(email, password);
    }
}
