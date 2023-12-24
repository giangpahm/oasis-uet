package Cau2;

import java.util.List;

public class BubbleSort implements SortingStrategy {

    /**
     * Pham Huong Giang - 22024572.
     */
    @Override
        public void sort(int[] arr) {
            int n = arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

}


