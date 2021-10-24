import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m = sc.nextInt();

    int[][] a = new int[3][m];
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < m; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(a[i][j]);
        if (j < m - 1) {
          System.out.print(" ");
        } else {
          System.out.println("");
        }
      }
    }
  }
}