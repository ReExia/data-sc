package com.data.sc.sort;

import java.util.Arrays;

/**
 * 快速排序
 */
public class QuickSort {

    public static void quickSort(int[] arr, int leftIndex, int rightIndex){

        if (leftIndex >= rightIndex){
            return;
        }

        int flag = arr[leftIndex];
        int i = leftIndex;
        int j = rightIndex;

        while (i != j){
            //从右往左找,找一个比基准数小的
            while (arr[j] >= flag && i < j){
                j--;
            }
            //从左往右找,找一个比基准数大的
            while (arr[i] <= flag && i < j){
                i++;
            }

            if (i < j){
                flag = arr[i];
                arr[i] = arr[j];
                arr[j] = flag;
            }
        }

        //将基准数归位
        arr[leftIndex] = arr[i];
        arr[i] = flag;
        //继续处理左边
        quickSort(arr, leftIndex, i - 1);
        //继续处理右边
        quickSort(arr, i + 1, rightIndex);
    }


    public static void main(String[] args) {
        int[] arr = GenerateUtils.arr(5, 100);
        System.out.println(Arrays.toString(arr));
        QuickSort.quickSort(arr, 0 , arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
