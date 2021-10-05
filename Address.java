public class Address {
  private String streetNo;
  private String streetName;
  private String city;
  private String state;
  private String zipCode;

  public Address(String no, String street, String city, String state, String zipCode) {
    streetNo = no;
    streetName = street;
    this.city = city;
    this.state = state;
    this.zipCode = zipCode;
  }

  public String toString() {
    // TODO: revise this method to use all data fields
    return streetNo + " " + streetName;
  }

  public static Address getInstanceFromUserInput(java.util.Scanner sc) {
    // TODO: revise this method to read all data fields
    System.out.print("Enter street no: ");
    String streetNo = sc.nextLine();
    System.out.print("Enter street name: ");
    String streetName = sc.nextLine();
    Address address = new Address(streetNo, streetName, null, null, null);
    return address;
  }
}
