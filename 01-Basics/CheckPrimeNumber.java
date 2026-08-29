public class CheckPrimeNumber {
     public static void main(String[] args) {
        int n=7;
        boolean isPrimeOrNot=CheckPrimeNumber_(n);
          if(isPrimeOrNot==true){
             System.out.println("Number is Prime");
          }
          else{
            System.out.println("Number is Not Prime ");
          }
     }
     static boolean CheckPrimeNumber_(int n){
        if(n==2){
            boolean a=true;
          return a;
            }
        else if(n<=1){
             boolean a=false;
          return a;
        }
        else{
          for(int i=2;i<n;i++)
          {
            if(n%i==0){
                 boolean a=false;
                 return a;
            }
          }
          return true;
        }
     }
}
