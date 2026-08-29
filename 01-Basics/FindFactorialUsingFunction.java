public class FindFactorialUsingFunction {
    public static void main(String[] args) {
        int n=5;
        int factorial=factorial(n);
        System.out.println("Factorial of "+n+" is : "+factorial);
    }
    static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
              fact=fact*i;
        }
        return fact;
    }
}
