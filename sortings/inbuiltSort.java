import java.util.*;
public class inbuiltSort{

    // print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            System.out.print(elem+" ");
        }
        System.out.println();
    }

    public static void printArray1(Integer arr2[]) {
        for(Integer i = 0; i < arr2.length; i++) {
            Integer elem = arr2[i];
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

        int arr[] = {4,5,2,6,3};
        System.out.println("Given array : ");
        printArray(arr); // before sort

        System.out.println("sorted array : ");
        Arrays.sort(arr);  // output 2 3 4 5 6
        printArray(arr); // after sort

        // Arrays.sort(arr , 0 , 3);  // output = 2 4 5 6 3 
        // printArray(arr); // after sort



        // object type array

        Integer arr2[] = {4,5,2,6,3};
        System.out.println("Given array 1 : ");
        printArray1(arr2); // before sort


        System.out.println("sorted array 1 : ");
        Arrays.sort(arr2, Collections.reverseOrder());  // output = 6 5 4 3 2
        printArray1(arr2);

        // Arrays.sort(arr2 , 0 , 3 , Collections.reverseOrder());  // output = 5 4 2 6 3
        // printArray1(arr2);
    }
}