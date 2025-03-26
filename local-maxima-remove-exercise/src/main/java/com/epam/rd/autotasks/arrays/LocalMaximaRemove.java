package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static int[] removeLocalMaxima(int[] array) {
        int n = array.length;
        // Create a temporary result array of maximum possible size (n)
        int[] result = new int[n];
        int count = 0;

        // Iterate over each element and check if it is a local maximum
        for (int i = 0; i < n; i++) {
            boolean isLocalMax = false;

            if (i == 0) {
                // First element: compare with right neighbor
                if (array[0] > array[1]) {
                    isLocalMax = true;
                }
            } else if (i == n - 1) {
                // Last element: compare with left neighbor
                if (array[n - 1] > array[n - 2]) {
                    isLocalMax = true;
                }
            } else {
                // Middle element: compare with both left and right neighbors
                if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                    isLocalMax = true;
                }
            }

            // Only add element if it is not a local maximum
            if (!isLocalMax) {
                result[count++] = array[i];
            }
        }

        // Return a copy of the result array trimmed to the correct size
        return Arrays.copyOf(result, count);
    }

    public static void main(String[] args) {
        int[] input = {18, 1, 3, 6, 7, -5};
        // Expected output: [1, 3, 6, -5]
        System.out.println(Arrays.toString(removeLocalMaxima(input)));
    }
}
