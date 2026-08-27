public class LabelsOfLoop {

    public static void main(String[] args) {
        outer:for(int i=0;i<=5;i++)
        {
         inner: for(int j=0;j<=i;j++){
                if(i==4)
                    
                    break outer;
                 System.out.print("*");  
                break inner;
            }
            System.out.println();
        }
    }
}