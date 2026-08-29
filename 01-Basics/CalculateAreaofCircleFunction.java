public class CalculateAreaofCircleFunction {
    public static void main(String[] args) {
        double radius=10;
        double  areaOfCircle=areaOfCircle(radius);
        System.out.println("Area of Circle : "+areaOfCircle);
    }
    static double areaOfCircle(double radius){
        return 3.14*radius;
    }
}
