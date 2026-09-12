public class CarEncapsulation {
    //Create a Car class with private variables brand, model, and price.
    //  Use getter and setter methods to initialize and display the values.
 public static void main(String[] args) {
    
 car c1=new car();
 c1.setter("TATA", "Tigaro", 100000);
 c1.getter();
 }
}

class car{
    private  String brand;
    private String  model;
    private  double price;

    public void setter(String b,String m,double p){
       this.brand=b;
       this.model=m;
       this.price=p;
    }
    public  void getter(){
        System.out.println("Brand Name : "+brand);
        System.out.println("Model Name : "+model);
        System.out.println("Price if Car : "+price);
    }
}