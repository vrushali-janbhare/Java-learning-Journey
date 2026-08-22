public class TruncationConversion {
    public static void main(String[] args) {
        // Trucation converstion --> Means removing the decimal part of an floating point number the truncation is only happed when we convert the float into integer  and double into integer it is an type of explicit type conversion

        float percentage=99.81f;
        double d=99.33544334;
        int  RemoveTheDecimal= (int)percentage; // float to int conversion
       int DoubleToInt=(int)d;
       System.out.println("Before conversion "+percentage);
       System.out.println("After Conversion "+RemoveTheDecimal);
       System.out.println("Before Conversion "+d);
       System.out.println("After conversion "+DoubleToInt);

    }
}
