package shildt10.chapter_5;

public class FindPrime {
    public static void main(String[] args) {
        int num;
        boolean isPrime;

        num = 13;
        if (num < 2) isPrime = false;
        else isPrime = true;

        for (int i = 2; i < num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) System.out.println("Num = " + num + " Simple number");
        else System.out.println("Num = " + num + "Not simple number");
    }
}
