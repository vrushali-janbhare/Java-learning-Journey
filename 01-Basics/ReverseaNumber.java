public class ReverseaNumber {
    public static void main(String[] args) {
        int n=123;
        int Reverse=Reversea_Number(n);
        System.out.println("Rverse Of "+n+" Is : "+Reverse);

    }
   static int  Reversea_Number(int n){
    int  Reverse=0;  
    while(n!=0){
           
           Reverse=(Reverse*10)+n%10;
           n=n/10;
          
        }
         return Reverse;
    }
}
