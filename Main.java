import java.util.*;


public class Main {
    public static void main(String[] args) {

        String[] n = {"1121", "0112", "0103", "1111"};

        Arrays.sort(n);

        for(int i = 0; i < 4; i++) {
            System.out.println(n[i]);
        }
    }
} 