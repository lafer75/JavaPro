package sixteenhomework;

import java.util.Arrays;

public class Main {
    public static void number(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 200) - 100);
        }

    }

    public static void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    public static void quickSort(int array[], int start, int end) {
        if (start < end) {
            int partitionIndex = partition(array, start, end);

            quickSort(array, start, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, end);
        }
    }

    private static int partition(int[] array, int start, int end) {
        int a = array[end];
        int i = (start - 1);

        for (int j = start; j < end; j++) {
            if (array[j] <= a) {
                i++;

                int swapTemp = array[i];
                array[i] = array[j];
                array[j] = swapTemp;
            }
        }

        int swap = array[i + 1];
        array[i + 1] = array[end];
        array[end] = swap;

        return i + 1;
    }

    // або можна використати бульбашкою
    public static void bubbleSort(int [] array){
        for (int i=0;i<-array.length;++i){
            for(int j=0;j<array.length-i-1; ++j){
                if(array[j+1]<array[j]){
                    int swap = array[j];
                    array[j] = array[j+1];
                    array[j+1] = swap;

                }
            }
        }
    }


    public static void shakerSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            for (int i = right; i > left; i--) {
                if (array[i - 1] > array[i]) {
                    swap(array, i - 1, i);
                }
            }
            left++;
            for (int i = left; i < right; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
            right--;

        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = new int[1000000];
        number(array);
        long startTime = System.currentTimeMillis();
        sort(array);
        long finishTime = System.currentTimeMillis();
        System.out.println("Quick sort " + (finishTime-startTime)+"ms");
        long startTime1 = System.currentTimeMillis();
        bubbleSort(array);
        long finishTime1 = System.currentTimeMillis();
        System.out.println("Bubble sort " + (finishTime1-startTime1)+"ms");
        //У мене знадобилося 432 секунди щoб Shaker був готовий
        long startTime2 = System.currentTimeMillis();
        shakerSort(array);
        long finishTime2 = System.currentTimeMillis();
        System.out.println("Shaker sort " + (finishTime2-startTime2)+"ms");


    }

}
