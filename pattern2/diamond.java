import java.util.*;

public class diamond{

    public static void diamond(int rows){
        //1st half
        for(int i = 1 ; i <= rows ; i++){
            // space 
            for(int j = 1 ; j <= (rows-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= ((2 * i ) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2st half
        for(int i = rows ; i >= 1 ; i--){
            // space 
            for(int j = 1 ; j <= (rows-i) ; j++){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= ((2 * i ) - 1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter row:");
            int a = sc.nextInt();
            diamond(a);
        }
    }   
}
