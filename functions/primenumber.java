
import java.util.*;

public class primenumber {

    // optimised program to find prime number in a range 2 to n :

    public static boolean isPrime(int a) {
        if (a == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("Enter a range in which you have to find prime numbers :");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            primeInRange(a);
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
