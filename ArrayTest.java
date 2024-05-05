import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayTest {

    @Test
    public void testThatArrangeArrayShipDescendingNumbersToAscendingNumbers() {
        int[] arr = {2, 9, 3, 1, 6};
        int[] actual = ArrayShip.lexus(arr);
        int[] expected = {1, 2, 3, 6, 9};
        assertArrayEquals(expected, actual);
    }

    public static void ArrayShip(int[] arr) {
        
       
    }
}