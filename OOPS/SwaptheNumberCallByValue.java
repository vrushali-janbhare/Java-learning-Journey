// Call by Value: Write a Java program to swap two integers using a method. 
// Check whether the original values are swapped.

public class SwaptheNumberCallByValue {
   public static void main(String[] args) {
    int x=10;
    int y=20;
      System.out.println(" before Swap X ="+x+" Y="+y);
    swap(x,y);
    System.out.println(" After Swap X ="+x+" Y="+y);//the values are not swap output--> x=10,y=20
   } 
   static  void  swap(int x ,int y){
    int s=x;
    x=y;
    y=s;
   }
}
