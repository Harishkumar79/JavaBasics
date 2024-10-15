public class create{
    public static void main(String[] args) {
        // create a array of size 10
        int marks[] = new int [10]; // by default take 0 or Null value
        //value assign to array
        //1.
        marks[0] = 5;
        marks[1] = 15;
        marks[2] = 52;
        marks[3] = 54;
        System.out.println(marks[0]); // print first element 5

        // 2.
        for (int i = 0; i < 10; i++) {
            marks[i] = i*5;
        }

        // create array and assign value to array
        int number[] = {1,5,8,5,5,8};
        System.out.println(number[0]); // print first element 1
    }
}