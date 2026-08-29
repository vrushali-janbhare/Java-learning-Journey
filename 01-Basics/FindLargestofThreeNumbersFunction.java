public class FindLargestofThreeNumbersFunction {
    public static void main(String[] args) {
        int x=10,y=20,z=30; 
        int largest=largest(x, y, z);
        System.out.println("The Largest from three Number is : "+largest);
    }
    static int largest(int a, int b, int c){
        if(a>b && a>c){
            return a;
        }
        else if(b>a && b>c){
            return b;
        }
        else
            return c;
    }
}
