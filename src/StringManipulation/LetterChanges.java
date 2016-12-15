package StringManipulation;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 *
 * Created by fouli on 12/14/2016.
 */
public class LetterChanges {
    public static HashMap<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put(" ", " ");
        dictionary.put("a", "b");
        dictionary.put("b", "c");
        dictionary.put("c", "d");
        dictionary.put("d", "E");
        dictionary.put("e", "f");
        dictionary.put("f", "g");
        dictionary.put("g", "h");
        dictionary.put("h", "I");
        dictionary.put("i", "g");
        dictionary.put("j", "k");
        dictionary.put("k", "l");
        dictionary.put("l", "m");
        dictionary.put("m", "n");
        dictionary.put("n", "O");
        dictionary.put("o", "p");
        dictionary.put("p", "q");
        dictionary.put("q", "r");
        dictionary.put("r", "s");
        dictionary.put("s", "t");
        dictionary.put("t", "U");
        dictionary.put("u", "v");
        dictionary.put("v", "w");
        dictionary.put("w", "x");
        dictionary.put("x", "Y");
        dictionary.put("y", "Z");
        dictionary.put("z", "A");

    }

    public static String LetterChangesFirst(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            sb.append(dictionary.get(String.valueOf(str.charAt(i))));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(LetterChanges.LetterChangesFirst("a"));
    }
}
