package StringManipulation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by George Fouche on 12/19/16.
 */
public class LongestWordTest {

    @Test
    public void test() {
        String actual = LongestWord.LongestWord("I love dogs");
        assertEquals("love", actual);
    }

}