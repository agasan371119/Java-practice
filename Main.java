import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //空のHashMap作成
        HashMap<String, Integer> point = new HashMap<>();

        //HashMapに格納
        for(int i = 0; i < n; i++) {
            String s = sc.next();
            point.put(s, 0);
        }

        int m = sc.nextInt();
        for(int i = 0; i < m; i++) {
            String t = sc.next();
            int l = sc.nextInt();

            point.put(t, point.get(t) + l);
        }
        String r = sc.next();
        System.out.println(point.get(r));
    }
}