public class largestNumber {

    public static int linear_search(int numbers[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE; // +infinity
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest number is : " + smallest);
        return largest;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 8, 6, 5, 6, 10, 55, 27, 45, 100};
        int largest = linear_search(numbers);
        System.out.println("largest number is : " + largest);
    }
}
