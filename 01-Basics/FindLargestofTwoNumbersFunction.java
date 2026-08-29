public class FindLargestofTwoNumbersFunction {
    public static void main(String[] args) {
        int num1=10 ,num2=20;
       int largest= largest(num1, num2);
       System.out.println("Largest Number is : "+largest);
    }
    static int largest(int a, int b){
      
        if(a>b){
            return a;
        }
        else 
            return b;
    }
}
