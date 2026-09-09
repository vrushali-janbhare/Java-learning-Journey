//Both Concepts ⭐: Write a Java program that has:

// one method that receives an int
// one method that receives a Student object

// Change the values inside both methods and observe which changes are reflected in main().
public class BothPassByValue {
    public static void main(String[] args) {
        int Marks=90;
        System.out.println("Before change the Mark the Marks = "+Marks);
        changemarks(Marks);
        System.out.println("After change the Mark the Marks = "+Marks);//marks not change
        student s1=new student();
        System.out.println("\nBefore change the Mark the Marks = "+s1.marks);  
        changemarks(s1);      
        System.out.println("After change the Mark the Marks = "+s1.marks);
      
    }
    static void changemarks(int m){
        m=95;
    }
    static  void changemarks(student s){
        s.marks=96;
    }

}
class student{
    int marks;
    student(){
        marks=91;
    }
}
