public class SimpleCalculatorSwitch {
    public static void main(String[] args) {
//         Write a Java program that takes:
// ● two numbers
// ● one operator (+, -, *, /)
// and performs the operation using switch.
        int a=10,b=5;
        System.out.println("A=10 and B=20");
        int option=1;
        switch (option) {
            case 1:
                 System.out.println("Addition ="+(a+b));
                break;
            case 2:
                    System.out.println("Subtraction ="+(a-b));
                break;
            case 3:
                   System.out.println("Multiplication ="+(a*b));
                break;
            case 4:
                   System.out.println("Division ="+(a/b));
                break;
            case 5:
                   System.out.println("Remainder ="+(a%b));
                break;            
            default:
                System.out.println("Try again");
                break;
        }
    }
}
