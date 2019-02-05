package com.data.sc.sort;

import java.util.Arrays;

public class BucketSort {

    public static void bucketSort(int[] arr, int[] bucket){

        for (int i = 0; i < arr.length ; i++){
            bucket[arr[i]]++;
        }

        int arrIndex = 0;
        for (int i = 0 ; i < bucket.length; i++){
            while (bucket[i] > 0){
                arr[arrIndex++] = i;
                bucket[i]--;
            }
        }

    }

    public static void main(String[] args) {
        int[] arr = GenerateUtils.arr(5, 100);
        System.out.println(Arrays.toString(arr));
        BucketSort.bucketSort(arr, new int[101]);
        System.out.println(Arrays.toString(arr));
    }

}
