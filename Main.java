import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();

    for(int i = 0; i < count; i++) {
      int num = sc.nextInt();
      System.out.println(num);
    }
  }
}