import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();

    int[] num = new int[count];
    for(int i = 0; i < count.length; i++) {
      num [i]= sc.nextInt();
      System.out.println(" " + num[i] + " " + " 終了!!");
      System.out.println(" think you" + " ");      
    }
  }
}