/**
 * The Money class represents a monetary amount in dollars and cents.
 * By: Garrett Smith
 * Date: 05/26/2024
 * 
 */
public class Money {
  private long dollars;
  private long cents;

  /**
   * Constructs a Money object with the specified amount.
   * 
   * @param amount the amount of money in dollars and cents
   */
  public Money(double amount) {
    this.dollars = (long) amount;
    this.cents =  Math.round((amount - this.dollars) * 100);
  }

  /**
   * Constructs a Money object that is a copy of another Money object.
   * 
   * @param anotherObject the Money object to be copied
   */
  public Money(Money anotherObject) {
    this.dollars = anotherObject.dollars;
    this.cents = anotherObject.cents;
  }

  /**
   * Adds another Money object to this Money object and returns the sum.
   * 
   * @param anotherObject the Money object to be added
   * @return the sum of this Money object and another Money object
   */
  public Money add(Money anotherObject) {
    Money sum = new Money(0);
    sum.dollars = this.dollars + anotherObject.dollars;
    sum.cents = this.cents + anotherObject.cents;
    if (sum.cents >= 100) {
      sum.dollars++;
      sum.cents -= 100;
    }
    return sum;
  }

  /**
   * Subtracts another Money object from this Money object and returns the difference.
   * 
   * @param anotherObject the Money object to be subtracted
   * @return the difference between this Money object and another Money object
   */
  public Money subtract(Money anotherObject) {
    Money difference = new Money(0);
    difference.dollars = this.dollars - anotherObject.dollars;
    difference.cents = this.cents - anotherObject.cents;
    if (difference.cents < 0) {
      difference.dollars--;
      difference.cents += 100;
    }
    return difference;
  }

  /**
   * Compares this Money object with another Money object.
   * 
   * @param anotherObject the Money object to be compared
   * @return -1 if this Money object is less than another Money object, 1 if it is greater, or 0 if they are equal
   */
  public int compareTo(Money anotherObject) {
    if (this.dollars < anotherObject.dollars) {
      return -1;
    } else if (this.dollars > anotherObject.dollars) {
      return 1;
    } else {
      if (this.cents < anotherObject.cents) {
        return -1;
      } else if (this.cents > anotherObject.cents) {
        return 1;
      } else {
        return 0;
      }
    }
  }

  /**
   * Checks if this Money object is equal to another Money object.
   * 
   * @param anotherObject the Money object to be compared
   * @return true if this Money object is equal to another Money object, false otherwise
   */
  public boolean equals(Money anotherObject) {
    return (this.dollars == anotherObject.dollars && this.cents == anotherObject.cents);
  }

  public String toString() {
    return String.format("$%d.%02d", this.dollars, this.cents);
  }

}
