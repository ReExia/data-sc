package com.data.sc.sort;

import java.util.Arrays;

public class SelectSort {

    public static void selectSort(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            int minIndex = i;
            //在(i,arr.length区间查找合适的值)
            for (int j = i ; j < arr.length; j++){
                if (arr[minIndex] > arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = GenerateUtils.arr(10, 100);
        System.out.println(Arrays.toString(arr));
        SelectSort.selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
