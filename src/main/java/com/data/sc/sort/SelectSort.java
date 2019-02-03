package com.data.sc.sort;

import java.util.Arrays;

/**
 * 选择排序
 * 每次找出待排序数列中最小或者(最大的数字)
 */
public class SelectSort {

    public static void selectSort(int[] arr){

        //有arr.length个数字,需要找arr.length -1 次
        for (int i = 0 ; i < arr.length - 1; i++){
            int minIndex = i;

            for (int j = i + 1 ; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            //找到最小值,放入位置
            if (i != minIndex){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = GenerateUtils.arr(5, 100);
        System.out.println(Arrays.toString(arr));
        SelectSort.selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
