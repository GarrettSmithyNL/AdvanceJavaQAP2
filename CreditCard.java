/**
 * The CreditCard class represents a credit card with a balance, credit limit, and owner.
 * By: Garrett Smith
 * Date: 05/26/2024
 */
public class CreditCard {
  private Money balance;
  private Money creditLimit;
  private Person owner;

  /**
   * Constructs a CreditCard object with the specified card holder and credit limit.
   *
   * @param newCardHolder The person who owns the credit card.
   * @param limit The credit limit for the card.
   */
  public CreditCard(Person newCardHolder, Money limit) {
    this.owner = newCardHolder;
    this.balance = new Money(0);
    this.creditLimit = limit;
  }

  /**
   * Returns the current balance on the credit card.
   *
   * @return The balance on the credit card.
   */
  public Money getBalance() {
    return this.balance;
  }

  /**
   * Returns the credit limit for the credit card.
   *
   * @return The credit limit for the credit card.
   */
  public Money getCreditLimit() {
    return this.creditLimit;
  }

  /**
   * Returns a string representation of the card holder's personal information.
   *
   * @return A string representation of the card holder's personal information.
   */
  public String getPersonals() {
    return this.owner.toString();
  }

  /**
   * Charges the specified amount to the credit card, if it does not exceed the credit limit.
   * If the charge exceeds the credit limit, an error message is printed.
   *
   * @param amount The amount to be charged to the credit card.
   */
  public void charge(Money amount) {
    if (amount.compareTo(this.creditLimit.subtract(balance)) <= 0) {
      this.balance = this.balance.add(amount);
    } else {
      System.out.println("Exceeds credit limit");
    }
  }

  /**
   * Makes a payment towards the credit card balance.
   *
   * @param amount The amount to be paid towards the credit card balance.
   */
  public void payment(Money amount) {
    this.balance = this.balance.subtract(amount);
  }

}
