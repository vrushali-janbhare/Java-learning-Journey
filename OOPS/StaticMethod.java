
//Write a Java program with a static method square(int n) that returns the square of a number. Call the method from main().

public class StaticMethod {
    public static void main(String[] args) {
        int num=5;
     int square= SquareOfNumber.square(num);  
        System.out.println("Square of "+num+" is : "+square);
    }
}
class SquareOfNumber{
     static int square(int n){
       return n*n;
     }
}
