import java.util.Scanner;

public class LargestElementfromArray {
    public static void main(String[] args) {
        int largest=0;
        int arr[]=new int [10];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Five Element");
        for(int i=0;i<5;i++)
        { 
         int num=sc.nextInt();
          arr[i]=num;
        }
       
            for(int j=0;j<5;j++)
            {
              if(arr[j]>largest)
              {
                largest=arr[j];
              }
            
        }
        System.out.println("Largest Number  From :"+largest);
        sc.close();
    }
}
