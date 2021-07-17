import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int buki = sc.nextInt();
    int sa = sc.nextInt();

    int s = 0;
    for(int i = buki; i <= sa; i++) {
      s++;
    }
    System.out.println(s);
  }
}