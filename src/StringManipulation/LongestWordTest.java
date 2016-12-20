package StringManipulation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static StringManipulation.LongestWord.*;
import static org.junit.Assert.*;

/**
 * Created by George Fouche on 12/19/16.
 */
@RunWith(Parameterized.class)
public class LongestWordTest {
    private String sentence;
    private String word;

    public LongestWordTest(String sentence, String word) {
        this.sentence = sentence;
        this.word = word;
    }

    @Parameters
    public static Collection<String[]> data() {
        return Arrays.asList(new String[][]{{"I love dogs", "love"}, {"Comment ca vas", "Comment"}});
    }

    @Test
    public void test() {
        String actual = LongestWord(sentence);
        assertEquals(word, actual);
    }


}