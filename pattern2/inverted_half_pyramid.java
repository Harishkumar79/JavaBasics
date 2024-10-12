import java.util.*;

public class inverted_half_pyramid {

    public static void inverted_half_pyramid(int rows){
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= rows - i + 1 ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter row :");
            int a = sc.nextInt();
            inverted_half_pyramid(a);
        }
    }   
}
