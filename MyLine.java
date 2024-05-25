/**
 * The MyLine class represents a line segment in a two-dimensional space.
 * It is defined by two MyPoint objects representing the beginning and end points of the line.
 * 
 * By: Garrett Smith
 * Date: 05/25/24
 */
public class MyLine {

  //Private Variables
  private MyPoint begin;
  private MyPoint end;

  /**
   * Constructs a MyLine object with the specified coordinates for the beginning and end points.
   *
   * @param x1 the x-coordinate of the beginning point
   * @param y1 the y-coordinate of the beginning point
   * @param x2 the x-coordinate of the end point
   * @param y2 the y-coordinate of the end point
   */
  public MyLine(int x1, int y1, int x2, int y2) {
    this.begin = new MyPoint(x1, y1);
    this.end = new MyPoint(x2, y2);
  }

  /**
   * Constructs a MyLine object with the specified beginning and end points.
   *
   * @param begin the beginning point of the line
   * @param end the end point of the line
   */
  public MyLine(MyPoint begin, MyPoint end) {
    this.begin = begin;
    this.end = end;
  }

  /**
   * Returns the beginning point of the line.
   *
   * @return the beginning point
   */
  public MyPoint getBegin() {
    return begin;
  }

  /**
   * Sets the beginning point of the line.
   *
   * @param begin the new beginning point
   */
  public void setBegin(MyPoint begin) {
    this.begin = begin;
  }

  /**
   * Returns the end point of the line.
   *
   * @return the end point
   */
  public MyPoint getEnd() {
    return end;
  }

  /**
   * Sets the end point of the line.
   *
   * @param end the new end point
   */
  public void setEnd(MyPoint end) {
    this.end = end;
  }

  /**
   * Returns the x-coordinate of the beginning point.
   *
   * @return the x-coordinate of the beginning point
   */
  public int getBeginX() {
    return this.begin.getX();
  }

  /**
   * Sets the x-coordinate of the beginning point.
   *
   * @param x the new x-coordinate of the beginning point
   */
  public void setBeginX(int x) {
    this.begin.setX(x);
  } 

  /**
   * Returns the y-coordinate of the beginning point.
   *
   * @return the y-coordinate of the beginning point
   */
  public int getBeginY() {
    return this.begin.getY();
  }

  /**
   * Sets the y-coordinate of the beginning point.
   *
   * @param y the new y-coordinate of the beginning point
   */
  public void setBeginY(int y) {
    this.begin.setY(y);
  }

  /**
   * Returns the x-coordinate of the end point.
   *
   * @return the x-coordinate of the end point
   */
  public int getEndX() {
    return this.end.getX();
  }

  /**
   * Sets the x-coordinate of the end point.
   *
   * @param x the new x-coordinate of the end point
   */
  public void setEndX(int x) {
    this.end.setX(x);
  } 

  /**
   * Returns the y-coordinate of the end point.
   *
   * @return the y-coordinate of the end point
   */
  public int getEndY() {
    return this.end.getY();
  }

  /**
   * Sets the y-coordinate of the end point.
   *
   * @param y the new y-coordinate of the end point
   */
  public void setEndY(int y) {
    this.end.setY(y);
  }

  /**
   * Returns an array containing the x and y coordinates of the beginning point.
   *
   * @return an array containing the x and y coordinates of the beginning point
   */
  public int[] getBeginXY() {
    return new int[]{this.begin.getX(), this.begin.getY()};
  }

  /**
   * Sets the x and y coordinates of the beginning point.
   *
   * @param x the new x-coordinate of the beginning point
   * @param y the new y-coordinate of the beginning point
   */
  public void setBeginXY(int x, int y) {
    this.begin.setX(x);
    this.begin.setY(y);
  }

  /**
   * Returns an array containing the x and y coordinates of the end point.
   *
   * @return an array containing the x and y coordinates of the end point
   */
  public int[] getEndXY() {
    return new int[]{this.end.getX(), this.end.getY()};
  }

  /**
   * Sets the x and y coordinates of the end point.
   *
   * @param x the new x-coordinate of the end point
   * @param y the new y-coordinate of the end point
   */
  public void setEndXY(int x, int y) {
    this.end.setX(x);
    this.end.setY(y);
  }

  /**
   * Returns the length of the line.
   *
   * @return the length of the line
   */
  public double getLength() {
    return this.begin.distance(this.end);
  }

  /**
   * Returns the gradient of the line.
   *
   * @return the gradient of the line
   */
  public double getGradient() {
    double xDiff = this.getEndX() - this.getBeginX();
    double yDiff = this.getEndY() - this.getBeginY();
    return Math.atan2(yDiff, xDiff);
  }
  
  /**
   * Returns a string representation of the line.
   *
   * @return a string representation of the line
   */
  public String toString() {
    return ("MyLine[Begin=(" + this.getBeginX() + "," + this.getBeginY() + "),end=(" + this.getEndX() + "," + this.getEndY() + ")]");
  }
}