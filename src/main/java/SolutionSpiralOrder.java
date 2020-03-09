import java.util.ArrayList;
import java.util.List;

public class SolutionSpiralOrder {

    public List<Integer> spiralOrder(int[][] matrix){

        int matrixRowLength = matrix.length;

        List<Integer> resultListElement = new ArrayList<Integer>();

        if (matrixRowLength == 0)
            return resultListElement;

        int matrixColumnLength = matrix[0].length;

        int rowCount = 0, rowDepth = 1;

        int columnCount = -1, columnDepth = 0;

        boolean isReverse = false;

        for (int looprow = 0; looprow < matrixRowLength * matrixColumnLength; looprow++) {

            if (!isReverse && (columnCount + columnDepth + 1 <  matrixColumnLength)) {
                columnCount++;
            } else if (!isReverse && (rowCount + rowDepth < matrixRowLength)) {
                rowCount++;
            }

            if (isReverse && (columnCount - columnDepth >  0)) {
                columnCount--;
            } else if (isReverse && (rowCount - rowDepth > 0)) {
                rowCount--;
            }

            //Adding to list
            resultListElement.add(matrix[rowCount][columnCount]);

            if ((columnCount + columnDepth + 1 ==  matrixColumnLength) &&  (rowCount + rowDepth == matrixRowLength)) {
                isReverse = true;
            }

            if (isReverse && (columnCount - columnDepth ==  0) &&  (rowCount - rowDepth == 0)) {
                isReverse = false;
                columnDepth++;
                rowDepth++;
            }

        }

        return resultListElement;
    }
}
