import java.util.*;

public class SumofArrayElements {
    public static void main(String[] args) {
        System.err.println("Enter the Number of Element in array ");
        Scanner sc=new Scanner(System.in);

        int sum=0,n=sc.nextInt();
        System.out.println("Enter the "+n+" Number of Element");
        int [] arr=new int[n];
      for(int i=0;i<n;i++)
      {
        int num=sc.nextInt();
        arr[i]=num;
        sum=sum+num;
      }
      System.out.println();
       System.out.println("The Sum Of the Array is : "+sum);
        sc.close();
    }
}
