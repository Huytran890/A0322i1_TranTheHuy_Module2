package ss11_stack_and_queue.bai_tap;

import java.util.HashMap;
import java.util.Map;

public class CountCharacterUsingMap {
    private static Map<String, Integer> listCharacter;

    static {
        listCharacter = new HashMap<>();
        listCharacter.put("a", 0);
        listCharacter.put("b", 0);
        listCharacter.put("c", 0);
        listCharacter.put("d", 0);
        listCharacter.put("e", 0);
        listCharacter.put("f", 0);
        listCharacter.put("g", 0);
        listCharacter.put("h", 0);
        listCharacter.put("i", 0);
        listCharacter.put("j", 0);
        listCharacter.put("k", 0);
        listCharacter.put("l", 0);
        listCharacter.put("m", 0);
        listCharacter.put("n", 0);
        listCharacter.put("o", 0);
        listCharacter.put("p", 0);
        listCharacter.put("q", 0);
        listCharacter.put("r", 0);
        listCharacter.put("s", 0);
        listCharacter.put("t", 0);
        listCharacter.put("u", 0);
        listCharacter.put("v", 0);
        listCharacter.put("w", 0);
        listCharacter.put("y", 0);
    }

    public static void countCharacter(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            String key = String.valueOf(str.charAt(i));
            listCharacter.put(key, listCharacter.get(key) + 1);
        }
    }

    public static void main(String[] args) {
        CountCharacterUsingMap.countCharacter("Toiyeuemomoivutru");
        for (Map.Entry<String, Integer> o : CountCharacterUsingMap.listCharacter.entrySet()) {
            System.out.print(o.getKey() + " - ");
            System.out.println(o.getValue());
        }
    }
}
