
// Create a class containing one static variable and one non-static variable
// . Create an object and display both values. Explain why an object is required for
//  the non-static variable.
public class StaticvsNonStatic {
public static void main(String[] args) {
        student s1 =new student();
    s1.Name="Vrushali";
    System.out.println("Details Of Student Of T C College Baramati  ");
    System.out.println("Name :"+s1.Name+"\tCollege Name : "+student.ClgName);
    student s2 =new student();
    s2.Name="Trupti";
    System.out.println("Name : "+s2.Name+"\tCollege Name : "+student.ClgName);
}

}

class student {
    String Name;
    static String ClgName;
    student(){
     ClgName="T C College Baramati";
    }
}