import java.util.Scanner;
import java.util.Random;

public class touch {
  public static void main(String[] args) {
    //ランダム数
    int answer = new Random().nextInt(20) + 1;
    //正解するまでの合計
    int count = 0;
    

    //繰り返し正解になるまで
    while(true) {
      System.out.print("Your guess? ");
      int guess = new Scanner(System.in).nextInt();
      //count = count + 1;
      //count += 1;
      count++;
      
      //判定
      if(answer == guess) {
        System.out.println("Bingo! It took " + count + " gusses!!!!");
        break;
      } else if(answer > guess) {
        System.out.println("The answer is higher!!");
      } else {
        System.out.println("The answer is lower!!");
      }
    }
  }
}