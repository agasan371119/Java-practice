import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int s = sc.next().length();
    int t = sc.next().length();

    if(s > t) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

  }
}