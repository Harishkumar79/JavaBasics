import java.util.*;

// implementaion of break and continue keyword.
public class multiplicationtable{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number :");
            int n = sc.nextInt();

            for(int i = 1 ; i <= 10 ; i++){
               System.out.println(n+"*"+i+":"+n*i); 
            }
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}