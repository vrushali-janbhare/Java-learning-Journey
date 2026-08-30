public class CheckPalindromeNumber {
    public static void main(String[] args) {
    int n=121;
    boolean Check= PalindromeNumber(n);  
    
    if(Check==true){
       System.out.println(n+" is palindrome ");
    }
    else{
        System.out.println(n+" is Not Palindrome ");
    }
    }
    static boolean PalindromeNumber(int n){
     boolean isOrNot=false;
     int rev=0 ,num=n;
        while(n!=0){
          rev=(rev*10)+n%10;
          n=n/10;
        }
        if(num==rev){
            isOrNot=true;
        }
        return isOrNot;
    }
}
