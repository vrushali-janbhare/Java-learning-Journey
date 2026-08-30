import java.util.Scanner;

public class FibonacciSeriesFunction {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
         System.out.print("Enter the Number to Print the Fibonacci Series : " );
         int n=sc.nextInt();
         FibonacciSeries(n);
        sc.close();
     }
     static void FibonacciSeries(int n){
        int count =0;
       System.out.println("Fibonacci Series Upto "+n+" terms : ");
       
       int a=0;
       int b=1; 
       
       System.out.println(a);
        count++;
       if(count==n)
        return;
       System.out.println(b);
       count++;
       if(count==n)
        return;
      while(count!=n){
        int c=a+b;
        System.out.println(c);
        count++;
        a=b;
        b=c;
       }
     

     }
}
