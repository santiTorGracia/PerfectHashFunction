import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HashTest {

    @Test
    public void testNoCollisions() {
        String value1 = Hash.calculate("key1");
        String value2 = Hash.calculate("key2");

        Assertions.assertNotEquals(value1, value2);
    }

    @Test
    public void testIsReversible() {
        String key = "key1";

        String value1 = Hash.calculate(key);
        String resultKey = Hash.calculate(value1);

        Assertions.assertEquals(key, resultKey);
    }

    @Test
    public void testSize() {
        String key = "key1";

        String value = Hash.calculate(key);

        Assertions.assertTrue(value.length() >= key.length());
    }
}
