public class StudentGradeCalculator {
    public static void main(String[] args) {
// Write a Java program that takes marks (0–100) as input and prints grade using if-else-if ladder.
// Grading criteria:
// ● ≥ 90 → Grade A
// ● ≥ 75 → Grade B
// ● ≥ 60 → Grade C
// ● ≥ 40 → Grade D
//● < 40 → Fail
    

    int marks = 99;

   if (marks>=90) {
       System.out.println("Grade A");
   }
   else if(marks>=75){
       System.out.println("Grade B");
   }
   else if(marks>=60){
       System.out.println("Grade C");
   }
   else if(marks>=40){
       System.out.println("Grade D");
   }
   else{
      System.out.println("Fail");
   }

    }
}
