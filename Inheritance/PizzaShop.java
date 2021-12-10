// PizzaShop: DeluxePizza & StandardPizza
// DeluxePizza: Pizza($200) & 3 extra Toppings($20 each) can be added
// StandardPizza: Pizza($100) & no Toppings
// Buy 5 get 1 free in any pizza

import java.util.Scanner;

class Pizza {
  private int price;
  private int number;

  public Pizza(int price, int number) {
    this.price = price;
    this.number = number;
  }

  public int getNumber() {
    return (number / 5 + number);
  }

  public int getPrice() {
    return number * price;
  }
}

class StandardPizza extends Pizza {
  public StandardPizza(int number) {
    super(100, number);
  }
}

class DeluxePizza extends Pizza {
  private int numberOfToppings;

  public DeluxePizza(int numberOfToppings, int number) {
    super(200, number);
    this.numberOfToppings = numberOfToppings;
  }

  @Override
  public int getPrice() {
    return super.getPrice() + numberOfToppings * 20;
  }
}

public class PizzaShop {
  public static void main(String[] args) {
    int choice;

    Scanner s = new Scanner(System.in);
    do {
      System.out.println("\n\nMenu(Buy 5 Get 1 Free) \n1. Standard Pizza \n2. Deluxe Pizza \n3. Exit");
      choice = s.nextInt();

      switch (choice) {
        case 1: {
          System.out.println("\n\nEnter number of pizza");
          int number = s.nextInt();
          StandardPizza sp = new StandardPizza(number);
          System.out.println("\n\nTotal amount: " + sp.getPrice() + " for " + sp.getNumber() + " standard pizzas.");
          break;
        }
        case 2: {
          System.out.println("\n\nEnter number of pizza");
          int number = s.nextInt();

          int toppings;

          do {
            System.out.println("\nWant some toppings?(0 for none)");
            toppings = s.nextInt();

            if (number / toppings >= 3) {
              System.out.println("\nNumber of toppings for each is 3 at max. Choose again!");
            }
          } while (number / toppings >= 3);

          DeluxePizza dp = new DeluxePizza(toppings, number);
          System.out
              .println(
                  "\n\nTotal amount: " + dp.getPrice() + " for " + dp.getNumber() + " deluxe pizzas with " + toppings
                      + " toppings.");
          break;
        }

        case 3:
          System.out.println("\n\nExiting...");
          break;
        default:
          System.out.println("\n\nWrong Input!");
      }

    } while (choice != 3);
    s.close();
  }
}
