package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Input array cannot be null or empty.");
        }

        int maxValue = values[0]; // Initialize with the first element

        for (int i = 1; i < values.length; i++) {
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }

        return maxValue;
    }

    public static void main(String[] args ){
        int[] vals = new int[]{ -2, 0, 10, 5 };
        int result = MaxMethod.max(vals);
        System.out.println(result == 10);
    }
}
