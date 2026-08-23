public class LogicalOperator {
    //& , ||, !
   public static void main(String[] args) {
     int a=20,b=10;
     boolean c=true;
   System.out.println(" And ="+((a>b)&&(a!=b))); //&& returns true only both conditions are trus
   System.out.println(" Or = "+((a>b)||(a!=b)));
   System.out.println(" Not ="+!(c));
   }
}
