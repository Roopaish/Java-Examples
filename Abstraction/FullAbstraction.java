// Full Abstraction using interfaces
interface Reader {
  abstract void read();
}

interface Writer {
  abstract void write();
}

class ReaderWriter implements Reader, Writer {
  @Override
  public void read() {
    System.out.println("Reading...");
  }

  @Override
  public void write() {
    System.out.println("Writing...");
  }
}

public class FullAbstraction {
  public static void main(String[] args) {
    ReaderWriter rw = new ReaderWriter();
    rw.read();
    rw.write();
  }
}
