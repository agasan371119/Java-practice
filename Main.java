import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.next().length();
    int m = sc.next().length();

    if(n > m) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}