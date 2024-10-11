
import java.util.*;

public class decimaltobin{

    // program to convert decimal number into binary number:

    public static int DecimalTo1bin(int num){
        int power = 0;
        int binary = 0;

        while(num > 0){
            int reminder = num % 2;
            binary = binary + (reminder * (int)Math.pow(10,power));
            power++; 
            num = num/2;
        }
        return binary;
    }

    public static void main(String args[]) {
        System.out.println("Enter a number :");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println("binary of "+ a +" is : " + DecimalTo1bin(a));
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
