import java.util.*;

public class hollow_rhombus{

    public static void hollow_rhombus(int rows){
        for(int i = 1 ; i <= rows ; i++){
            // space 
            for(int j = 1 ; j <= (rows-i) ; j++){
                System.out.print(" ");
            }

            //hollow rectangle code
            for(int j = 1 ; j <= rows; j++){
                if( i == 1 || i == rows || j == 1 || j == rows){
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
            System.out.println("Enter row:");
            int a = sc.nextInt();
            hollow_rhombus(a);
        }
    }   
}
