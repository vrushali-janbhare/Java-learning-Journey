public class Car1 {
    //*Create a Car class with a parameterized constructor to 
    // initialize car name, model, and price.*

    String CarName ;
    String Model;
    int Price;
    public static void main(String[] args) {
         Car1 c1 =new Car1("Toyota"," Fortuner", 23330);
         c1.display();
    }

        void display(){
       System.out.println(" Car Name : "+CarName);
        System.out.println("Model: "+Model);
        System.out.println("Price : "+Price);

    }
    Car1(String a ,String b, int p){
        CarName=a;
        Model=b;
       Price=p;
    }
}
