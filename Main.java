import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //カウント
        int n = sc.nextInt();

        //空の配列作成
        int[] m = new int[n];

        //配列に入力
        for(int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        //配列から出力
        for(int i = 0; i < n; i++) {
            System.out.println(m[i]);
        }

    }
}