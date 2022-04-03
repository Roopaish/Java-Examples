import javax.print.event.PrintEvent;

public class OverrideToString {
  public static void main(String[] args) {
    OverrideToString ots = new OverrideToString();
    System.out.println(ots);
  }

  @Override
  public String toString() {
    return "Overriding toString() method! Keep something meaningful in here, will you?";
  }
}
