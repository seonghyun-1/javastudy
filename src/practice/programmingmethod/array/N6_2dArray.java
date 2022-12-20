package programmingmethod.array;

public class N6_2dArray {
    public static void main(String[] args){
        int [][]scores = { {95, 80},{18, 90}};
        for(int[] arr:scores){
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    }
}
