import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    double sum = num * 1;

    if(sum == 206) {
      System.out.println("so-so");
    } else if(sum < 206) {
      System.out.println("Yay!");
    } else {
      System.out.println(":(");
    }
  }
}