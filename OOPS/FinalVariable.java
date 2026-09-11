// Write a Java program with a final variable PI = 3.14. Calculate the area of 
// a circle using it. Also try to change the value of PI and observe the error.
public class FinalVariable {

    public static void main(String[] args) {
       final double PI =3.14;
       int r=5;
    //    PI=3.2344;
    //    the final variable can no been change
   double area=area(PI,r);
   System.out.println("Area Of Circle : "+area);
 }
 static double area(double PI,int r){
     return (PI*r*r);
 }    
}
