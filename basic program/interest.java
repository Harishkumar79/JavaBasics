import java.util.Scanner;

// Simple interest calculation
public class interest {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter Principle amount");
            int p = sc.nextInt();
            System.out.println("Enter rate of interest");
            int r = sc.nextInt();
            System.out.println("Enter time period (year)");
            int t = sc.nextInt();

            System.out.println("Total Interest should be :");
            int interset = p*r*t/100;
            System.out.println(interset);

            int total = p+interset;
            System.out.println("Total amount with interest :"+ total);
        }
    }
}
