//引数と戻り値
public class Main {
  public static void main(String[] args) {
    sayHello("Bob");
    sayBay("Kento");
    sayHello("Bob");
    sayBay("Kento");
  }

  public static void sayHello(String name) {
    System.out.println("hello " + name);
  }

  public static void sayBay(String name) {
    System.out.println("bay " + name);
  }

}
