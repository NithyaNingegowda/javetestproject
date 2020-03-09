import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionPlusOneTest {

    SolutionPlusOne solutionPlusOneTest = new SolutionPlusOne();

    @Test
    void plusOne_1() {
        int[] actualDigitArrayValue = solutionPlusOneTest.plusOne(new int[]{1});
        Assertions.assertEquals("[2]", Arrays.toString(actualDigitArrayValue));
    }

    @Test
    void plusOne_2() {
        int[] actualDigitArrayValue = solutionPlusOneTest.plusOne(new int[1]);
        Assertions.assertEquals("[1]", Arrays.toString(actualDigitArrayValue));
    }

    @Test
    void plusOne_3() {
        int[] actualDigitArrayValue = solutionPlusOneTest.plusOne(new int[2]);
        Assertions.assertEquals("[0, 1]", Arrays.toString(actualDigitArrayValue));
    }

    @Test
    void plusOne_4() {
        int[] actualDigitArrayValue = solutionPlusOneTest.plusOne(new int[]{1,2,3});
        Assertions.assertEquals("[1, 2, 4]", Arrays.toString(actualDigitArrayValue));
    }

    @Test
    void plusOne_5() {
        int[] actualDigitArrayValue = solutionPlusOneTest.plusOne(new int[]{4,3,2,1});
        Assertions.assertEquals("[4, 3, 2, 2]", Arrays.toString(actualDigitArrayValue));
    }

    @Test
    void plusOne_6() {
        int[] actualDigitArrayValue = solutionPlusOneTest.plusOne(new int[]{9});
        Assertions.assertEquals("[1, 0]", Arrays.toString(actualDigitArrayValue));
    }

    @Test
    void plusOne_7() {
        int[] actualDigitArrayValue = solutionPlusOneTest.plusOne(new int[]{9,9});
        Assertions.assertEquals("[1, 0, 0]", Arrays.toString(actualDigitArrayValue));
    }

    @Test
    void plusOne_8() {
        int[] actualDigitArrayValue = solutionPlusOneTest.plusOne(new int[]{8,9,9,9});
        Assertions.assertEquals("[9, 0, 0, 0]", Arrays.toString(actualDigitArrayValue));
    }
}