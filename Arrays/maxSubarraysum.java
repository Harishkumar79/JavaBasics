public class maxSubarraysum {

//method - 2 using prefix array

    public static void maxSubarraysum(int numbers[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }

        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                int sum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
                //compair sum with largest
                if (largest < sum) {
                    largest = sum;
                }
            }
        }
        System.out.println("Largest sum of a subarray : " + largest);
    }

    public static void main(String args[]) {
        int numbers[] = {1, -2, 3 , -4};
        System.out.println("given array :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        maxSubarraysum(numbers);
    }
}
