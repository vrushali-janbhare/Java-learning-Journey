public class LargestofThreeNumbers {
    public static void main(String[] args) {
        //Write a Java program to find the largest among three numbers using if-else-if ladder.
      int number1=10,number2=20,number3=30;
        System.out.println("Number1= "+number1+"\nNumber2 ="+number2+"\nNumber3 ="+number3);

        if(number1>number2 && number1>number3)
            System.out.println("Number1 is largest");
        else if(number2>number3 && number2>number1)
            System.out.println("Number2 is largest");
        else 
            System.out.println("Number 3 is largest");
    }
}
