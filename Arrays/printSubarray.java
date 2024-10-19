public class printSubarray {


//method -1 normal

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

                //compaire sum with largest and smallest value
                if (largest < sum) {
                    largest = sum;  //  sum will be largest if true
                }
                if (smallest > sum) {
                    smallest = sum; // sum will be smallest if true
                }
            }
            System.out.println();
        }
        System.out.println("Total subarray : " + ts);
        System.out.println("Largest sum of a subarray : " + largest);
        System.out.println("Smallest sum of a subarray : " + smallest);
    }

    public static void main(String args[]) {
        int numbers[] = {1, -2, 3 , -4};
        System.out.println("given array :");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("Subarray of given array :");
        printSubarray(numbers);
    }
}

// ***********output************

// given array :
// 1 -2 3 -4 
// Subarray of given array :
// 1 
// sum of subarray is : 1
// 1 -2
// sum of subarray is : -1
// 1 -2 3
// sum of subarray is : 2
// 1 -2 3 -4
// sum of subarray is : -2

// -2
// sum of subarray is : -2
// -2 3
// sum of subarray is : 1
// -2 3 -4
// sum of subarray is : -3

// 3
// sum of subarray is : 3
// 3 -4
// sum of subarray is : -1

// -4
// sum of subarray is : -4

// Total subarray : 10
// Largest sum of a subarray : 3
// Smallest sum of a subarray : -4