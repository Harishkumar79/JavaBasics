
public class printSubarray {

    public static void printSubarray(int numbers[]) {
        int ts = 0;
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity

        for (int start = 0; start < numbers.length; start++) {
            for (int end = start; end < numbers.length; end++) {
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum = sum + numbers[k];
                }
                ts++; // count sub array
                System.out.println();
                System.out.println("sum of subarray is : " + sum);

                //****** 
                if(sum > 0) {
                    
                    if (largest < sum) {
                        largest = sum;
                    }
                    if (smallest > sum) {
                        smallest = sum;
                    }
                }
            }
            System.out.println();
        }
        System.out.println("Total subarray : " + ts);       
        System.out.println("Largest sum of a subarray : " + largest);
        System.out.println("Smallest sum of a subarray : " + smallest);
    }

    public static void main(String args[]) {
        int numbers[] = {1,2,3};
        System.out.println("given array :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Subarray of given array :");
        printSubarray(numbers);
    }
}
