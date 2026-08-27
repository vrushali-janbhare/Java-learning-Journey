import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
      
        Scanner sc =new Scanner(System.in);
        int []a=new int[5];
        System.out.print("Enter Five Element To Enter in Array : ");
        for(int i=0;i<5;i++)
        {
            int num=sc.nextInt();
            a[i]=num;
        }
          int Smallest=a[0];
        for(int i=0;i<5;i++)
        {
             if(a[i] < Smallest) {
                Smallest = a[i];
        }
    }
         System.out.println("Smallest Number is : "+Smallest);
        sc.close();
    
}

}