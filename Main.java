import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[4];

        for(int i = 0; i < 3; i++) {
          int[i] = sc.nextInt();
        }
        Arrays.sort(num);

        System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3]);
    }
}