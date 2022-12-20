package test;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;

public class N16_큐를인트배열 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue);
        System.out.println(queue.getClass().getSimpleName());

        int[] arr = new int[queue.size()];
        LinkedList<Integer> list = (LinkedList) queue;
        for(int i=0;i<arr.length;i++){
            arr[i] = list.get(i);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.getClass().getSimpleName());
    }
}
