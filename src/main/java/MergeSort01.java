/*
 * написать функцию объединения массивов
 * входные массивы отсортированные
 * выходной массив тоже должен быть отсортирован
 */

import java.util.Arrays;

public class MergeSort01 {
    static int arr1[] = {1, 3, 4, 5};
    static int arr2[] = {2, 4, 6, 8};

    public static void main(String[] args) {
        int count = arr1.length + arr2.length;
        int arr3[] = new int[count];
        arr3 = mergeTwoSortedArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int tempArr[] = new int[arr1.length + arr2.length];
//        int result[] = new int[0];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < (arr1.length) && j < (arr2.length)) {
//            while (j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                tempArr[k] = arr1[i];
                k++;
                i++;
            } else if (arr2[j] < arr1[i]) {
                tempArr[k] = arr2[j];
                k++;
                j++;
            } else if (arr1[i] == arr2[j]) {
                tempArr[k] = arr1[i];
                k++;
                i++;
                tempArr[k] = arr2[j];
                k++;
                j++;
            }
            if (j == arr2.length) {
                while (i < arr1.length) {
                    tempArr[k] = arr1[i];
                    k++;
                    i++;
                }
            }
//            }
            if (i == arr1.length) {
                while (j < arr2.length) {
                    tempArr[k] = arr2[j];
                    k++;
                    j++;
                }
            }
        }
        return tempArr;
    }
}
