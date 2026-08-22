public class TypePromotion {
   public static void main(String[] args) {
    //this is also done automaticaly by the java compiler 

    byte b=50;
    int i=b*2;

    System.out.println("byte= "+b+"\n i= "+i);
    
    // in the below case the program while give an 
    // error because the program automatica convart the b*5 into int after it the int can not be stored in byte so we want to use the explicit type casting 
    // byte B=50;
    // B=B*2; 
    byte B=40;
    B=(byte)(B*2);
    System.out.println(" Value 40 After 40*2  = "+B);

   } 
}
