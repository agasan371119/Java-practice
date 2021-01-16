public class MainMethod {
  public static void main(String[] args) {
    monster();
    attack();
  }


  //モンスターの発生
  public static void monster() {
    String[] enemies = {"スライム", "ドラゴン", "魔王"};

    int rand = (int)(Math.random() * 3 + 0);

    System.out.println(enemies[rand] + "が、現れた!!");
    System.out.println("-------------------------");
  }

  //仲間の準備
  public static void person() {
    String[] parties = {"勇者", "戦士", "魔法使い", "武道家", "遊び人"};

    for(int i = 0; i < parties.length - 1; i++) {
      System.out.println(parties[i] + "は、身構えた!!");
    }
    System.out.println(parties[parties.length - 1] + "は、遊んでいる");
  }

  //攻撃コマンド
  public static void attack() {
    String[] selections = {"剣を振りかぶる", "呪文を唱える", "盾で守る"};
      person();

  }

  //攻撃効果
}
