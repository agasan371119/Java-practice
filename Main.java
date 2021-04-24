import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      //数の指定
      int count = sc.nextInt();

      //空白
      System.out.print(":   ");
      System.out.println("- - - - - - - - - - - - - - - - - - - - -");
      System.out.println("ここから入力");

      //繰り返し
      String output;
      for(int i = 1; i <= count; i++) {
        output = "";

        if(i % 3 == 0) {
          output = "Fizz";
        }

        if(i % 5 == 0) {
          output = output + "Buzz";
        }

        output = String.valueOf(i) + " : " + output;
        System.out.println(output);
      }
    }
}