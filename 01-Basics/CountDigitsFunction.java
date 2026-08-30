public class CountDigitsFunction {
  public static void main(String[] args) {
     int n=0;
    int CountDigits= CountDigits(n);
    System.out.println("The "+n +" has Total "+CountDigits+" Digits");
  } 
  static int CountDigits(int n){
  int count=0;
  if(n==0)
    return 1;
    while(n!=0){
       count++;
       n=n/10;
    }
    return count;
  }  
}
