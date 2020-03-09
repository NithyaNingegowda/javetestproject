import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionDominantIndexTest {

    private SolutionDominantIndex solutionDominantIndexTest = new SolutionDominantIndex();

    @Test
    void dominantIndex_Empty() {
        int actualReturnValue = solutionDominantIndexTest.dominantIndex(new int[]{});
        Assertions.assertEquals(-1, actualReturnValue);
    }

    @Test
    void dominantIndex_1() {
        int actualReturnValue = solutionDominantIndexTest.dominantIndex(new int[]{1});
        Assertions.assertEquals(0, actualReturnValue);
    }

    @Test
    void dominantIndex_2() {
        int actualReturnValue = solutionDominantIndexTest.dominantIndex(new int[]{1,2});
        Assertions.assertEquals(1, actualReturnValue);
    }

    @Test
    void dominantIndex_3() {
        int actualReturnValue = solutionDominantIndexTest.dominantIndex(new int[]{1,2,4});
        Assertions.assertEquals(2, actualReturnValue);
    }

    @Test
    void dominantIndex_4() {
        int actualReturnValue = solutionDominantIndexTest.dominantIndex(new int[]{1,2,3});
        Assertions.assertEquals(-1, actualReturnValue);
    }

    @Test
    void dominantIndex_5() {
        int actualReturnValue = solutionDominantIndexTest.dominantIndex(new int[]{0,0,3,2});
        Assertions.assertEquals(-1, actualReturnValue);
    }
}