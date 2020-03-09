import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoultionFindDiagonalOrderTest {

    SoultionFindDiagonalOrder soultionFindDiagonalOrder = new SoultionFindDiagonalOrder();

    @Test
    void findDiagonalOrder() {
        int[] actualResult = soultionFindDiagonalOrder.findDiagonalOrder(new int[][]{{1}});

        Assertions.assertEquals(1, actualResult[0]);
    }

    @Test
    void findDiagonalOrder_1() {
        int[] actualResult = soultionFindDiagonalOrder.findDiagonalOrder(new int[][]{{1},{2},{3}});

        Assertions.assertEquals(1, actualResult[0]);
        Assertions.assertEquals(2, actualResult[1]);
        Assertions.assertEquals(3, actualResult[2]);
    }

    @Test
    void findDiagonalOrder_2() {
        int[] actualResult = soultionFindDiagonalOrder.findDiagonalOrder(new int[][]{{1, 2, 3}});

        Assertions.assertEquals(1, actualResult[0]);
        Assertions.assertEquals(2, actualResult[1]);
        Assertions.assertEquals(3, actualResult[2]);
    }

    @Test
    void findDiagonalOrder_3() {
        int[] actualResult = soultionFindDiagonalOrder.findDiagonalOrder(new int[][]{{1, 2}, {3, 4}});

        Assertions.assertEquals(1, actualResult[0]);
        Assertions.assertEquals(2, actualResult[1]);
        Assertions.assertEquals(3, actualResult[2]);
        Assertions.assertEquals(4, actualResult[3]);
    }

    @Test
    void findDiagonalOrder_4() {
        int[] actualResult = soultionFindDiagonalOrder.findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}});

        Assertions.assertEquals(1, actualResult[0]);
        Assertions.assertEquals(2, actualResult[1]);
        Assertions.assertEquals(4, actualResult[2]);
        Assertions.assertEquals(5, actualResult[3]);
        Assertions.assertEquals(3, actualResult[4]);
        Assertions.assertEquals(6, actualResult[5]);
    }

    @Test
    void findDiagonalOrder_5() {
        int[] actualResult = soultionFindDiagonalOrder.findDiagonalOrder(new int[][]{{1, 2}, {3, 4}, {5, 6}});

        Assertions.assertEquals(1, actualResult[0]);
        Assertions.assertEquals(2, actualResult[1]);
        Assertions.assertEquals(3, actualResult[2]);
        Assertions.assertEquals(5, actualResult[3]);
        Assertions.assertEquals(4, actualResult[4]);
        Assertions.assertEquals(6, actualResult[5]);
    }

    @Test
    void findDiagonalOrder_6() {
        int[] actualResult = soultionFindDiagonalOrder.findDiagonalOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});

        Assertions.assertEquals(1, actualResult[0]);
        Assertions.assertEquals(2, actualResult[1]);
        Assertions.assertEquals(4, actualResult[2]);
        Assertions.assertEquals(7, actualResult[3]);
        Assertions.assertEquals(5, actualResult[4]);
        Assertions.assertEquals(3, actualResult[5]);
        Assertions.assertEquals(6, actualResult[6]);
        Assertions.assertEquals(8, actualResult[7]);
        Assertions.assertEquals(9, actualResult[8]);
    }

    @Test
    void findDiagonalOrder_7() {
        int[] actualResult = soultionFindDiagonalOrder.findDiagonalOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}});

        Assertions.assertEquals(1, actualResult[0]);
        Assertions.assertEquals(2, actualResult[1]);
        Assertions.assertEquals(5, actualResult[2]);
        Assertions.assertEquals(9, actualResult[3]);
        Assertions.assertEquals(6, actualResult[4]);
        Assertions.assertEquals(3, actualResult[5]);
        Assertions.assertEquals(4, actualResult[6]);
        Assertions.assertEquals(7, actualResult[7]);
        Assertions.assertEquals(10, actualResult[8]);
        Assertions.assertEquals(13, actualResult[9]);
        Assertions.assertEquals(14, actualResult[10]);
        Assertions.assertEquals(11, actualResult[11]);
        Assertions.assertEquals(8, actualResult[12]);
        Assertions.assertEquals(12, actualResult[13]);
        Assertions.assertEquals(15, actualResult[14]);
        Assertions.assertEquals(16, actualResult[15]);
    }

    @Test
    void findDiagonalOrder_8() {
        int[] actualResult = soultionFindDiagonalOrder.findDiagonalOrder(new int[][]{});

        Assertions.assertEquals(0, actualResult.length);
    }
}