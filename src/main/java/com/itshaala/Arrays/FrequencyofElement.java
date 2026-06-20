package com.itshaala.Arrays;

public class FrequencyofElement {
    public static void main(String[] args) {
        int [] array = {1, 2, 2, 3, 1, 4, 2};

        boolean[] visited = new boolean[array.length];

        for (int i = 0; i < array.length ; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(count);

        }
    }
}
