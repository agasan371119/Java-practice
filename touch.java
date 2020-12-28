import java.util.Scanner;
import java.util.Random;

public class touch {
  public static void main(String[] args) {
    int answer = new Random().nextInt(10) + 1;
    int count = 0;
    
    while(true) {
      System.out.print("Your guess? ");
      int guess = new Scanner(System.in).nextInt();
      count++;

      if(answer == guess) {
        System.out.println("Bingo! It took " + count + " gusses!");
        break;
      } else if(answer > guess) {
        System.out.println("The answer is higher!");
      } else {
        System.out.println("The answer is lower!");
      }
    }
  }
}