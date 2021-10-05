public class Course {
  private String title;
  private int creditHours;
  private Student[] students;
  private int capacity;
  private int enrollment;
  private String instructor;
  private String[] assistant = new String[3];

  public  Course(String title, int creditHours, String instructor) {
      this.title = title;
      this.creditHours = creditHours;
      this.instructor = instructor;
      capacity = 40;
      students = new Student[capacity];
      enrollment = 0;
  }

  public void displaySelf() {
    System.out.println("Cousre[title = " + title + ", credits = " + creditHours + "]");
  }
  public void showenrolled(){
    for(int j = 0; j < capacity; j++){
      System.out.println(students[j]);
    }
  }

  public boolean addStudent(Student student) {
    if (enrollment < capacity) {
      this.students[enrollment] = student;
      enrollment ++;
      return true;
    } else {
      return false;
    }
  }
  public void displayStaff(){
    System.out.println("Course instructor = " + instructor + "Teaching assistants = ");
    int l = setnumber();
    for(int k = 0; k < l); k++){
      System.out.println(assistant[k]);
    }
  }
  public int setnumber(int number){
    this.number = number;
    return number;
}}
