public class MyApp {
  public static void main(String[] args) {
    int[] salse = {100, 200, 300};

    //通常for文
    for(int i = 0; i < salse.length; i++) {
      System.out.println(salse[i]);
    }

    System.out.println("---");

    //拡張for文
    for(int sale : salse) {
      System.out.println(sale);
    }

  } 
}