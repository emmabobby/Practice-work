import org.junit.Assert;
import org.junit.Test;

public class ArraySorterTest {
    @Test
    public void testSortArray() {
        int[] arr = {2, 9, 3, 1, 6};
        int[] expected = {1, 2, 3, 6, 9};
        int[] result = ArraySorter.sortArray(arr);
        Assert.assertArrayEquals(expected, result);
    }
}