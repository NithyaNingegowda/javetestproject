import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PivotArrayTest {

    PivotArray testObject = new PivotArray();

    @Test
    void pivotIndex_Found_1() {
        int returnValueOfPatArray = testObject.pivotIndex(new int[]{1, 7, 3, 6, 5, 6});
        Assertions.assertEquals(3, returnValueOfPatArray);
    }

    @Test
    void pivotIndex_NotFound_1() {
        int returnValueOfPatArray = testObject.pivotIndex(new int[]{1, 2, 3});
        Assertions.assertEquals(-1, returnValueOfPatArray);
    }
}