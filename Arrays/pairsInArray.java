public class pairsInArray {

    public static void pairsInArray(int numbers[]) {
        int count = 0;
        for(int i = 0 ; i < numbers.length ; i++){
            int curr = numbers[i]; // hold current element
            for (int j = i+1; j < numbers.length; j++) {
                System.out.print("(" + curr + " , " + numbers[j] + ") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs in array : " + count);
    }

    public static void main(String args[]) {
        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("given array :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        System.out.println("pair in array :");
        pairsInArray(numbers);
    }
}
