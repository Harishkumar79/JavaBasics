import java.util.*;

public class input_output{
    public static void main(String args[]){
        int marks[] = new int[5];
        try(Scanner sc = new Scanner(System.in)){
            marks[0] = sc.nextInt();
            marks[1] = sc.nextInt();
            marks[2] = sc.nextInt();
            marks[3] = sc.nextInt();
            marks[4] = sc.nextInt();

            System.out.println("maths : "+ marks[0]);
            System.out.println("physics : "+ marks[1]);
            System.out.println("chemistry : "+ marks[2]);
            System.out.println("hindi : "+ marks[3]);
            System.out.println("english : "+ marks[4]);


            // updatation in array 

            // marks[0] = 98; //update
            // System.out.println("updated maths marks : "+ marks[0]);

            if(marks[0] <= 90){
                marks[0] = marks[0] + 15; //update
                System.out.println("updated maths marks : "+ marks[0]);
            }

            float Total = (marks[0]+marks[1]+marks[2]+marks[3]+marks[4]);
            System.out.println("total marks : "+ Total);
            float percentage = (Total/5);
            System.out.println("Percentage : "+ percentage +"%");

        }
    }
}