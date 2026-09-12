public class EmployeeEncapsulation {
    //Employee Salary
//Create an Employee class with private variables name and salary. 
// Use getters and setters to set and display employee details.
public static void main(String[] args) {
    Employee e1=new Employee();
 e1.setter("Sarthak", 3000);
 e1.getter();
}
}
class Employee{
    private String name;
   private  double Salary;
   public  void setter(String Name,double Salary){
    this.name=Name;
    this.Salary=Salary;
    System.out.println("Employee Set Properly");
   }

   public  void getter(){
    System.out.println("Name : "+name);
    System.out.println("Salary : "+Salary);
   }
}