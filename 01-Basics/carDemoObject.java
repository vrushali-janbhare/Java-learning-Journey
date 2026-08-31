// Create a Car class with brand, color, and price.
//  Create an object and display its details.


class Car {
     String Brand;
     String color;
     int Price;
     
}
public class carDemoObject {
public static void main(String[] args) {
    Car c1=new Car();
     c1.Brand="Tata Sierra ";
     c1.color="White ";
     c1.Price=1500000 ;
     System.out.println("Brand Name Of Car : "+c1.Brand);
     System.out.println("Color of car : "+c1.color);
     System.out.println("Price of Car : "+c1.Price);
     Car c2=new Car();
     c2.Brand="Tata Punch ";
     c2.color=" White";
     c2.Price=800000;
     System.out.println("Brand Name Of Car : "+c2.Brand);
     System.out.println("Color of car : "+c2.color);
     System.out.println("Price of Car : "+c2.Price);
}
    
}