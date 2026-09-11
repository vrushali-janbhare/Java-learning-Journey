
// Write a Java program to create a Student class with a static variable collegeName
// . Create 3 student objects and display the college name.
public class StaticVariable {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.RollNo=101;
    s1.Name="Vrushali";
   
    Student s2=new Student();
    s2.RollNo=102;
    s2.Name="Sanyukti";
    
    Student s3= new Student();
    s3.RollNo=103;
    s3.Name="Pornima";

    System.out.println("Roll No :"+s1.RollNo +"\nName :"+s1.Name+"\nCollege Name : "+Student.collegeName);

    
    System.out.println("Roll No :"+s2.RollNo +"\nName :"+s2.Name+"\nCollege Name : "+Student.collegeName);

    
    System.out.println("Roll No :"+s3.RollNo +"\nName :"+s3.Name+"\nCollege Name : "+Student.collegeName);

    s2.collegeName="V P College Baramati";//this will chamge the name of all student clg
     System.out.println("\n \n After change the clg name of one student \n\n");
     System.out.println("Roll No :"+s1.RollNo +"\nName :"+s1.Name+"\nCollege Name : "+Student.collegeName);

    System.out.println("Roll No :"+s2.RollNo +"\nName :"+s2.Name+"\nCollege Name : "+Student.collegeName);

    
    System.out.println("Roll No :"+s3.RollNo +"\nName :"+s3.Name+"\nCollege Name : "+Student.collegeName);

  
    }
 
}
class  Student {
  
  int RollNo;
  String Name;
  static String collegeName;
 Student(){
   Student.collegeName="T C College Baramati ";
 }
    
}