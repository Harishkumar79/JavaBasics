import java.util.*;

public class reverseofanumber{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number to find revers of it :");
            int n = sc.nextInt();

            while (n > 0) {
                int lastdigit = n%10; //get last digit
                System.out.print(lastdigit+" "); 
                
                n = n/10; // remove last digit form number
            }

        } catch (Exception e) {
            System.err.println("error");
        }
    }
}