public class Main {
    public static void main(String[] args) {

        String[][] playerAll = {{"勇者", "戦士", "魔法使い"}, {"武道家", "僧侶", "賢者"}, {"商人", "盗賊", "遊び人"}};

        for(int i = 0; i < playerAll.length; i++) {
            for(int j = 0; j < playerAll[i].length; j++) {
                System.out.println(playerAll[i][j]);
            }
        } 
    }
}