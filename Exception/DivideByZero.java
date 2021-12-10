import java.util.Scanner;
import java.util.InputMismatchException;

class DivideByZero {
  public static void main(String[] args) {
    int a, b;

    Scanner s = new Scanner(System.in);

    try {
      System.out.println("Enter 1st Number: ");
      a = s.nextInt();
      System.out.println("Enter 2nd Number: ");
      b = s.nextInt();

      int division = a / b;
      System.out.println(a + " / " + "b" + " = " + division);
    } catch (ArithmeticException e) {
      System.out.println("Error! " + e.getMessage());
    } catch (InputMismatchException e) {
      System.out.println("Error! " + e.getMessage());
    }

    s.close();
  }
}