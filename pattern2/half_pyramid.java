import java.util.*;

public class half_pyramid {

    public static void half_pyramid(int rows){
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= rows - i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the row :");
            int a = sc.nextInt();
            half_pyramid(a);
        }
    }   
}
