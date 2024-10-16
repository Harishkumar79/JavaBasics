public class array_arguments{

    public static void update(int marks[] ,int unchangeable){
        unchangeable = 10; // updated but changes not reflected to main because it passed as Call by value
        System.out.println("updated vale of unchangeable in update function " +unchangeable);
        for(int i = 0 ; i < marks.length ; i++){
            marks[i] = marks[i]+1; // it will change the original array because array is Pass by Reference
        }
    }

    public static void main(String args[]){
        int marks[] = {12,51,23,62,41};
        int unchangeable = 5;
        update(marks , unchangeable);

        System.out.println("original in main "+unchangeable); // unchanged
        for(int i = 0 ; i < marks.length ; i++){
            System.out.println("marks of subject " + i + " : " + marks[i]);
        }
    }
}