import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int n = 0;
        int sum = 1;
        if(a > b) {
            n = a - b;
            for(int i= 0; i < n; i++) {
                sum = sum * 32; 
            }
            System.out.println(sum);
        } else {
            System.out.println(1);
        }
    }
}