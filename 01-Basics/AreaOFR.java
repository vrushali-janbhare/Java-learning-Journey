
// 5. Create a Rectangle class with length and width
// . Create an object and calculate its area.

class RectAngleArea{
  int length;
  int width;

  void areaOfRectangle(){
    int area=length*width;
    System.out.println("Area OF Rectangle : "+area);
  }
}

public class AreaOFR{
    public static void main(String[] args) {
        RectAngleArea R1=new RectAngleArea();
        R1.length=10;
        R1.width=20;
        R1.areaOfRectangle();
    }
}
