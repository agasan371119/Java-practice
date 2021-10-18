import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            String str = sc.next();
            int h = sc.nextInt();
            int m = sc.nextInt();
            
            int h2 = Integer.parseInt(str.substring(0, 2));
            int m2 = Integer.parseInt(str.substring(3, 5));
            
            h2 = h2 + h;
            m2 = m2 + m;
            
            if(m2 >= 60) {
                h2 += 1;
                m2 -= 60; 
            }
            
            if(h2 >= 24) {
                h2 -= 24;
            }
            
            String h3 = Integer.toString(h2);
            String m3 = Integer.toString(h2);
            
            if(h3.length() == 1) {
                h3 = "0" + h3;
            }

            if(m3.length() == 1) {
                m3 = "0" + m3;
            }
            
            System.out.println(h3 + ":" + m3);
        }
    }
}