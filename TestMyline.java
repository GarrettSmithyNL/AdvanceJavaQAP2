public class TestMyline {
  public static void main(String[] args) {

    //Creating the points for Line1
    MyPoint point1 = new MyPoint();
    MyPoint point2 = new MyPoint(1, 1);

    //Creating Line1 with MyPoints
    MyLine line1 = new MyLine(point1, point2);
    
    //Creating Line2 with ints
    MyLine line2 = new MyLine(1, 2, 5, 7);
    
    // Outputing the lines
    System.out.println("Line 1: " + line1);
    System.out.println("Line 2: " + line2);

    // Outputting the Length of each line
    System.out.println("Length Line 1: " + line1.getLength());
    System.out.println("Length Line 2: " + line2.getLength());

    //Outputting the gradient of the line
    System.out.println("Gradiant Line 1: " + line1.getGradient());
    System.out.println("Gradient Line 2: " + line2.getGradient());

    //Changing the end point of line1
    System.out.println("Changing the end point of Line 1 to (5,8)");
    line1.setEndXY(5, 8);
    System.out.println("New Line 1: " + line1);

    // Outputting the new Length and Gradient
    System.out.println("Length Line 1: " + line1.getLength());
    System.out.println("Gradiant Line 1: " + line1.getGradient());

    // Outputting the end point of Line1 with an array
    int[] endPointLine1 = line1.getEndXY();
    System.out.println("The end point of Line 1: (" + endPointLine1[0] + "," + endPointLine1[1] + ")");
  }
  
}
