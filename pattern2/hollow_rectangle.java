import java.util.*;

public class hollow_rectangle {

    public static void hollow_rectangle(int rows , int cols){
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= cols ; j++){
                if(i == 1 || i == rows || j == 1 || j == cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter row and col :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            hollow_rectangle(a, b);
        }
    }   
}
