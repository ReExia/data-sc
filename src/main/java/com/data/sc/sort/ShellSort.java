package com.data.sc.sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 最后一轮相当于做了一次插入排序
 */
public class ShellSort {

    public static void shellSort(int[] arr){

        //分组偏移量
        for (int k = arr.length / 2; k > 0; k = k / 2) {

            //分组比较
            for (int i = k; i < arr.length ; i++){

                //比较
                for (int j = i ; j >= k ; j = j - k){
                    if (arr[j-k] > arr[j]){
                        int temp = arr[j-k];
                        arr[j-k] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = GenerateUtils.arr(5, 100);
        System.out.println(Arrays.toString(arr));
        ShellSort.shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
