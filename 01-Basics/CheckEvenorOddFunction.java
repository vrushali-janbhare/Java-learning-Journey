public class CheckEvenorOddFunction {
    public static void main(String[] args) {
        int x=10;
        checkEvenorOdd(x);
    }
  static void   checkEvenorOdd(int a){
    if(a%2==0){
        System.out.println("The "+a+" is Even");
    }
    else{
        System.out.println("The "+a+" is Odd");
    }
  }
    
}
