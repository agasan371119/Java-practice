class Main {
  public static void main(String[] args) {
    
    int hit = (int)(Math.random() * 10 + 1);

    if(hit < 6) {
      System.out.println("モンスターは、" + hit + "のダメージを受けた");
    } else {
      System.out.println("モンスターにクリティカルヒットのダメージを与えた！！");
    }
    
    int crt = (int) (Math.random() * 2 + 1);

    if(crt == 1) {
      System.out.println("モンスターを倒した！！");
    } else {
      System.out.println("モンスターに返り討ちにされた 残念");
    }

  }
}