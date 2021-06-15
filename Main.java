import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num = sc.nextInt();
    double num2 = sc.nextInt();

    double sum = num2 / 100;
    double sum2 = sum * num2;

    System.out.println(sum2);

  }
}