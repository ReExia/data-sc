package com.data.sc.sort;

import java.util.Arrays;

/**
 * 堆排序
 * 创建一个堆 H[0……n-1]；
 *
 * 把堆首（最大值）和堆尾互换；
 *
 * 把堆的尺寸缩小 1，并调用 shift_down(0)，目的是把新的数组顶端数据调整到相应位置；
 *
 * 重复步骤 2，直到堆的尺寸为 1。
 */
public class HeapSort {

    public static void heapSort(int[] arr){

        //1.构建大顶堆
        for(int i= arr.length/2 - 1 ; i>= 0 ;i--){
            //从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(arr, i, arr.length);
        }
        //2.调整堆结构+交换堆顶元素与末尾元素
        for(int j= arr.length - 1 ; j>0 ;j--){
            //将堆顶元素与末尾元素进行交换
            swap(arr,0, j);
            //重新对堆进行调整
            adjustHeap(arr,0, j);
        }
    }

    /**
     *
     * @param arr
     * @param i
     * @param length
     */
    public static void adjustHeap(int []arr,int i,int length){
        //先取出当前元素i
        int temp = arr[i];
        //从i结点的左子结点开始，也就是2i+1处开始
        for(int k= 2 * i + 1; k < length ; k = 2 * k + 1){
            //如果左子结点小于右子结点，k指向右子结点
            if( k + 1 <length && arr[k] < arr[k+1]){
                k++;
            }
            //如果子节点大于父节点，将子节点值赋给父节点（不用进行交换）
            if(arr[k] > temp){
                arr[i] = arr[k];
                i = k;
            }else{
                break;
            }
        }
        //将temp值放到最终的位置
        arr[i] = temp;
    }

    /**
     * 交换元素
     * @param arr
     * @param a
     * @param b
     */
    public static void swap(int []arr,int a ,int b){
        int temp=arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    public static void main(String[] args) {
        int[] arr = GenerateUtils.arr(5, 100);
        System.out.println(Arrays.toString(arr));
        HeapSort.heapSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
