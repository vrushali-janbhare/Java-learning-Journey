// Object Reference by Value: Create a Student class with name and marks.
//  Pass a Student object to a method and change its marks

public class ObjectReferencebyValue {
  public static void main(String[] args) {
    Student s1=new Student();
    System.out.println("Before changing the marks of  : "+s1.name+" Marks was :"+s1.marks);//marks=90
    changemarks(s1);
        System.out.println("After changing the marks of  : "+s1.name+" Marks was :"+s1.marks);//marks =92

  }   
  static void changemarks(Student s){
   s.marks=92;
  }
}

 class  Student{
     String name;
     int marks;
    Student(){
        name="Vrushali";
        marks=90;
    }
}