import java.util.*;


public class Main {
    public static void main(String[] args) {
        ArrayList <String> str = new ArrayList<>();

        str.add("勇者");
        str.add("戦士");
        str.add("魔法使い");
        str.add("僧侶");
        str.add("賢者");
        str.add("遊び人");
        str.add("武道家");
        
        for(int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}