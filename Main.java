class User {
  String name = "Me!";

  void sayHi() {
    System.out.println("hi!!");
  }
}

public class Main {
  public static void main(String[] args) {
      User tom;
      tom = new User();

      System.out.println(tom.name);
      tom.sayHi();
  }
}