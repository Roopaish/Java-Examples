import java.util.Scanner;

class Payment {
  public double amount;

  public Payment(double amount) {
    this.amount = amount;
  }

  public void buyItem() {
    Scanner s = new Scanner(System.in);
    double am;
    System.out.println("How much for the item?");
    am = s.nextDouble();
    if (am >= amount) {
      System.out.println("Insufficient Balance!\n");
    } else {
      System.out.println("Order Placed Successfully!\n");

      billAmounts(-am);
      printReceipts();
    }
  }

  public void billAmounts(double am) {
    amount += am;
  }

  public void printReceipts() {
    System.out.println("Remaining Amount : " + amount);
  }
}

class DebitCardPayment extends Payment {
  private String cardNumber;
  private int cvv;
  private String bank;

  public DebitCardPayment(String cardNumber, int cvv, String bank, double amount) {
    super(amount);

    this.cardNumber = cardNumber;
    this.cvv = cvv;
    this.bank = bank;
  }

  public void printInfo() {
    System.out.println("\nDebitCard Info\nBank Name = " + bank + "\nCard Number = " + cardNumber + "\nCVV Number = "
        + cvv + "\nAmount = " + amount);
  }
}

class PaypalPayment extends Payment {
  private String email;
  private String password;

  public PaypalPayment(String email, String password, double amount) {
    super(amount);

    this.email = email;
    this.password = password;
  }

  public void printInfo() {
    System.out.println("\nPaypal Info\nEmail = " + email + "\nPassword = " + password + "\nAmount = " + amount);
  }
}

public class PaymentSystem {
  public static void main(String[] args) {
    DebitCardPayment dcp = new DebitCardPayment("1234567890123456", 1234, "NIC Asia", 100000);
    PaypalPayment pp = new PaypalPayment("abc@gmail.com", "asdfghjkl", 50000);

    int choice;
    Scanner s = new Scanner(System.in);
    do {
      System.out.println("\n\nMenu\n1. Buy Item \n2. Show DebitCard Info \n3. Show Paypal Info \n4. Exit");

      choice = s.nextInt();

      switch (choice) {
        case 1: {
          System.out.println("\n\nChoose Payment Way \n1. DebitCard \n2. Paypal");
          int ch = s.nextInt();
          switch (ch) {
            case 1:
              dcp.buyItem();
              break;
            case 2:
              pp.buyItem();
              break;
          }
          break;
        }

        case 2: {
          dcp.printInfo();
          break;
        }
        case 3: {
          pp.printInfo();
          break;
        }
        case 4:
          System.out.println("\n\nExiting....");
        default:
          System.out.println("\n\nWrong Input!");
      }
    } while (choice != 4);
    s.close();
  }
}
