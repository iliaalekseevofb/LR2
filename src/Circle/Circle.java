package Circle;

public class Circle {
  // Свойства
  private double radius;
  private boolean filled;
  private String color;

  // Конструкторы (перегруженные)
  public Circle() {
    this.radius = 0;
    this.filled = false;
    this.color = "none";
  }
  public Circle(double radius) {
    this.radius = radius;
    this.filled = false;
    this.color = "none";
  }
  public Circle(double radius, boolean filled, String color) {
    this.radius = radius;
    this.filled = filled;
    this.color = color;
  }

  // Методы
  public double getRadius() {
    return this.radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }

  public String getColor() {
    return this.color;
  }
  public void setColor(String color) {
    this.color = color;
  }

  public boolean isFilled() {
    return this.filled;
  }
  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public double getArea() {
    return Math.PI*radius*radius;
  }
  public double getPerimeter() {
    return 2*Math.PI*radius;
  }

  @Override
  public String toString() {
    return "Radius: " + this.radius + ", area: " + this.getArea() + ", perimeter: " + this.getPerimeter() +
           ", filled: " + this.filled + ", color: " + this.color;
  }
}
