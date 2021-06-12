import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("数字を入力してください : ");
      int count = sc.nextInt();


      for(int i = 1; i < count; i++) {
        System.out.println(i);
    }
  }
}
