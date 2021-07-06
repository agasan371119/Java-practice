import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int count = sc.nextInt();

    int[] num = new int[count];
    for(int i = 0; i < count.length; i++) {
      num [i]= sc.nextInt();
      System.out.println(" " + num[i] + " ");
      System.out.println(" bye" + " ");      
    }
  }
}