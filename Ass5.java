
import java.util.Scanner;

    public class Ass5 {
        static double balance = 0;
        static String pin;

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            while (true) {
                System.out.print("Samee PIN (4-digit): ");
                pin = sc.nextLine();
                if (pin.matches("\\d{4}")) break;
                System.out.println("PIN-ka waa inuu ahaadaa 4 digit ");
            }

            int tries = 3;
            while (tries-- > 0) {
                System.out.print("Geli PIN: ");
                if (sc.nextLine().equals(pin)) {
                    menu(sc);
                    return;
                }
                System.out.println("PIN qalad ah. Fursado: " + tries);
            }
            System.out.println("Nidaamka wuu xirmay ");
            sc.close();
        }

        static void menu(Scanner sc) {
            while (true) {
                System.out.println("\n1. Deposit\n2. Withdraw\n3. Balance\n4. Exit");
                System.out.print("Dooro: ");
                int c = sc.nextInt();
                if (c == 1) {
                    System.out.print("Lacag deposit: ");
                    balance += sc.nextDouble();
                } else if (c == 2) {
                    System.out.print("Lacag withdraw: ");
                    double w = sc.nextDouble();
                    if (w <= balance) balance -= w;
                    else System.out.println("Lacag kugu filan ma jirto ");
                } else if (c == 3) {
                    System.out.println("Balance: $" + balance);
                } else if (c == 4) {
                    System.out.println("Exit ");
                    break;
                } else {
                    System.out.println("Doorasho khaldan ");
                }
            }
        }
    }


