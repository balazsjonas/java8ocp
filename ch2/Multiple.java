package ch2;

public class Multiple implements If1, If2 {

  @java.lang.Override
  public int fun() {
    return 0;
  }
}
interface If1 {
  default int fun() {
    return 1;
  }
}

interface If2 {
  default int fun() {
    return 2;
  }
}