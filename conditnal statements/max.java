import java.util.Scanner;

//Program to find max element between 3 number
public class max{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter three number to find max element :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a>b){
                if(a>c){
                    System.out.println(a+" is maximum");
                }
                else{
                    System.out.println(c+" is maximum");
                }
            }
            else{
                if(b>c){
                    System.out.println(b+" is maximum");
                }
                else{
                    System.out.println(c+" is maximum");
                }
            }
        }
    }
}