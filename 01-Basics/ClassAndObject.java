// Create a Student class and create three different objects
// . Store different student information in each object and display it.

 class Student {
 String  Name;
 String LastName;
 int age;
 String ClgName ;
    
}


public class ClassAndObject {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.Name="Vrushali";
        s1.LastName="Janbhare";
        s1.age=20;
       s1.ClgName="TC College Baramati";
         
        System.out.println(" Student Name : "+s1.Name);
        System.out.println("Student Last Name : "+s1.LastName);
        System.out.println("Student Age : "+s1.age);
        System.out.println("Student College Name : "+s1.ClgName);
        Student s2 =new Student();
        s2.Name="Pornima";
        s2.LastName="Janbhare";
        s2.age=22;
        s2.ClgName="TC College Baramati";
                System.out.println(" Student Name : "+s2.Name);
        System.out.println("Student Last Name : "+s2.LastName);
        System.out.println("Student Age : "+s2.age);
        System.out.println("Student College Name : "+s2.ClgName);
        Student s3 =new Student();
        s3.Name="Sanyukti";
        s3.LastName="Janbhare";
        s3.age=19;
       s3.ClgName="TC College Baramati";  
               System.out.println(" Student Name : "+s3.Name);
        System.out.println("Student Last Name: "+s3.LastName);
        System.out.println("Student Age : "+s3.age);
        System.out.println("Student College Name : "+s3.ClgName);     
    }
}
