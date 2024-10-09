import java.util.*;

// implementaion of break and continue keyword.
public class break_continue{
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            do{
                System.out.println("Enter a number :");
                int n = sc.nextInt();
                if(n == 0){
                    System.out.println("number is 0");
                    break;
                }else if(n%5 == 0){
                    System.out.println("number is multiple of 5");
                }else{
                    System.out.println("your number"+n);
                }
            }while(true);
            System.out.println("exit loop");

        } catch (Exception e) {
            System.err.println("error");
        }
    }
}