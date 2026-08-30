public class FactorialUsingRecursionFunction {
  public static void main(String[] args) {
     int n=5;
     System.out.println(" Factorial of "+n+ " is :"+FactorialRecursion(n));
  }
  static int FactorialRecursion(int n){
    if(n == 1)
    return 1;
   int fact=1;
   fact=n*FactorialRecursion(n-1);
   return fact;
  }
    
}