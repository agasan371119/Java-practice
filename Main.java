import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      //繰り返しの数
      int count = sc.nextInt();

      //繰り返して判断
      for(int i = 0; i < count; i++) {
        int num = sc.nextInt();
        System.out.println(num);
      }
    }
}