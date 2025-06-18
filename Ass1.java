public class Ass1 {
    public static void main(String[] args) {
        boolean prime;
        for (int i = 2; i < 50; i++) {
            prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;

                }
            }
            if (prime ==true){
                System.out.println(i+ "is prime");
            }
        }


    }


}