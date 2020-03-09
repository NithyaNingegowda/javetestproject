import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionSpiralOrderTest {

    private SolutionSpiralOrder solutionSpiralOrder = new SolutionSpiralOrder();

    @Test
    void spiralOrder() {
       List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {});

        Assertions.assertEquals(new ArrayList<Integer>(), actualResult);
    }

    @Test
    void spiralOrder_0() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{0}});

        Assertions.assertEquals(0, actualResult.get(0));
    }

    @Test
    void spiralOrder_1() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{0, 1}});

        Assertions.assertEquals(0, actualResult.get(0));
        Assertions.assertEquals(1, actualResult.get(1));
    }

    @Test
    void spiralOrder_2() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{0, 1, 2}});

        Assertions.assertEquals(0, actualResult.get(0));
        Assertions.assertEquals(1, actualResult.get(1));
        Assertions.assertEquals(2, actualResult.get(2));
    }

    @Test
    void spiralOrder_3() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{0, 1, 2, 3}});

        Assertions.assertEquals(0, actualResult.get(0));
        Assertions.assertEquals(1, actualResult.get(1));
        Assertions.assertEquals(2, actualResult.get(2));
        Assertions.assertEquals(3, actualResult.get(3));
    }

    @Test
    void spiralOrder_4() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{0}, {1}});

        Assertions.assertEquals(0, actualResult.get(0));
        Assertions.assertEquals(1, actualResult.get(1));
    }

    @Test
    void spiralOrder_5() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{0}, {1}, {2}});

        Assertions.assertEquals(0, actualResult.get(0));
        Assertions.assertEquals(1, actualResult.get(1));
        Assertions.assertEquals(2, actualResult.get(2));
    }

    @Test
    void spiralOrder_6() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{0}, {1}, {2}, {3}});

        Assertions.assertEquals(0, actualResult.get(0));
        Assertions.assertEquals(1, actualResult.get(1));
        Assertions.assertEquals(2, actualResult.get(2));
        Assertions.assertEquals(3, actualResult.get(3));
    }

    @Test
    void spiralOrder_7() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{0, 1}, {3, 2}});

        Assertions.assertEquals(0, actualResult.get(0));
        Assertions.assertEquals(1, actualResult.get(1));
        Assertions.assertEquals(2, actualResult.get(2));
        Assertions.assertEquals(3, actualResult.get(3));
    }

    @Test
    void spiralOrder_8() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{0, 1}, {5, 2}, {4, 3}});

        Assertions.assertEquals(0, actualResult.get(0));
        Assertions.assertEquals(1, actualResult.get(1));
        Assertions.assertEquals(2, actualResult.get(2));
        Assertions.assertEquals(3, actualResult.get(3));
        Assertions.assertEquals(4, actualResult.get(4));
        Assertions.assertEquals(5, actualResult.get(5));
    }

    @Test
    void spiralOrder_9() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{0, 1, 2}, {5, 4, 3}});

        Assertions.assertEquals(0, actualResult.get(0));
        Assertions.assertEquals(1, actualResult.get(1));
        Assertions.assertEquals(2, actualResult.get(2));
        Assertions.assertEquals(3, actualResult.get(3));
        Assertions.assertEquals(4, actualResult.get(4));
        Assertions.assertEquals(5, actualResult.get(5));
    }

    @Test
    void spiralOrder_10() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{1, 2, 3}, {8, 9, 4}, {7, 6, 5}});

        Assertions.assertEquals(1, actualResult.get(0));
        Assertions.assertEquals(2, actualResult.get(1));
        Assertions.assertEquals(3, actualResult.get(2));
        Assertions.assertEquals(4, actualResult.get(3));
        Assertions.assertEquals(5, actualResult.get(4));
        Assertions.assertEquals(6, actualResult.get(5));
        Assertions.assertEquals(7, actualResult.get(6));
        Assertions.assertEquals(8, actualResult.get(7));
        Assertions.assertEquals(9, actualResult.get(8));
    }

    @Test
    void spiralOrder_11() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{1, 2, 3, 4}, {10, 11, 12, 5}, {9, 8, 7, 6}});

        Assertions.assertEquals(1, actualResult.get(0));
        Assertions.assertEquals(2, actualResult.get(1));
        Assertions.assertEquals(3, actualResult.get(2));
        Assertions.assertEquals(4, actualResult.get(3));
        Assertions.assertEquals(5, actualResult.get(4));
        Assertions.assertEquals(6, actualResult.get(5));
        Assertions.assertEquals(7, actualResult.get(6));
        Assertions.assertEquals(8, actualResult.get(7));
        Assertions.assertEquals(9, actualResult.get(8));
        Assertions.assertEquals(10, actualResult.get(9));
        Assertions.assertEquals(11, actualResult.get(10));
        Assertions.assertEquals(12, actualResult.get(11));
    }

    @Test
    void spiralOrder_12() {
        List<Integer> actualResult = solutionSpiralOrder.spiralOrder(new int[][] {{1, 2, 3, 4}, {12, 13, 14, 5}, {11, 16, 15, 6}, {10, 9, 8, 7}});

        Assertions.assertEquals(1, actualResult.get(0));
        Assertions.assertEquals(2, actualResult.get(1));
        Assertions.assertEquals(3, actualResult.get(2));
        Assertions.assertEquals(4, actualResult.get(3));
        Assertions.assertEquals(5, actualResult.get(4));
        Assertions.assertEquals(6, actualResult.get(5));
        Assertions.assertEquals(7, actualResult.get(6));
        Assertions.assertEquals(8, actualResult.get(7));
        Assertions.assertEquals(9, actualResult.get(8));
        Assertions.assertEquals(10, actualResult.get(9));
        Assertions.assertEquals(11, actualResult.get(10));
        Assertions.assertEquals(12, actualResult.get(11));
        Assertions.assertEquals(13, actualResult.get(12));
        Assertions.assertEquals(14, actualResult.get(13));
        Assertions.assertEquals(15, actualResult.get(14));
        Assertions.assertEquals(16, actualResult.get(15));
    }
}