package ch3;

public class Assertion {
  public static void main(String[] args) {
    assert 2>1 : "2 > 1";
    assert 2<1 : "this should never happen";
    System.out.println("hurray");
  
  }
}
