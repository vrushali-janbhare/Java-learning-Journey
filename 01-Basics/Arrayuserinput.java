import java.util.*;
public class Arrayuserinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number  of Element");
    int n=sc.nextInt();
      int a[]= new int[n];
     System.out.println("Enter the "+n+"Element");
    for(int i=0;i<n;i++)
    {
        int num=sc.nextInt();
    a[i]=num;
    }
   System.out.println("The Element are : ");
    for(int i=0;i<n;i++){ 
        System.out.println(a[i]);
    }
 sc.close();   
}

}
