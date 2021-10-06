public class Course {
  private String title;
  private int creditHours;
  private Student[] students;
  private int capacity;
  private int enrollment;
  private String instructor;
  private String[] assistant = new String[3];
  private int number;

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
  public void addTeachingAssistant(String assistant, int index){
    this.assistant[index] = assistant;
  }
  public void displayStaff(){
      System.out.println("Course instructor = " + instructor + "Teaching assistants = ");
      int l = number;
      for(int k = 0; k < l; k++){
        System.out.println(assistant[k]);
      }
}}
