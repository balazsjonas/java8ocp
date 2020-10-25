package ch1;

public class Box {

  private int data;

  public Box(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public String toString() {
    return "Box{" + "data=" + data + '}';
  }
}