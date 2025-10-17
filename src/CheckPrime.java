import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number to check if it is prime number or not:");
        int number = input.nextInt();
        if (isPrime(number)) {
            System.out.println("the number you have entered is prime");
        } else {
            System.out.println("the number you have entered is not prime");
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

