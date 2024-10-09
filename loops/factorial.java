import java.util.*;

// program to find factorial of a numbers.
public class factorial{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number :");
            int n = sc.nextInt();
            int fact = 1;
            for(int i = 1; i <= n; i++){
                fact *= i;
            }
            System.out.println("factorial of "+ n +" = " +fact );
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}