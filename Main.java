import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();

        if(s > 10) {
            System.out.println("やったー!!");
        } else if(s < 9) {
            System.out.println("わかった");
        } else {
            System.out.println("ザーン");
        }
    }
}
