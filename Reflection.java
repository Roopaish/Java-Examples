// Use to inspect the class

import java.lang.Class;
import java.lang.reflect.*;

class Dog {
  public void bark() {
    System.out.println("Dog barked!");
  }

  private void rollOver(int numberOfTimes) {
    System.out.println("Dog rolls over " + numberOfTimes + "times");
  }
}

class Reflection {
  public static void main(String[] args) throws Exception {
    Class dog = Class.forName("Dog");
    Class[] parameterType = { int.class };
    Method privateMethod = dog.getDeclaredMethod("rollOver", parameterType);
    privateMethod.setAccessible(true);
    privateMethod.invoke(dog.getDeclaredConstructor().newInstance(), 3);

    // Additional Information
    // create an object of Dog class
    // Dog d1 = new Dog();

    // Ways to reflect Dog class, choose one
    Class a = Class.forName("Dog");
    // Class b = d1.getClass();
    // Class c = Dog.class;

    // Inspecting Class
    System.out.println(" ");
    System.out.println("Class Name : " + a.getName()); // returns the name of the class

    int modifier = a.getModifiers(); // returns the access modifier of the class

    String mod = Modifier.toString(modifier);
    System.out.println("Modifier: " + mod);

    Class superClass = a.getSuperclass(); // returns the super class of the class
    System.out.println("Superclass: " + superClass.getName());

    // Inspecting Methods
    Method[] methods = a.getDeclaredMethods();

    // create an object of the Method class
    for (Method m : methods) {
      System.out.println(" ");
      System.out.println("Method Name: " + m.getName());

      modifier = m.getModifiers();
      System.out.println("Modifier: " + Modifier.toString(modifier));

      System.out.println("Return Types: " + m.getReturnType());
    }
  }
}
