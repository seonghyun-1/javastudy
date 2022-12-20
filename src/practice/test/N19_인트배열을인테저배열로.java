package test;

import java.util.Arrays;
import java.util.Comparator;

public class N19_인트배열을인테저배열로 {
    public static void main(String[] args) {

        // 변경
        int[] arr1 = {2,1,4,6,3,7,82};

        Integer[] arr2 = new Integer[arr1.length];
        for(int i=0;i<arr1.length;i++){
            arr2[i] = arr1[i];
        }

        Arrays.sort(arr2, Comparator.reverseOrder());
        System.out.println(Arrays.toString(arr2));
    }
}
