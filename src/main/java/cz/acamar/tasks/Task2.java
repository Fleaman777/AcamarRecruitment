package cz.acamar.tasks;

import java.util.Arrays;

public class Task2 {

    /**
     * Task 2. Squares of a sorted array.
     * <p>
     * Given an integer array sorted in non-decreasing order,
     * return an array of the squares of each number sorted in non-decreasing order.
     * <p>
     * Example input: [-4,-1,0,3,10]
     * Expected output: [0,1,9,16,100]
     * <p>
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     *
     * @param input - an integer array sorted in non-decreasing order
     * @return - an array of the squares of each number sorted in non-decreasing order
     */
    public int[] squaresOfSortedArray(int[] input) {
        int inputLength = input.length;
        if (inputLength == 0) {
            return input;
        }

        int[] sqArr = new int[inputLength];

        for (int i = 0; i < inputLength; i++) {
            sqArr[i] = (int) Math.pow(input[i], 2);
        }

        Arrays.sort(sqArr);
        return sqArr;
    }
}
