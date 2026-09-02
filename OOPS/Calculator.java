// Create a Calculator class with overloaded methods to perform addition of two and three numbers.

public class Calculator{
   public static void main(String[] args) {
      Calculator c1= new Calculator();
      System.out.println("Sum of two Number : "+c1.add(10, 20));
      System.out.println("Sum of Three Numbers : "+c1.add(10,20,30));
   }
  int add(int num1 ,int num2){
    return num1+num2;
  }
  int add(int num1,int num2,int num3){
    return num1+num2+num3;
  }
   

}

