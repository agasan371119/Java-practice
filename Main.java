import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HashMap<String, Integer> point = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.next();
            
            point.put(s, 0);
        }

        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            String p = sc.next();
            int a = sc.nextInt();
            
            point.put(p, point.get(p) + a);
        }

        System.out.println(point.get(sc.next()));
    }
}