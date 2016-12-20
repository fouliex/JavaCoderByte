package StringManipulation;

import java.util.*;

/**
 * Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. If there are two or more words that are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty.
 * Created by George Fouche on 12/19/16.
 */
public class LongestWord {

    public static String LongestWord(String sen) {

        String longestWord = "";
        String[] value = sen.split(" ");
        for (String word : value) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

}
