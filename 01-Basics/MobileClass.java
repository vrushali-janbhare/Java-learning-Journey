// Create a Mobile class with brand and price. 
// Create two objects and display their information.


class Mobile {
    String Brand;
    int price;

    void display(){
        System.out.println("Name of Mobile Brand : "+Brand);
        System.out.println(" Price of Mobile : "+price);
    }
}
public class MobileClass {
  public static void main(String[] args) {
    Mobile m1=new Mobile();
    m1.Brand="Samsung Galaxy S24";
    m1.price=70000;
    m1.display();
    Mobile m2 =new Mobile();
    m2.Brand="iPhone 15";
    m2.price=60_000;
    m2.display();
  }
}
