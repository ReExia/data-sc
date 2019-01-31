package com.data.sc.sort;

import java.util.Random;

public class GenerateUtils {

    public static int[] arr(int length, int maxValue){
        int[] arr = new int[length];
        Random random = new Random();
        for (int i = 0 ; i < arr.length ; i++){
            arr[i] = random.nextInt(maxValue);
        }
        return arr;
    }

}
