public class TestMyRectangle {
  public static void main(String[] args) {

    // Creating a rectangle using the default constructor
    MyRectangle r1 = new MyRectangle(0, 0, 10, 20);
    // Printing the rectangle
    System.out.println("Creating a rectangle using the default constructor.");
    System.out.println(r1);
    // Printing the area of the rectangle
    System.out.println("Area: " + r1.getArea());
    // Printing the perimeter of the rectangle
    System.out.println("Perimeter: " + r1.getPerimeter());
    // Changing the bottom right corner to (30, 40)
    System.out.println("Changing the bottom right corner to (30, 40)");
    r1.setBottomRightX(30);
    r1.setBottomRightY(40);
    // Printing the rectangle
    System.out.println(r1);
    // Printing the area of the rectangle
    System.out.println("Area: " + r1.getArea());
    // Printing the perimeter of the rectangle
    System.out.println("Perimeter: " + r1.getPerimeter());

    // Creating a point at (0, 0)
    MyPoint p1 = new MyPoint(0, 0);
    // Creating a point at (10, 20)
    MyPoint p2 = new MyPoint(10, 20);
    // Creating a rectangle using the MyPoint constructor
    MyRectangle r2 = new MyRectangle(p1, p2);
    // Printing the rectangle
    System.out.println("Creating a rectangle using the MyPoint constructor.");
    System.out.println(r2);
    // Printing the area of the rectangle
    System.out.println("Area: " + r2.getArea());
    // Printing the perimeter of the rectangle
    System.out.println("Perimeter: " + r2.getPerimeter());
    // Changing the bottom right corner to (20, 30)
    System.out.println("Changing the bottom right corner to (20, 30).");
    System.out.println("Creating a new point at (20, 30).");
    MyPoint p3 = new MyPoint(20, 30);
    // Setting the bottom right corner to (20, 30)
    r2.setBottomRight(p3);
    // Printing the rectangle
    System.out.println(r2);
    // Printing the area of the rectangle
    System.out.println("Area: " + r2.getArea());
    // Printing the perimeter of the rectangle
    System.out.println("Perimeter: " + r2.getPerimeter());
  }
}