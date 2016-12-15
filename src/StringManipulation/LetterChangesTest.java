package StringManipulation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static StringManipulation.LetterChanges.*;
import static org.junit.Assert.assertEquals;

/**
 * Created by fouli on 12/14/2016.
 */
@RunWith(Parameterized.class)
public class LetterChangesTest {
    private String expected;
    private String actual;


    public LetterChangesTest(String actual, String expected) {
        this.actual = actual;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection<String[]> data() {
        return Arrays.asList(new String[][]{
                {"replace!*", "sfqmbdf!*"},
                {"coderbyte", "dpEfsczUf"},
                {"beautiful^", "cfbvUjgvm^"},
                {"oxford", "pygpsE"},
                {"123456789ae", "123456789bf"},
                {"this long cake@&", "UIjt mpOh dblf@&"},
                {"a confusing /:sentence:/[ this is not!!!!!!!~", "b dpOgvtjOh /:tfOUfOdf:/[ UIjt jt OpU!!!!!!!~"}
        });
    }

    @Test
    public void test() {
        actual = LetterChangesFirstWithDictionary(actual);
        assertEquals(expected, actual);
    }

    @Test
    public void test2(){
        actual = LetterChanges(actual);
        assertEquals(expected, actual);
    }
}
