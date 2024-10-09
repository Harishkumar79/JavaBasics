import java.util.*;

public class printnumbers{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.println("Enter number:");
            int n = sc.nextInt();

            int i =  1;
            while (i<=n) {
                System.out.println(i);
                i++;
            }
        } catch (Exception e) {
            System.err.println();
        }
    }
}