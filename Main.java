import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = sc.nextInt();
        
        int[] numArray = new int[count];
        
        for(int i = 0; i < count; i++) {
            numArray[i] = sc.nextInt(); 
        }
        
        int k = sc.nextInt();

        for(int i = 0; i < count; i++) {
            if(numArray[i] == k) {
                System.out.println(i + 1);
                //breakで終了させる
                break;
            }
        }
    }
}s