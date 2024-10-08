import java.util.*;

 //Simple calculator using switch statement.
public class calculator{
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter two number :");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Enter the operator :");
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+' -> System.out.println("Result ="+(a+b));
                case '-' -> System.out.println("Result ="+(a-b));
                case '*' -> System.out.println("Result ="+(a*b));
                 case '/' -> System.out.println("Result ="+(a/b));
                case '%' -> System.out.println("Result ="+(a%b));
                default -> throw new AssertionError();
            }
        }
    }
}