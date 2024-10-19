public class maxSubarraysum1 {

//method - 3 using kadanes algo

    public static void kadanes(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        int curr = 0;
        for (int i = 0; i < numbers.length; i++) {
            curr = curr + numbers[i];

            largest = Math.max(curr, largest);
            smallest = Math.min(curr, smallest);
        }
        System.out.println("Largest sum of a subarray : " + largest);
        System.out.println("smallest sum of a subarray : " + smallest);

    }

    public static void main(String args[]) {
        int numbers[] = {-2, -3 , 4 ,-1 , -2 , 1 , 5 , -3};
        System.out.println("given array :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        kadanes(numbers);
    }
}
