import java.util.Scanner;

//Program to find some of N natural Numbers
public class sumofn{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the a number to find the sum of n natural numbers :");
            int n = sc.nextInt();
    
            int sum = 0 , val = 1;
            while(val <= n ){
                sum = sum + val;
                val++;
            }
            System.out.println("sum of n natural number is :"+ sum);
        }
    }
}
