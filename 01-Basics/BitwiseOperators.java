public class BitwiseOperators {
    public static void main(String[] args) {
        int a=5, b=6;
        System.out.println("a=5 and b=6");
        //a=00000000 00000000 00000000 00000101
        //b=00000000 00000000 00000000 00000110
      //a&b=00000000 00000000 00000000 00000100 =4
        System.out.println("5 & 6 = "+(a&b));//a&b=4


        //a|b=00000000 00000000 00000000 00000111 =7
        System.out.println("5 | 6 ="+(a|b));//a|b=7


          //^ if on value is 1 the true else false
        //a^b=00000000 00000000 00000000 00000011 =3
        System.out.println("5 ^ 6 ="+(a^b));//a^b=3

        System.out.println("~5 ="+(~a));//~a  =-6

        //left shift 
        //a<<1=10 a<<2=20
        //  a=00000000 00000000 00000000 00000101 a=5
        // a=00000000 00000000 00000000 00001010 = 10 
        System.out.println("Left Shift  <<");
        System.out.println("5<<1 =" +(a<<1));
        System.out.println("5<<2 ="+(a<<2));
 
           System.out.println("Right Shift >>");
           
           System.out.println("5>>1 ="+(5>>1));
           System.out.println("5>>2 ="+(5>>2));

        //
    }
}
