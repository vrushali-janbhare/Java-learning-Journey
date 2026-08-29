public class CheckPositiveNegativeorZeroFunction {
    public static void main(String[] args) {
        int n=-10;
        checkNumber(n);
    }
    static void checkNumber(int n){
        if(n>0)
        System.out.println(n+" is Positive");
       else if(n<0)
        System.out.println(n+" is Negative");
      else
        System.out.println(n+" is Zero ");
    }
}
