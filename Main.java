import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        
        int[] nnArray = new int[count];
        
        for(int i = 0; i < count; i++) {
            numArray[i] = sc.nextInt(); 
        }
        //確認用
        int k = sc.nextInt();

        for(int i = 0; i < count; i++) {
            if(nArray[i] == k) {
                System.out.println(i + 1);
                //breakで終了させる
                break;
            }
        }
    }
}s