/**
 * The MyRectangle class represents a rectangle in a Cartesian coordinate system.
 * It is defined by two points: the top left corner and the bottom right corner.
 */
public class MyRectangle {
    private MyPoint topLeft;
    private MyPoint bottomRight;

    /**
     * Constructs a MyRectangle object with the given top left and bottom right points.
     *
     * @param topLeft     the top left corner of the rectangle
     * @param bottomRight the bottom right corner of the rectangle
     */
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    /**
     * Constructs a MyRectangle object with the given coordinates of the top left and bottom right points.
     *
     * @param x1 the x-coordinate of the top left corner
     * @param y1 the y-coordinate of the top left corner
     * @param x2 the x-coordinate of the bottom right corner
     * @param y2 the y-coordinate of the bottom right corner
     */
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    /**
     * Returns the top left corner of the rectangle.
     *
     * @return the top left corner of the rectangle
     */
    public MyPoint getTopLeft() {
        return topLeft;
    }

    /**
     * Sets the top left corner of the rectangle.
     *
     * @param topLeft the top left corner of the rectangle
     */
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Returns the bottom right corner of the rectangle.
     *
     * @return the bottom right corner of the rectangle
     */
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    /**
     * Sets the bottom right corner of the rectangle.
     *
     * @param bottomRight the bottom right corner of the rectangle
     */
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    /**
     * Returns the x-coordinate of the top left corner of the rectangle.
     *
     * @return the x-coordinate of the top left corner
     */
    public int getTopLeftX() {
        return this.topLeft.getX();
    }

    /**
     * Returns the y-coordinate of the top left corner of the rectangle.
     *
     * @return the y-coordinate of the top left corner
     */
    public int getTopLeftY() {
        return this.topLeft.getY();
    }

    /**
     * Sets the x-coordinate of the top left corner of the rectangle.
     *
     * @param x the x-coordinate of the top left corner
     */
    public void setTopLeftX(int x) {
        this.topLeft.setX(x);
    }

    /**
     * Sets the y-coordinate of the top left corner of the rectangle.
     *
     * @param y the y-coordinate of the top left corner
     */
    public void setTopLeftY(int y) {
        this.topLeft.setY(y);
    }

    /**
     * Returns the x-coordinate of the bottom right corner of the rectangle.
     *
     * @return the x-coordinate of the bottom right corner
     */
    public int getBottomRightX() {
        return this.bottomRight.getX();
    }

    /**
     * Returns the y-coordinate of the bottom right corner of the rectangle.
     *
     * @return the y-coordinate of the bottom right corner
     */
    public int getBottomRightY() {
        return this.bottomRight.getY();
    }

    /**
     * Sets the x-coordinate of the bottom right corner of the rectangle.
     *
     * @param x the x-coordinate of the bottom right corner
     */
    public void setBottomRightX(int x) {
        this.bottomRight.setX(x);
    }

    /**
     * Sets the y-coordinate of the bottom right corner of the rectangle.
     *
     * @param y the y-coordinate of the bottom right corner
     */
    public void setBottomRightY(int y) {
        this.bottomRight.setY(y);
    }

    /**
     * Returns the width of the rectangle.
     *
     * @return the width of the rectangle
     */
    public double getWidth() {
        return Math.abs(this.topLeft.getX() - this.bottomRight.getX());
    }

    /**
     * Returns the height of the rectangle.
     *
     * @return the height of the rectangle
     */
    public double getHeight() {
        return Math.abs(this.topLeft.getY() - this.bottomRight.getY());
    }

    /**
     * Returns the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    public double getArea() {
        return this.getWidth() * this.getHeight();
    }

    /**
     * Returns the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle
     */
    public double getPerimeter() {
        return 2 * (this.getWidth() + this.getHeight());
    }

    /**
     * Returns a string representation of the rectangle.
     *
     * @return a string representation of the rectangle
     */
    public String toString() {
        return "MyRectangle[topLeft=(" + this.topLeft.getX() + "," + this.topLeft.getY() + "), bottomRight=(" + this.bottomRight.getX() + "," + this.bottomRight.getY() + ")]";
    }
}