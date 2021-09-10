import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        
        //空の配列を作成
        int[] d = new int[c];
        int[] b = new int[c];
        //空の配列に入力
        //数値 a b
        for(int i = 0; i < c; i++) {
            d[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        
        
        for(int i = 0; i < c; i++) {
            System.out.println(d[i] + " " + b[i]);
        }
    }
}