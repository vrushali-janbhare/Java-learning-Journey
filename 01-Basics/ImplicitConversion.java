// write a java program to demonstrate widening (implicit )conversion 
public class ImplicitConversion {
     public static void main(String[] args) {
        byte b=10; 
        short s=b; //byte to short conversion  
        int i=s; // short  to int convertion 
        long l=i; //int to long convertion
        float f=l; //long to float
        double d=f; //float conversion

        System.out.println("byte b ="+ b+"\nshort s="+s+"\nint i= "+i+"\nlong l= "+l+"\nfloat f= "+f+"\ndouble d="+d);

       
     }
}
