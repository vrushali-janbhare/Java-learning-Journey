// Call by Value: Write a Java program to pass an integer to a method and change its value. 
// Check whether the original value changes
public class CallByValueusingVariable {
    public static void main(String[] args) {
     int x=10;
     int y=20;
     change(x,y); 
     System.out.println("the value of x="+x+" y= "+y);  //x=10,y=20  the value of x and y are not change 
     // because we are passing the value to the function not the reference 
    }
    static void change (int x,int y){
      x=x+10;
     y=y+20;

    }

}
