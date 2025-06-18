import java.util.Scanner;

public class Ass2 {
   public static boolean isString(String password) {
       return password.length()>=6&&
               password.matches(".[A Z].")&&
               password.matches(".[a z].")&&
               password.matches(".//n.")&&
               password.matches(".[!@#$%^&(),.?\":{}<>]*.");

    }

    public static void main(String[] args) {
       Scanner input =new Scanner(System.in);
        System.out.println("enter your password");
        String password =input.nextLine();

        if (isString(password)){
            System.out.println("passwordka waa sax");

        }
       else {

            System.out.println("passwordka waa qalad");
        }
       input.close();
    }
}
