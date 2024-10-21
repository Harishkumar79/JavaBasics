public class countingSort{

    //sorting
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        // finding max range
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // count the frequency
        int count[] = new int[largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // insert the value
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) { 
                arr[j] = i;
                j++;
                count[i]--;
            }
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
        int arr[] = {1,2,4,2,1,3,1,2,4,5};
        System.out.println("Given array : ");
        printArray(arr); // before sort

        countingSort(arr);

        System.out.println("sorted array : ");
        printArray(arr); // after sort
    }
}