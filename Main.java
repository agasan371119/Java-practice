import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 1; i <= n; i++) {
            //System.out.println(i);
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
                if(j < i ) {
                    System.out.print(" ");
                } else {
                    System.out.println("|- - | - - | - - | - | - -|");
                }
            }
        }
    }
}