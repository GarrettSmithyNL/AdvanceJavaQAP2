/**
 * The Address class represents a physical address with street, city, state, and zip code.
 * By: Garrett Smith
 * Date: 05/26/2024
 */
public class Address {

  private String street;
  private String city;
  private String state;
  private String zip;

  public Address(String street, String city, String state, String zip) {
    this.street = street;
    this.city = city; 
    this.state = state;
    this.zip = zip;
  }

  /**
   * Returns a string representation of the address.
   *
   * @return the address as a string in the format: street + "\n" + city + ", " + state + " " + zip
   */
  public String toString() {
    return street + ", " + city + ", " + state + "\n" + zip;
  }
  
}
