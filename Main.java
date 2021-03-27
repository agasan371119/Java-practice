import java.util.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        
        int[] num = new int[count];
        
        for(int i = 0; i < count; i++) {
            num[i] = sc.nextInt();
        }
        //配列を昇順に並び替え
        Arrays.sort(num);
        //配列の一番大きい数字を出力
        System.out.println(num[count - 1]);
    }
}