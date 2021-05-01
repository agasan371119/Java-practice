import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      int s = a * a + b * b;
      int u = c * c;

      if(s < u) {
        System.out.println("Yes---");
      } else {
        System.out.println("No-");
      }
    }
}
