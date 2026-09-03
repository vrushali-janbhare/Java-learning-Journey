// Create a PrintData class with overloaded methods
//  to print an integer, a double, and a String
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading c1 =new MethodOverloading();
      c1.PrintData(10);

      c1.PrintData(20.222);
      
      c1.PrintData("Vrushali");
    }

    void PrintData(int a){
        System.out.println("this is Method overloading of int  : "+a);
        
    }
    void  PrintData( String s ){
        System.out.println("This is Method overloading of float : "+s);;
    }
    void PrintData( double d){
        System.out.println("This is method Overloding of Double : "+d);
    }
}
