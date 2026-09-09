
//Object Reference by Value: Create a Car class with brand and price. 
// Pass a Car object to a method and modify its price
public class ObjectReferencebyValue2 {
    public static void main(String[] args) {
        car c1=new car();
        System.out.println(" the price before change Brand "+c1.brand+" Name :"+c1.Name+" Price : "+c1.price);
        changePrice(c1);
       System.out.println(" the price After change Brand "+c1.brand+" Name :"+c1.Name+" Price : "+c1.price);   
    }
    static  void  changePrice(car s){
        s.price=1300000;
    }
}
class car{
    String brand;
    String Name;
    int price;
    car(){
        brand="TATA";
        Name="Nexon";
        price=12_00_000;
    }
}
