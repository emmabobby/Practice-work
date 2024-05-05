import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTest {

    @Test
    public void testArrayShip() {
        int[] arr = {2, 9, 3, 1, 6};
        ArrayShip(arr);
        int[] expected = {1, 2, 3, 6, 9};
        Assertions.assertArrayEquals(expected, arr);
    }

    public static void ArrayShip(int[] arr) {
        
        // ...
    }
}