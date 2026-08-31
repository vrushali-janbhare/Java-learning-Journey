
// Create a Student class with name and age. Create an object using the new 
// keyword and display the details.
class Studentclass{
   String name ;
   int age;
}


public class StudentclassObject {
    public static void main(String[] args) {
        Studentclass s1= new Studentclass();
        s1.name="Vrushali";
        s1.age=20;
        System.out.println("Student Name :"+s1.name);
       System.out.println("Suntent Age : "+s1.age);
        Studentclass s2 =new Studentclass();
        s2.name="Sanyukti";
        s2.age=18;
        System.out.println("Student Name :"+s2.name);
       System.out.println("Suntent Age : "+s2.age);

    }
}
