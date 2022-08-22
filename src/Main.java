import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char symb = text.charAt(i);

            if (Character.isLetter(symb)) {
                symb = Character.toLowerCase(symb);
                if (map.containsKey(symb)) {
                    int count = map.get(symb);
                    count++;
                    map.put(symb, count);
                } else {
                    map.put(symb, 1);
                }
            }
        }
        System.out.println(map);
        System.out.println(letterMaxCount(map));
        System.out.println(letterMinCount(map));

    }

    public static char letterMaxCount(Map<Character, Integer> map) {
        int max = -1;
        char letterMax = 0;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() > max) {
                max = kv.getValue();
                letterMax = kv.getKey();
            }
        }
        return letterMax;
    }

    public static char letterMinCount(Map<Character, Integer> map) {
        int min = Integer.MAX_VALUE;
        char letterMin = 0;
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() < min) {
                min = kv.getValue();
                letterMin = kv.getKey();
            }
        }
        return letterMin;
    }

}
