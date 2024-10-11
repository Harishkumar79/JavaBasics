
import java.util.*;

public class bintodecimal {

    // program to convert binary number into decimal number:

    public static int BinToDecimal(int num){
        int power = 0;
        int decimal = 0;

        while(num > 0){
            int lastDigit = num%10;
            decimal = decimal + (lastDigit * (int)Math.pow(2,power));
            power++;
            num = num / 10; 
        }
        return decimal;
    }

    public static void main(String args[]) {
        System.out.println("Enter a binary number :");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            System.out.println("decimal of "+ a +" is : " + BinToDecimal(a));
        } catch (Exception e) {
            System.err.println("error");
        }
    }
}
