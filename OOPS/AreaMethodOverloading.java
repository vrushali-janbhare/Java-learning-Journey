// *Create a Area class with overloaded methods to calculate 
// the area of a square, rectangle, and circle.*
public class AreaMethodOverloading {
    public static void main(String[] args) {
        AreaMethodOverloading a1=new AreaMethodOverloading();
        a1.area(5.0);
        a1.area(5, 7);
        a1.area(10);
    }
    void  area(double r){
     System.out.println("Area of Circle : "+r*3.14f);
   }
       void area(int s){
    System.out.println("Area of Square : "+(s*s));
   }

   void area(int l,int w){
    System.out.println("Area of Rectangle : "+(l*w));
   }
}
