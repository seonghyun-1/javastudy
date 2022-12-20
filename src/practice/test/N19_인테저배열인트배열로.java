package test;

import java.util.Arrays;

public class N19_인테저배열인트배열로 {
    public static void main(String[] args) {
        Integer[] iArr = {1,2,3,4,5,6,7};
        int[] arr = new int[iArr.length];
        for(int i=0;i<arr.length;i++){
            arr[i] = iArr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass().getSimpleName());
    }
}
