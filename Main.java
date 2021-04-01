import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //カウント
        int count = sc.nextInt();
        //数字の初期化
        for(int i = 0; i < count; i++) {
          int num = sc.nextInt();

          if(num % 4 == 0){
            System.out.println("Even");
          } else if(num % 4 == 0 && num % 1 == 0){
            System.out.println("Same");
          } else {
            System.out.println("Odd");
          }
        }
    }
}