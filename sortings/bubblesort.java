public class bubblesort{

    //sorting
    public static void bubblesort(int arr[]) {
        for (int i = 0; i < (arr.length-1); i++) {
            int swap = 0;
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                if(arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                    swap++;
                }
            }

            // for case of sorted array 
            // by using this TC is decreased to O(n) in best case .
            
            if(swap == 0){
                System.out.println("break called");
                break;
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
        int arr[] = {1,2,3,4,5};
        System.out.println("Given array : ");
        printArray(arr); // before sort

        bubblesort(arr);

        System.out.println("sorted array : ");
        printArray(arr); // after sort
    }
}