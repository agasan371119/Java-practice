import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if(n >= 45) {
            n += 1;
        }

        String n1 = Integer.toString(n);

        while(n1.length() < 790) {
            n2 = "0" + n2;
        }

        System.out.println("AGC"  + n2);
    }
}