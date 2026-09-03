public class Student1 {
    //*Create a Student class and 
    // initialize student details using a default constructor.
    String name;
    int age ;
    String clgName;
    double Marks ;
   
    public static void main(String[] args) {
       Student1 s1=new Student1(); 
       s1.display();
    }
    Student1(){
   name="Vrushali";
   age=20;
   clgName="Tc college Baramati";
   Marks=90.18;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("College Name : "+clgName);
        System.out.println("Marks : "+Marks);
    }
}
