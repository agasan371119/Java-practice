import java.util.*;

public class MyApp {
  public static void main(String[] args) {
    HashMap<String, Integer> num = new HashMap <String, Integer>();

    num.put("りんご", 30);
    num.put("ゴリラ", 20);
    num.put("カミト", 10);
    num.put("ひなの", 40);

    System.out.println(num.get("りんご"));

    num.put("りんご", 50 + 50);

    System.out.println(num.get("りんご"));
  }
};