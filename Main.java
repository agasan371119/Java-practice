public class Main {
  public static void main(String[] args) {
    String[] enemy = {"勇者", "戦士", "武道家", "遊び人"};

    printArray(enemy);
    attack();
  }
  public static void printArray(String[] enemy) {
    for(int i = 0; i < enemy.length - 1; i++) {
      System.out.println(enemy[i] + "武器を構えた");
    }
    System.out.println(enemy[3] + "は遊んでいる");
  }

  public static void attack() {
    System.out.println("剣で攻撃");
    System.out.println("遊んでいる");
  }
}