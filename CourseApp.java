/*
1. To contrast object-oriented design vs procedural design
2. To apply object-oriented programming in java

Functionality:
1. create a new course
2. add students to the course
3. display course information
4. ...
5. ...
...

Approach: top-down approach
1. analysis
   you can enumerate real life entities
    course (title, a list of students, credit hours), student (name, home address)
    name (first name, middle name, last name)
    address(street number, street name, city, state, zip code)
2. design
   should I write a class for these entities?
   Classes:(association (two specific cases: composition & aggregation); inheritance)
    Course
    Student
    Name
    Address
  Examine the relationship about these classes (objects of these classes)
3. implementation

*/

public class CourseApp {
  static Course course = null;

  public static void main(String[] args) {
    boolean goon = true;
    while (goon) {
      goon = dispMainMenu();
      System.out.println("Returned course from dispMainMenu: " + course);
    }
  }

  public static boolean dispMainMenu() {
    System.out.println("1. Add new course");
    System.out.println("2. Enroll student");
    System.out.println("3. Display course information");
    System.out.println("4. Display instructional staff");
    System.out.println("5. Display class enrollment");
    System.out.println("0. Exit application");
    java.util.Scanner sc = new java.util.Scanner(System.in);
    // client-server
    System.out.print("Enter your choice: ");
    String choice = sc.nextLine();
    boolean goon = true;
    switch (choice) {
      case "1":
        // add new Course
        course = createNewCourse(sc);
        // System.out.println("Course = " + course);
        break;
      case "2":
        // add a student to the Course
        addNewStudentToCourse(sc);
        break;
      case "3":
        // display the course information
        // System.out.println("Course = " + course);
        displayTheCourse(course);
        break;
      case "4":
      // display the instructional staff
      displayInstructionalStaff(course);
      case "5":
      // display the enrolled students
      displayEnrolled(course);
      case "0":
        // exit from the application
        goon = false;
      default:
        // user entered wrong choice
    }
    return goon;
  }

  private static Course createNewCourse(java.util.Scanner sc) {
    System.out.print("Enter course title: ");
    String title = sc.nextLine();
    System.out.print("Enter credit hours: ");
    String line = sc.nextLine();
    int creditHours = Integer.parseInt(line);
    System.out.print("Enter the name of the instructor: ");
    String instructor =  sc.nextLine();
    System.out.println("Enter the number of teaching assistants: ");
    int number = Integer.parseInt(sc.nextLine());
    Course course = new Course(title, creditHours, instructor);
    for(int i = 0; i < number; i++){
      System.out.println("Enter the name of one teaching assistant: ");
      String assistant = sc.nextLine();
      course.addTeachingAssistant(assistant, i);
    }
    return course;}


  private static void addNewStudentToCourse(java.util.Scanner sc) {
    Name name = Name.getInstanceFromUserInput(sc);
    Address address = Address.getInstanceFromUserInput(sc);
    Student student = new Student(name, address);
    System.out.println("Address = " + address.toString());
    if (course.addStudent(student)) {
      System.out.println("Added the student to the class.");
    } else {
      System.out.println("Cannot add the student because the class is full.");
    }

  }

  private static void displayTheCourse(Course course) {
    if (course != null) {
      course.displaySelf();
    } else {
      System.out.println("Please create a course first.");
    }
  }

  private static void displayInstructionalStaff(Course course){
    if (course != null) {
      course.displayStaff();
    } else {
     System.out.println("Please create a course first.");
  }}


  private static void displayEnrolled(Course course){
    course.showenrolled();
  }
}
