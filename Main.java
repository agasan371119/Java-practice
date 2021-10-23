import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        int i = n;
        while(i < 10) {
            System.out.println(i);
            sum++;
            i = i + 1;
        } 
        int m = 10 - sum;
        for(int j = 0; j < m; j++) {
            System.out.println(j);
        }
    }
}