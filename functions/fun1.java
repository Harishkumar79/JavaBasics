import java.util.*;

public class fun1{

    public static void printhello(){
        System.out.println("Hello world!!");
    }

    public static int calsum(int num1 , int num2){
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String args[]){
        System.out.println("Welcome to ");
        printhello();

        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = calsum(a,b);
            System.out.println("sum is :"+sum);
        }
        catch(Exception e){
            System.err.println("error");
        }
    }
}