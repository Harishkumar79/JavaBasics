import java.util.Scanner;


// sum of two integers
public class sum {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println(sum);
        }
    }
}