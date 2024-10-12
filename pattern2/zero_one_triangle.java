import java.util.*;

public class zero_one_triangle {

    public static void zero_one_triangle(int rows){
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= i ; j++){
                if( (i + j) % 2 == 0 ){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter row:");
            int a = sc.nextInt();
            zero_one_triangle(a);
        }
    }   
}
