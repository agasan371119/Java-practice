//戻り値
public class Main {
  public static void main(String[] args) {
      int sum1 = sum(300, 500);
      System.out.println(sum1);
      int sum2 = product(500, 700);
      System.out.println(sum2);
      sum3(100, 50);
  }

  public static int sum(int a, int b) {
    return a + b;
  }

  public static int product(int x, int y) {
    return x * y;
  }
  public static void sum3(int w, int z) {
    System.out.println(w / z);
  }
}