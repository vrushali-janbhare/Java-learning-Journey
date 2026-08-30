import java.util.Scanner;

public class FindPowerFunction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Base Number : ");
        int base =sc.nextInt();
        System.out.println("Enter The Exponent : ");
        int Exponent=sc.nextInt();
        int power =FindPower(base,Exponent);
        System.out.println("The Power of Base : "+base+"and  Exponent :"+Exponent+" is : "+power);
        sc.close();
    }   
    static int FindPower(int base, int Exponent){
          int power_=1;
          for(int i=Exponent;i>0;i--){
            power_=power_*base;
          }
       return power_;
    }
}
