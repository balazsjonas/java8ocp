package ch3;

public class TryWithResources {

  public static void main(String[] args) {
    try (ExA a = new ExA(); ExB b = new ExB()) {
      System.out.println("trying");
      throw new RuntimeException();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      System.out.println("finally");
    }
  }
}

class ExA implements AutoCloseable {

  @Override
  public void close() throws Exception {
    System.out.println("closing A");
  }
}

class ExB implements AutoCloseable {

  @Override
  public void close() throws Exception {
    System.out.println("closing B");
    throw new RuntimeException("not closing B");
  }
}
