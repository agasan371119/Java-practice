import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextInt();
    double b = sc.nextInt();

    double c = a - b;
    double d = c / 3;
    double e = d + b;

    System.out.println(e);

  }
}