import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int an = 1;
    for(int i = 0; i < 5; i++) {
      int nu = sc.nextInt();
      if(nu > an) {
        an = nu;
      }
    }
    System.out.println(ans);
  }
}