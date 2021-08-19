import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int an = 1;
    for(int i = 0; i < 20; i++) {
      int n = sc.nextInt();
      if(n < an) {
        an = n;
      }
    }
    System.out.println(ans);
  }
}