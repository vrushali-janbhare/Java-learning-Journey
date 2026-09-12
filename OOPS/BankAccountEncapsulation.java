public class BankAccountEncapsulation {
 //Create a BankAccount class with a private balance variable. Create deposit()
 //  and withdraw() methods. Do not allow the balance to be accessed directly   
 public static void main(String[] args) {
    BankAccount u1=new BankAccount();
    u1.deposit(500);
    System.out.println(" Balance : "+u1.Checkbalance());
    u1.withdraw(200);
    System.out.println(" Balance : "+u1.Checkbalance());

 }
}
class BankAccount{
    private double  balance;
    public void deposit(double a){
          balance+=a;
          System.out.println(a+" Amount is added Succesfully");
    }
    public void withdraw(double a){
        balance-=a;
        System.out.println(a+" Amount is withdraw Succesfully");

    } 
    public  double Checkbalance(){
        return balance;
    }
}
