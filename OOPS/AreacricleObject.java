// 14. Create a Circle class with radius. Create two 
// objects with different radii and calculate their ar/**
 

 class  AreaC{
    int radius;
    void  Area(){
        System.out.println("Area of Circle : "+radius*3.14);
    }
    
}

public class AreacricleObject {
public static void main(String[] args) {
         AreaC a1=new AreaC();
     a1.radius=10;
     a1.Area();
     AreaC a2=new AreaC();
     a2.radius=20;
     a2.Area();
}
}
