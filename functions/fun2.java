import java.util.*;

public class fun2{

    public static int factorial(int num){
        int f = 1;
        for(int i = 1 ; i <= num ; i++){
            f *= i;
        }
        return f;
    }

    public static void main(String args[]){
        System.out.println("Enter a number :");
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            System.out.println(factorial(a));
        }
        catch(Exception e){
            System.err.println("error");
        }
    }
}