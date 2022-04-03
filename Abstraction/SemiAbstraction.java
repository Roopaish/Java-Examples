// Semi Abstraction using abstract classes
abstract class Smartphone {
  // This is non-abstract method, doesn't necessarily need to be overridden in
  // child class
  void call() {
    System.out.println("Calling...");
  }

  // These methods are compulsion to be overridden in child class
  abstract void takePhoto();

  abstract void takeVideo();
}

class Android extends Smartphone {
  @Override
  void takePhoto() {
    System.out.println("Taking photo in android way!");
  }

  @Override
  void takeVideo() {
    System.out.println("Taking video in android way!");
  }

  @Override
  void call() {
    System.out.println("Calling from android!");
    super.call();
  }
}

class IPhone extends Smartphone {
  @Override
  void takePhoto() {
    System.out.println("Taking photo in iphone way!");
  }

  @Override
  void takeVideo() {
    System.out.println("Taking video in iphone way!");
  }
}

public class SemiAbstraction {
  public static void main(String[] args) {
    Android a = new Android();
    a.call();
    a.takePhoto();
    a.takeVideo();

    IPhone i = new IPhone();
    i.call();
    i.takePhoto();
    i.takeVideo();
  }
}
