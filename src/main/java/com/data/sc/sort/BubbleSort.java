package com.data.sc.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 * 每次归位一个数
 */
public class BubbleSort {

    /**
     * 冒泡
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        //执行排序 arr.length - 1 趟
        for (int i = 1 ; i < arr.length; i++) {
            for (int j = 0 ; j < arr.length - i ; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /**
     * 冒泡优化
     * @param arr
     */
    public static void bubbleSort2(int[] arr){
        for (int i = 1; i < arr.length - 1; i++) {
            //设定标记,若此次循环没有进行交换,待排序序列已经有序,排序完成
            boolean flag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                flag = false;
            }
            if (flag){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = GenerateUtils.arr(10, 100);
        System.out.println(Arrays.toString(arr));
        BubbleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
