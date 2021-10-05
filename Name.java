import java.util.Scanner;

public class Name {
  private String firstName;
  private String lastName;

  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public String toString() {
    return firstName + " " + lastName;
  }
  
  public static Name getInstanceFromUserInput(Scanner sc) {
    System.out.print("Enter first name: ");
    String first = sc.nextLine();
    System.out.print("Enter last name: ");
    String last = sc.nextLine();
    Name name = new Name(first, last);
    return name;
  }
}
