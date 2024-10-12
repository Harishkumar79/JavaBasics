import java.util.*;

public class floyds_traingle {

    public static void floyds_traingle(int rows){
        int count = 1;
        for(int i = 1 ; i <= rows ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter row:");
            int a = sc.nextInt();
            floyds_traingle(a);
        }
    }   
}
