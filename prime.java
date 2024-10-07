import java.util.Scanner;

//program to check number is prime or not
public class prime{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the number to check weather it is prime or not :");
            int a = sc.nextInt();

            int div = 2;
            while(div < a){
                if(a % div == 0){
                    System.out.println("Not a prime number");
                    return;
                }
                else{
                    div++;
                }
            }
            System.out.println("It is a prime number");
        }
    }
}