package programmingmethod.array;

public class N5_array {
    public static void main(String[] args){
        int[] scores = { 1,2,3 };
//        int sum = 0;
//        for(int i=0;i<scores.length;i++){
//            sum = sum + scores[i];
//        }
//        System.out.println("sum:"+sum);
        System.out.println(add(scores));

        int[] scores2 = new int[5];
        scores2[0] = 1;
        System.out.println(scores2);
    }

    public static int add(int[] array){
        int sum = 0;
        for(int i=0;i< array.length;i++){
            sum = sum + array[i];
        }
        return sum;
    }

}
