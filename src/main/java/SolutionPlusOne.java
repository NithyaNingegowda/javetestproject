import java.util.Arrays;

class SolutionPlusOne {

    int[] plusOne(int[] digits) {

        int digitLength = digits.length;

        boolean boolReturnOldArray = true;

        for (int intArrLoopCount = digitLength - 1; intArrLoopCount >= 0; intArrLoopCount--) {
            int digitToAdd = digits[intArrLoopCount];

            if (digitToAdd < 9) {
                digits[intArrLoopCount] = digitToAdd + 1;
                break;
            } else {
                if (intArrLoopCount == 0) {
                    boolReturnOldArray = false;
                }
                digits[intArrLoopCount] = 0;
            }
        }

        if (boolReturnOldArray) {
            return digits;
        } else {
            int[] newArrayWithAdditionalDigit = Arrays.copyOf(digits, digitLength+1);
            newArrayWithAdditionalDigit[0] = 1;
            return newArrayWithAdditionalDigit;
        }
    }
}
