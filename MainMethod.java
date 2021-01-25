public class MainMethod {
  public static void main(String[] args) {
    String[] enemy = {"スライム", "ドラゴン", "魔王"};
    String[] party = {"勇者", "戦士", "魔法使い", "武道家", "遊び人"};
    String[] attackCommand = {"攻撃", "魔法", "道具", "逃げる"};
    monster(enemy);
    person(party);
    attack(attackCommand);
  }


  //モンスターの発生
  public static void monster(String[] enemies) {

    int rand = (int)(Math.random() * 3 + 0);

    System.out.println(enemies[rand] + "が、現れた!!");
    System.out.println("攻撃準備をしている");
    System.out.println("-------------------------");
  }

  //仲間の準備
  public static void person(String[] parties) {

    for(int i = 0; i < parties.length - 1; i++) {
      System.out.println(parties[i] + "は、身構えた!!");
    }
    int rand = (int)(Math.random() * 2 + 1);

    if(rand == 1) {
      System.out.println(parties[parties.length - 1] + "は、遊んでいる!!");
    } else {
      System.out.println(parties[parties.length - 1] + "は、踊っている!!");
    }
  }

  //攻撃コマンド
  public static void attack(String[] command) {
    for(String com : command) {
      System.out.println(com + "を選択してください。");
    }
  }

  //攻撃効果
}
