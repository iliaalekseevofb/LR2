package Circle;

public class CircleTest {
  public static void main(String[] args) {
    Circle c1 = new Circle(10.5, true, "Green");
    System.out.println(c1);
    System.out.println(c1.getArea());
    System.out.println(c1.getPerimeter());

    c1.setRadius(20);
    System.out.println(c1.getArea());
    System.out.println(c1.getPerimeter());

    c1.setColor("Yellow");
    System.out.println(c1.getColor());
    System.out.println(c1.isFilled());
  }
}
