import java.util.*;

// Program to find area of square
public class areaofsquare{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter side of square :");
            int a = sc.nextInt();
            int area = a*a;
            System.out.println("Area of square is :"+area);
        }
    }
}