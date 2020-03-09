class SoultionFindDiagonalOrder {
    int[] findDiagonalOrder(int[][] matrix) {

        int numMatrixRow = matrix.length;

        if (numMatrixRow==0){
            return new int[]{};
        }


        int numMatrixColumn = matrix[0].length;

        int[] result = new int[numMatrixColumn * numMatrixRow];

        boolean reverse = true;

        int resultPosition = 0;

        int[] reverseArray;

        if (numMatrixColumn > numMatrixRow) {
            reverseArray = new int[numMatrixColumn];
        } else {
            reverseArray = new int[numMatrixRow];
        }


        for (int rowLoop=0; rowLoop<numMatrixRow; rowLoop++){
            int rowPosition = rowLoop;

            int reverseLength = 0;
            reverse = !(reverse);

            for (int columnLoop=0; columnLoop<=rowLoop && columnLoop<numMatrixColumn; columnLoop++){
                if (reverse) {
                    reverseArray[reverseLength] = matrix[rowPosition][columnLoop];
                    reverseLength++;
                } else {
                    result[resultPosition] = matrix[rowPosition][columnLoop];
                    resultPosition++;
                }
                rowPosition--;
            }

            resultPosition = getResultReversed(result, reverse, resultPosition, reverseArray, reverseLength);
        }

        for (int columnLoop=1; columnLoop<numMatrixColumn; columnLoop++){
            int columnPosition = columnLoop;
            int reverseLength = 0;

            reverse = !(reverse);
            for (int rowLoop=numMatrixRow-1; rowLoop>=0 && columnPosition<numMatrixColumn; rowLoop--){
                if (reverse) {
                    reverseArray[reverseLength] = matrix[rowLoop][columnPosition];
                    reverseLength++;
                } else {
                    result[resultPosition] = matrix[rowLoop][columnPosition];
                    resultPosition++;
                }
                columnPosition++;
            }

            resultPosition = getResultReversed(result, reverse, resultPosition, reverseArray, reverseLength);
        }

        return result;
    }

    private int getResultReversed(int[] result, boolean reverse, int resultPosition, int[] reverseArray, int reverseLength) {
        if (reverse) {
            while (reverseLength > 0) {
                reverseLength--;
                result[resultPosition] = reverseArray[reverseLength];
                resultPosition++;
            }
        }
        return resultPosition;
    }
}
