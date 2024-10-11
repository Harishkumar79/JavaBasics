
public class functionoverloading{

    // concept of functionoverloading 
    // Note :- return type have no impact => int mul();, float mul(); both are treated as same and give error 

    //1. by number of perameters
    public static int mul(int a , int b){
        return a*b;
    }

    public static int mul(int a , int b , int c){
        return a*b*c;
    }

    //2. by data type

    public static int div(int a , int b){
        return a/b;
    }

    public static float div(float a , float b ){
        return a/b;
    }

   
    public static void main(String args[]){
        System.out.println("mult of two number :"+mul(10,20));
        System.out.println("mult of three number :"+mul(10,20,30));
        System.out.println("div of two intigers :"+div(20,20));
        System.out.println("div of two float :"+div(3.5f,2.5f));
    }
}