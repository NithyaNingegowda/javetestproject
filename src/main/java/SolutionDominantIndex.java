class SolutionDominantIndex {
    int dominantIndex(int[] nums) {
        int intArrLength = nums.length;
        if (intArrLength < 2) {
            return 0;
        }

        int largestElement = nums[0];
        int largestElementIndex = 0;
        int secondLargestElement = 0;

        for (int intArrLoopCounter = 1; intArrLoopCounter < intArrLength; intArrLoopCounter++){
            if (largestElement < nums[intArrLoopCounter]) {
                secondLargestElement = largestElement;
                largestElement = nums[intArrLoopCounter];
                largestElementIndex = intArrLoopCounter;
            } else if (secondLargestElement < nums[intArrLoopCounter]) {
                secondLargestElement = nums[intArrLoopCounter];
            }
        }

        if (largestElement >= (secondLargestElement*2)){
            return largestElementIndex;
        }

        return -1;
    }
}
