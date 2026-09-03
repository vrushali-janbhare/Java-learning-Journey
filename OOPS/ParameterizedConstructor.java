public class ParameterizedConstructor {
//7. *Create a Student class and initialize student 
// details using a parameterized constructor.*

  String name;
  int age ;
  String ClgName;
    public static void main(String[] args) {
        ParameterizedConstructor p1 =new ParameterizedConstructor("Vrushali",20,"Tc College ");
        p1.display();
    }
    void display(){
       System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("College Name : "+ClgName);

    }
    ParameterizedConstructor( String Name ,int Age , String Clgname ){
     name=Name;
     age =Age;
     ClgName=Clgname;
    }
}
