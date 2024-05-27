/**
 * The Person class represents a person with a last name, first name, and home address.
 */
public class Person {
  private String lastName;
  private String firstName;
  private Address home;

  /**
   * Constructs a Person object with the specified last name, first name and address.
   *
   * @param lastName The persons last name.
   * @param firstName The persons first name.
   * @param home The address of the person.
   */
  public Person(String lastName, String firstName, Address home) {
    this.lastName = lastName;
    this.firstName = firstName;
    this.home = home;
  }

  /**
   * Returns a string representation of the Person object.
   * The string contains the first name, last name, and home address of the person.
   *
   * @return a string representation of the Person object.
   */
  public String toString() {
    return firstName + " " + lastName + ", " + home;
  }
}
