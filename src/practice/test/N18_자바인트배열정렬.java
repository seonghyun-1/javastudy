
package test;
// 오름차순 정렬 : Arrays.sort(arr);
// 내림차순 정렬 : Arrays.sort(IntegerArr,Collections.reverseOrder());

import java.util.Arrays;
import java.util.Collections;



public class N18_자바인트배열정렬 {
    public static void main(String[] args) {
        int[] arr1 = {2,1,4,6,3,7,82};
        int[] arr2 = {12,21,13,15,32,44};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        Integer[] nArr1 = new Integer[arr1.length];
        for(int i=0;i<arr1.length;i++){
            nArr1[i] = arr1[i];
        }
        Arrays.sort(nArr1,Collections.reverseOrder());


    }
}
