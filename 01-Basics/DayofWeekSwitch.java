public class DayofWeekSwitch {
    public static void main(String[] args) {
//  Write a Java program that takes a number (1–7) and prints the corresponding day using switch.
                
// 1 → Monday
// 2 → Tuesday
// 3 → Wednesday
// 4 → Thursday
// 5 → Friday
// 6 → Saturday
// 7 → Sunday
    
  int day=1;
      
     
       switch (day) {
        case 1:
                 System.out.println("Monday");
            break;
        case 2:
                 System.out.println(" Tuesday");
            break;
        case 3:
                 System.out.println("Wednesday");
            break;
        case 4:
                 System.out.println("Thursday");
            break;
        case 5:
                 System.out.println("Friday");
            break;
        case 6:
                 System.out.println("Saturday");
            break;
        case 7:
                 System.out.println("Sunday");
            break;                                                                               
        default:
            System.out.println("Number shoulde in (1-7)");
            break;
       }

                }
}
