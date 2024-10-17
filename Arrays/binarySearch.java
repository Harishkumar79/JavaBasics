
import java.util.Scanner;

public class binarySearch {

    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            //mid of array
            int mid = (start + end) / 2;

            //compaire
            if (numbers[mid] == key) { // founds
                return mid;
            }
            if (numbers[mid] < key) {  // right search
                start = mid + 1;
            } else {                   // left search
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; //sorted array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search in array :");
        int key = sc.nextInt();
        int index = binarySearch(numbers, key);
        if (index == -1) {
            System.out.println("number not found");
        } else {
            System.out.println("number found at index: " + index);
        }
    }
}
