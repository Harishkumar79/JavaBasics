import java.util.*;

public class linear_search{

    public static int linear_search(int numbers[] , int key){
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int numbers[] = {1,8,6,5,6,10,55,27,45,100};
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a number to search in the array :");
            int key = sc.nextInt();
            int index = linear_search(numbers,key);
            if(index == -1){
                System.out.println("number not found");
            }else{
                System.out.println("number found at index: " + index);
            }
        }
    }
}