public class StudentEncapsulation {
    //Create a Student class with private variables name and marks.
    //  Use getter and setter methods to access and modify them.
    public static void main(String[] args) {
       student s1=new student();
       student s2= new student();
    
       s1.setter("vrushali",90);
       s1.getter();
       s2.setter("pornima", 92);
       s2.getter();
    }
}

class student {
   private String Name;
   private int Marks;
  
  public void setter(String N,int M){
    this.Name=N;
    this.Marks=M;
   }
    public void getter(){
     System.out.println(Name);
     System.out.println(Marks);
   }
  
}
