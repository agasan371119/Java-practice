import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int buki = sc.nextInt();
    int saki = sc.nextInt();

    int s = 0;
    for(int i = buki; i <= saki; i++) {
      s++;
    }
    System.out.println(s);
  }
}