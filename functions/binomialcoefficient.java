import java.util.*;

public class binomialcoefficient{

    // Binomial calculator 

    public static int factorial(int num){
        int f = 1;
        for(int i = 1 ; i <= num ; i++){
            f *= i;
        }
        return f;
    }

    public static int Bio_coefficient(int n , int r){
        // nCr = n!/r!(n-r)! 
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);

        int bc = n_fact / ( r_fact * nmr_fact ); 
        return bc;
    }


    public static void main(String args[]){
        System.out.println("Enter two number to find Binomial Coefficient :");
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("coefficient is : "+Bio_coefficient(a,b));
        }
        catch(Exception e){
            System.err.println("error");
        }
    }
}