package StringManipulation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Using the Java language, have the function LongestWord(sen) take the sen parameter being passed and return the largest word in the string. If there are two or more words that are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume sen will not be empty.
 * Created by George Fouche on 12/19/16.
 */
public class LongestWord {

    public static String LongestWord(String sen){
        String[] value = sen.split(" ");

        HashMap<Integer, String> dictionary = new HashMap<>();
        for(int i=0; i<value.length;i++){
            dictionary.put(value[i].length(),value[1]);
        }
        //Sort the key from biggest to smallest
        Map<Integer,String> treeMap = new TreeMap<>(dictionary);

       return treeMap.entrySet().iterator().next().getValue();
    }

    public static void main(String[] args) {


    }
}
