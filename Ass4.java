 import java.util.Scanner;
public class Ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number (3 or 4 digits):");
        String num = sc.nextLine();
        int len = num.length();
        boolean ispalindrome = false;
        if (len ==3){
           if (num.charAt(0)==num.charAt(2)){
               ispalindrome= true;
           }
        } else if (len==4) {
            if (num.charAt(0)==num.charAt(3)&&num.charAt(1)==num.charAt(2)){
                ispalindrome = true;

            }
        }
        else {
            System.out.println("please enter only 3 or 4 digit number.");
            return;
        }
        if (ispalindrome){
            System.out.println(num+ " is a palindrome.");
        }
        else {
            System.out.println(num + "is not a palindrome.");
        }
    }
}
