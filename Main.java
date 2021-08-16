import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int ans = 1;
    for(int i = 0; i < 5; i++) {
      int num = sc.nextInt();
      if(num > ans) {
        ans = num;
      }
    }
    System.out.println(ans);
  }
}