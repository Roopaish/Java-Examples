import java.io.*;
import java.util.Scanner;

class Person implements Serializable {
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void showInfo() {
    System.out.println("\nName = " + name + " Age : " + age);
  }
}

class SerializeAndDeserialize {
  public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException {
    Scanner s = new Scanner(System.in);

    FileOutputStream fos = new FileOutputStream("hello.txt", true);
    ObjectOutputStream oos = new ObjectOutputStream(fos);

    FileInputStream fis = new FileInputStream("hello.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);

    Person p;
    String name;
    int age;

    int choice;
    do {
      System.out.println("\nMenu \n1.Serialize \n2.Deserialize \n3.Exit");
      choice = s.nextInt();
      s.nextLine();

      switch (choice) {
        case 1:
          System.out.println("\nSerialize");
          System.out.println("\nInput data of Person. \nName : ");
          name = s.nextLine();
          System.out.println("\nAge : ");
          age = s.nextInt();

          p = new Person(name, age);
          oos.writeObject(p);
          System.out.println("\nSerialized successfully...");
          p.showInfo();
          break;

        case 2:
          System.out.println("\nDeserialize");
          Person q = (Person) ois.readObject();
          q.showInfo();
          break;

        case 3:
          System.out.println("\nExiting....");
          break;

        default:
          System.out.println("\nWrong input");
      }

    } while (choice != 3);

    ois.close();
    oos.close();
    s.close();
  }
}