import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int num2 = sc.nextInt();

    int sum = num2 / 100;
    int sum2 = sum * num2;

    System.out.println(sum2);

  }
}