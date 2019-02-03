package com.data.sc.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class InsertSort {

    public static void insertSort(int[] arr){
       for (int i = 1 ; i < arr.length; i++){

           //需要插入的数据
           int temp = arr[i];

           //比temp大的数都向后移动一位
           int j = i;
           while (j > 0 && temp < arr[j-1]){
               arr[j] = arr[j-1];
               j--;
           }

           if (i != j){
               arr[j] = temp;
           }

       }
    }

    public static void main(String[] args) {
        int[] arr = GenerateUtils.arr(5, 100);
        System.out.println(Arrays.toString(arr));
        InsertSort.insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
