abstract class Button {
  abstract double add();

  abstract double sub();
}

class Addition extends Button {
  double a, b;

  public Addition(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double add() {
    return a + b;
  }

  public double sub() {
    return 0.1;
  };
}

class Subtraction extends Button {
  double a, b;

  public Subtraction(double a, double b) {
    this.a = a;
    this.b = b;
  }

  public double add() {
    return 0.1;
  }

  public double sub() {
    return a - b;
  };
}

public class Calculations {
  public static void main(String[] args) {
    Addition a = new Addition(1, 2);
    System.out.println("Addition = " + a.add());

    Subtraction s = new Subtraction(2, 1);
    System.out.println("Subtraction = " + s.sub());
  }
}
