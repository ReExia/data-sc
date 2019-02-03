package com.data.sc.sort;

import java.util.Arrays;

/**
 * 申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列；
 *
 * 设定两个指针，最初位置分别为两个已经排序序列的起始位置；
 *
 * 比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置；
 *
 * 重复步骤 3 直到某一指针达到序列尾；
 *
 * 将另一序列剩下的所有元素直接复制到合并序列尾。
 */
public class MergeSort {


    public static int[]  mergeSort(int[] arr){

        if (arr.length < 2){
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return merge(mergeSort(left) , mergeSort(right));
    }

    private static int[] merge(int[] left, int[] right) {

        int[] result = new int[left.length + right.length];

        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        //从0开始填充数字
        while (resultIndex < left.length && resultIndex < right.length) {

            if (left[leftIndex] <= right[rightIndex]){
                result[resultIndex++] = left[leftIndex++];
            }else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        while (resultIndex < result.length){

            //如果左边有剩余填充左边剩下的
            if (leftIndex < left.length){
                result[resultIndex++] = left[leftIndex++];
            }
            //如果右边有填充右边剩下的
            if (rightIndex < right.length){
                result[resultIndex++] = right[rightIndex++];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = GenerateUtils.arr(5, 100);
        System.out.println(Arrays.toString(arr));
        int[] result = MergeSort.mergeSort(arr);
        System.out.println(Arrays.toString(result));
    }


}
