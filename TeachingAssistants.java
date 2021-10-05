import java.util.Scanner;

public class TeachingAssistants{
  private String tafirstname;
  private String talastname;

  public TeachingAssistants(String tafirstname, String talastame) {
    this.tafirstname = tafirstname;
    this.talastname = talastname;
  }

  public String toString() {
    return tafirstName + " " + talastName;
  }

  public static TeachingAssistants getTANameFromUserInput(Scanner sc) {
    System.out.print("Enter first name: ");
    String first = sc.nextLine();
    System.out.print("Enter last name: ");
    String last = sc.nextLine();
    TeachingAssistants name = new TeachingAssistants(first, last);
    return name;
  }
}


}
