
//Write a method calculateAverage(int a, int b, int c) that calculates and 
// returns the average of three numbers. Call it from main() and display the result.
public class MethodwithParametersandReturnValue {
   public static void main(String[] args) {
     calculate c1=new calculate(); 
    int n1=10,n2=20,n3=30;
    double average=c1.calculateAverage(n1, n2, n3);
    System.out.println("Average Of three Numbers : "+average);
   }
}

class calculate{
     double calculateAverage(int a, int b, int c){
        return  (a+b+c)/3;
    }
}
