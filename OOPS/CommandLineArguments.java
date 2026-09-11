
//Write a Java program that accepts two numbers through command-line 
// arguments and displays their addition, subtraction, multiplication, and division.
public class CommandLineArguments {
    public static void main(String[] args) {
     int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
    
        System.out.println("Addition : "+(a+b));
        System.out.println("Subtraction : "+(a-b));
        System.out.println("multiplication : "+(a*b));
        System.out.println("division : "+(a/b));
    }
}