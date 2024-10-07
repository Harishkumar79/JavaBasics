import java.util.*;

//calculate average of 3 number
public class average{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter three number to calulate average :");
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();

            double avrg = (a+b+c)/3;
            System.out.println("Average is :"+avrg);
        }
    }
}