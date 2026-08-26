public class PrintContinuousNumberTriangle {
    public static void main(String[] args) {
        int v=1;
        for(int i=0;i<5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(v);
                v++;
            }
            System.out.println();
        }
    }
    
}
