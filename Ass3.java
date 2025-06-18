import java.util.Scanner;
public class Ass3 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter numbers to add");
        System.out.println("type 'n' to exist");

        while(true){


            String userinput =  sc.nextLine();
            if (userinput.equalsIgnoreCase("n")){
                break;
            }
        }
    }
}
