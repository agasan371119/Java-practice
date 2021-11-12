import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = {"b", "a", "c", "d"};

        Arrays.sort(name);
        for(int i = 0; i < 4; i++) {
            System.out.println(name[i]);
        }

    }
}