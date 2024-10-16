import java.util.*;

public class linear_search1{

    public static int linear_search(String cars[] , String key){
        for (int i = 0; i < cars.length; i++) {
            if(cars[i] == null ? key == null : cars[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        String cars[] = {"bmw","thar","scorpio","jeep","lamborgini"};
        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Enter a car name to search in the array :");
            String key = sc.next();
            int index = linear_search(cars,key);
            if(index == -1){
                System.out.println("car not found in array");
            }else{
                System.out.println("car found at index: " + index);
            }
        }
    }
}