/**
 * The MyPoint class represents a point in a two-dimensional space.
 * It provides methods to manipulate and calculate distances between points.
 * 
 * By: Garrett Smith
 * Date: 05/20/2024
 */
public class MyPoint 
{
  private int x;
  private int y;

  /**
   * Constructs a new MyPoint object with default coordinates (0, 0).
   */
  public MyPoint() 
  {
    this.x = 0;
    this.y = 0;
  }

  /**
   * Constructs a new MyPoint object with the specified coordinates.
   * 
   * @param x the x-coordinate of the point
   * @param y the y-coordinate of the point
   */
  public MyPoint(int x, int y) 
  {
    this.x = x;
    this.y = y;
  }

  /**
   * Returns the x-coordinate of the point.
   * 
   * @return the x-coordinate of the point
   */
  public int getX() {
    return x;
  }

  /**
   * Sets the x-coordinate of the point.
   * 
   * @param x the new x-coordinate of the point
   */
  public void setX(int x) {
    this.x = x;
  }

  /**
   * Returns the y-coordinate of the point.
   * 
   * @return the y-coordinate of the point
   */
  public int getY() {
    return y;
  }

  /**
   * Sets the y-coordinate of the point.
   * 
   * @param y the new y-coordinate of the point
   */
  public void setY(int y) {
    this.y = y;
  }

  /**
   * Sets the x and y coordinates of the point.
   * 
   * @param x the new x-coordinate of the point
   * @param y the new y-coordinate of the point
   */
  public void setXY(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  /**
   * Returns a string representation of the point in the format (x, y).
   * 
   * @return a string representation of the point
   */
  public String toString() {
    return ("(" + this.x + "," + this.y + ")");
  }

  /**
   * Calculates the distance between this point and the specified coordinates.
   * 
   * @param x the x-coordinate of the other point
   * @param y the y-coordinate of the other point
   * @return the distance between this point and the other point
   */
  public double distance(int x, int y)
  {
    double distanceX = this.x - x;
    double distanceY = this.y - y;
    return Math.sqrt(distanceX * distanceX + distanceY * distanceY);
  }

  /**
   * Calculates the distance between this point and another point.
   * 
   * @param otherPoint the other point
   * @return the distance between this point and the other point
   */
  public double distance(MyPoint otherPoint)
  {
    return distance(otherPoint.x, otherPoint.y);
  }

  /**
   * Calculates the distance between this point and the origin (0, 0).
   * 
   * @return the distance between this point and the origin
   */
  public double distance()
  {
    return distance(0, 0);
  }
}
