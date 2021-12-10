import java.util.Scanner;

class SemException extends Exception {
  public SemException(String msg) {
    super(msg);
  }
}

public class CustomException {
  public static void main(String[] args) {
    String name;
    int sem;

    try {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter name of student: ");
      name = s.nextLine();
      System.out.println("Enter semester: ");
      sem = s.nextInt();
      s.close();

      if (sem < 0 || sem > 8) {
        throw new SemException("Only 1 to 8 Semester exists!");
      }

      System.out.println("Student Info:\nName = " + name + "\nSemester = " + sem);
    } catch (SemException e) {
      System.out.println("Error! " + e.getMessage());
    }
  }
}
