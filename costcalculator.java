import java.util.*;

 //Items bill with +18% GST.
public class costcalculator{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter the cost of items :");
            System.out.println("1.cost of pencil :");
            int a = sc.nextInt();
            System.out.println("2.cost of pen :");
            int b = sc.nextInt();
            System.out.println("3.cost of eraser :");
            int c = sc.nextInt();

            float cost = a+b+c;
            System.out.println("COST :"+cost);
            float gst = (cost * 0.18f); 
            System.out.println("GST : +"+gst);
            float total = cost + gst;
            System.out.println("Total cost :"+total);
        }
    }
}