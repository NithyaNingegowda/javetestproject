import java.util.ArrayList;
import java.util.List;

public class SolutionPascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

         if (numRows > 0) {
             for (int rowNumber = 0; rowNumber < numRows; rowNumber++) {
                 List<Integer> rowCurrentList = new ArrayList<Integer>();
                 List<Integer> rowPreviousList = new ArrayList<Integer>();

                 if (rowNumber > 1) {
                     rowPreviousList = triangle.get(rowNumber - 1);
                 }

                 for (int rowElement = 0; rowElement <= rowNumber; rowElement++){
                     if (rowElement == 0 || rowElement == rowNumber) {
                         rowCurrentList.add(1);
                     } else {
                         rowCurrentList.add(rowPreviousList.get(rowElement - 1) + rowPreviousList.get(rowElement));
                     }
                 }

                 triangle.add(rowCurrentList);
             }
         }

        return triangle;

    }
}
