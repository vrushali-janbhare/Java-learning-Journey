// Write a Java program with a static method isEven(int n) that checks whether
//  a number is even or odd. Call the method from main() and display the result.
public class StaticMethod1 {
    public static void main(String[] args) {
        int num=20;
        Methodsss.isEven(num);
    }
}
class Methodsss{
    static void isEven(int n){
        if (n%2==0){
            System.out.println("The Number Is Even ");
        }
        else {
            System.out.println("Number is Odd ");
        }
    }
}
