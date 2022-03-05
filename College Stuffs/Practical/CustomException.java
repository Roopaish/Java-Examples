import java.util.Scanner;

class InvalidGradeException extends Exception {
  public InvalidGradeException(String msg) {
    super(msg);
  }
}

public class CustomException {
  public static void main(String[] args) throws InvalidGradeException {
    System.out.println("What grade did you get?(0-4)");
    Scanner s = new Scanner(System.in);
    Float grade = s.nextFloat();

    try {
      if (grade > 4 || grade < 0) {
        throw new InvalidGradeException("Grade should be between 0 to 4");
      }
      System.out.println("Well done!");
    } catch (InvalidGradeException e) {
      System.out.println(e.getMessage());
    } finally {
      s.close();
    }
  }
}
