public class insertionSort{

    //sorting
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //for find correct position
            while (prev >= 0 && arr[prev] > curr) { 
                arr[prev+1] = arr[prev];
                prev--;
            }
            // to  insert at correct positon
            arr[prev+1] = curr;

        }
    }

     // print array
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int elem = arr[i];
            System.out.print(elem+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {4,5,2,6,3};
        System.out.println("Given array : ");
        printArray(arr); // before sort

        insertionSort(arr);

        System.out.println("sorted array : ");
        printArray(arr); // after sort
    }
}