public class selectionSort{

    //sorting
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
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

        selectionSort(arr);

        System.out.println("sorted array : ");
        printArray(arr); // after sort
    }
}