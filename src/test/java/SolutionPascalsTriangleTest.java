import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionPascalsTriangleTest {

    SolutionPascalsTriangle solutionPascalsTriangle = new SolutionPascalsTriangle();

    @Test
    void generate() {
        List<List<Integer>> actualResult = solutionPascalsTriangle.generate(0);

        Assertions.assertTrue(actualResult.isEmpty());
        Assertions.assertEquals(0, actualResult.size());
    }

    @Test
    void generate_1() {
        List<List<Integer>> actualResult = solutionPascalsTriangle.generate(1);

        Assertions.assertEquals(1, (int) actualResult.get(0).get(0));
        Assertions.assertEquals(1, actualResult.size());
        Assertions.assertEquals(1, actualResult.get(0).size());
    }

    @Test
    void generate_2() {
        List<List<Integer>> actualResult = solutionPascalsTriangle.generate(2);

        Assertions.assertEquals(1, (int) actualResult.get(0).get(0));
        Assertions.assertEquals(1, (int) actualResult.get(1).get(0));
        Assertions.assertEquals(1, (int) actualResult.get(1).get(1));
        Assertions.assertEquals(1, actualResult.get(0).size());
        Assertions.assertEquals(2, actualResult.get(1).size());
    }

    @Test
    void generate_3() {
        List<List<Integer>> actualResult = solutionPascalsTriangle.generate(3);

        Assertions.assertEquals(1, (int) actualResult.get(0).get(0));
        Assertions.assertEquals(1, (int) actualResult.get(1).get(0));
        Assertions.assertEquals(1, (int) actualResult.get(1).get(1));
        Assertions.assertEquals(1, (int) actualResult.get(2).get(0));
        Assertions.assertEquals(2, (int) actualResult.get(2).get(1));
        Assertions.assertEquals(1, (int) actualResult.get(2).get(2));
        Assertions.assertEquals(3, actualResult.size());
        Assertions.assertEquals(1, actualResult.get(0).size());
        Assertions.assertEquals(2, actualResult.get(1).size());
        Assertions.assertEquals(3, actualResult.get(2).size());
    }

    @Test
    void generate_4() {
        List<List<Integer>> actualResult = solutionPascalsTriangle.generate(4);

        Assertions.assertEquals(1, (int) actualResult.get(0).get(0));
        Assertions.assertEquals(1, (int) actualResult.get(1).get(0));
        Assertions.assertEquals(1, (int) actualResult.get(1).get(1));
        Assertions.assertEquals(1, (int) actualResult.get(2).get(0));
        Assertions.assertEquals(2, (int) actualResult.get(2).get(1));
        Assertions.assertEquals(1, (int) actualResult.get(2).get(2));
        Assertions.assertEquals(1, (int) actualResult.get(3).get(0));
        Assertions.assertEquals(3, (int) actualResult.get(3).get(1));
        Assertions.assertEquals(3, (int) actualResult.get(3).get(2));
        Assertions.assertEquals(1, (int) actualResult.get(3).get(3));
        Assertions.assertEquals(4, actualResult.size());
        Assertions.assertEquals(1, actualResult.get(0).size());
        Assertions.assertEquals(2, actualResult.get(1).size());
        Assertions.assertEquals(3, actualResult.get(2).size());
        Assertions.assertEquals(4, actualResult.get(3).size());
    }
}