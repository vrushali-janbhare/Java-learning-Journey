public class SumofDigitsFunction {
    public static void main(String[] args) {
        int n=1234;
       int sum= SumofDigits(n);
       System.out.println("Sum of "+n+" is : "+sum);
    }
    static int SumofDigits(int n){
      int sum=0;
        while (n!=0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        return sum;
    }
}
