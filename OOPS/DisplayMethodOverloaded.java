// *Create a Display class with overloaded show()
//  methods to display different types of data.*

public class DisplayMethodOverloaded {
    public static void main(String[] args) {
        DisplayMethodOverloaded a1=new DisplayMethodOverloaded(); 
        a1.show("Vrushali");
       a1.show(20);
       a1.show(90.18);
    }
    void show(int a){
      System.out.println("Age : "+a);
    }
    void show(double a){ 
     System.out.println("Marks : "+a);
    }
    void show(String a){
      System.out.println("The Name of Student : "+a);
    }
}
