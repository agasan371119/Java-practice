import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
        list.add("e");
        list.add("g");
        list.add("z");
        list.add("A");
        list.add("B");
        list.add("1");
        list.add("3");
        list.add("5");
        list.add("10");
        list.add("z");
        list.add("あ");
        list.add("か");
        list.add("ぃ");
        list.add("お");
        list.add("13");
        list.add("16");

        Collections.sort(list);
        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}