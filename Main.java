import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //数の指定
      int count = sc.nextInt();

      //空白
      System.out.println("---------------");

      //繰り返し
      String output;
      for(int i = 1; i <= count; i++) {
          if(i % 3 == 0 && i % 5 == 0) {
            output = i + ": FizzBuzz";
          } else if(i % 3 == 0) {
            output = i + ": Fizz";
          } else if(i % 5 == 0) {
            output = i + ": Buzz";
          } else {
            output = String.valueOf(i);
          }
          System.out.println(output);
      }
    }
}