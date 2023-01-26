import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

interface StringChecker { boolean checkString(String s); }


public class ListTest {
    @Test
    public void testFilter() {
        List<String> input1 = new ArrayList<>();
        input1.add("");
        assertArrayEquals(new String[]{""}, ListExamples.filter(input1, ""));
    }
}
