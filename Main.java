import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            //13:00 時刻
            String statr = sc.next();
            //1時間
            int h = sc.nextInt();
            //30分
            int m = sc.nextInt();
            
            //時刻(文字列)を数値に変換
            int startH = Integer.parseInt(start.substring(0, 2));
            int startm = Integer.parseInt(start.substring(3, 5));
            
            int ah = startH + h;
            int am = startM + m;

            if(am >= 60) {
                ah += 1;
                am -= 60;
            }

            if(ah > 24) {
                ah -= 24;
            }

            String endH = Integer.toString(ah);
            String endM = Integer.toString(am);

            if(endH.length() == 1) {
                endH = "0" + endH;
            }

            if(endM.length() == 1) {
                endM = "0" + endM;
            }
            System.out.println(endH + ":" + endM);

        }
    }
}