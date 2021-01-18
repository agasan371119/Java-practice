public class Main {
  public static void main(String[] args) {
    int[] array = {1, 2, 3};

    printArray(array);
  }
  public static void pringArray(int[] array) {
    for(int element : array) {
      System.out.println(element);
    }
  }
}