public class Calculator1 {
    //*Create a Calculator class with overloaded methods
    //  to perform multiplication of two integers and two doubles.*

    public static void main(String[] args) {
        Calculator1 c1=new Calculator1();
        c1.multiplication( 5 ,6);
        c1.multiplication( 5.5 ,3.4);
    }
    void multiplication( int a, int b){
        System.out.println("multiplication : "+a*b);
    }
    void multiplication(double a, double b){
        System.out.println(" multiplication : "+a*b);
    }
}
