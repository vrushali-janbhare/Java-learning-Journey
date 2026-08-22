// Write a Java program to demonstrate narrowing (explicit) conversion from double to int.
public class ExplicitConversion {
 public static void main(String[] args) {
//    Explicit Conversion ->>Means converting the large data type to the small data type
//  double --> Float --> long --> int --> Short --> byte-->char  



//    byte s=i;  this is not possible directly
    int i=300;
     byte s =(byte)i;
     System.out.println("Interge value ="+i+"\n After convart it to byte = "+s+" the value is  Narrowed " );
     

    short b=97;
     char c=(char)b;
     System.out.println("Before conversion ="+b+"\n After conversion into char ="+c);
  double d=99.432;
/* it is done using --> */ int a=(int)d;
   System.out.println("Before conversion ="+d+" After conversion into double "+a);

   


 }   
}
