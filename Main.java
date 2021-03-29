import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //カウント
        int count = sc.nextInt();
        //数字の初期化
        for(int i = 0; i < count; i++) {
          int num = sc.nextInt();

          if(num == 2) {
            System.out.println("Same");
          } 

          if(num % 2 == 1){
            System.out.println("Odd");
          } else {
            System.out.println("Even");
          }
        }
    }
}