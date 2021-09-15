import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nu = sc.nextInt();
        int[] num = new int[n];
        
        for(int i = 0 ; i < nu; i++) {
            num[i] = sc.nextInt();
        }
        
        for(int r : num) {
            if(r == 0) {
                System.out.println("No");
                sc.close();
                return;
            }
        }
        System.out.println("Yes");
        sc.close();
    }
}