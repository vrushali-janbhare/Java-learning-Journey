
// Write a Java program that accepts a student's name and marks through 
// command-line arguments. Create a method checkResult(int marks) that displays 
// "Pass" if marks are 35 or above, othcd oopserwise "Fail".
public class CommandLineArgumentsMethod {
    public static void main(String[] args) {
        int marks=Integer.parseInt(args[1]);
        System.out.print("The Student : "+args[0]);
    checkResult( marks);       
     
    }
    static void checkResult(int marks){
        if(marks>=35){
            System.out.print(" is Pass");
        }
        else{
          System.out.print(" is Fail");

        }
    } 
}
