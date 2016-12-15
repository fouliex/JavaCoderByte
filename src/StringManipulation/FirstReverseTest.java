package StringManipulation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static StringManipulation.FirstReverse.FirstReverseWithStringBuilderLibrary;
import static StringManipulation.FirstReverse.FirstReverseByLetter;
import static org.junit.Assert.assertEquals;

/**
 * Created by George Fouche on 12/14/2016.
 */
@RunWith(Parameterized.class)
public class FirstReverseTest {

    private String word;
    private String reverseWord;


    public FirstReverseTest(String word, String reverseWord) {
        this.word = word;
        this.reverseWord = reverseWord;
    }

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new java.lang.Object[][]{{"George", "egroeG"}, {"ABCDEF", "FEDCBA"}, {"12345", "54321"}});
    }

    @Test
    public void testFirstStringReverse() {
        word = FirstReverseWithStringBuilderLibrary(word);
        assertEquals(reverseWord, word);
    }

    @Test
    public void testFirstStringReverseTwo() {
        word = FirstReverseByLetter(word);
        assertEquals(reverseWord, word);
    }

}