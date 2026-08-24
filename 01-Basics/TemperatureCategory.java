public class TemperatureCategory {
 public static void main(String[] args) {
//     Write a Java program to classify temperature into categories:
// Conditions:
// ● temperature < 10 → "Very Cold"
// ● temperature ≥ 10 and < 25 → "Moderate"
// ● temperature ≥ 25 → "Hot"

    int temperature=100;
    
    if(temperature<10)
        System.out.println("very cold");
    else if(temperature>=10 && temperature<25)
        System.out.println("Moderate");
    else if(temperature>=25)
        System.out.println("Hot");

 }   
}
