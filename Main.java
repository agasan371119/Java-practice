import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 42) {
            n += 1;
        } else {
            n = n;
        }

        String n1 = Integer.toString(n);

        while(n1.length() < 3) {
            n1 = "0" + n1;
        }

        System.out.println("AGC"  + n1);
    }
}