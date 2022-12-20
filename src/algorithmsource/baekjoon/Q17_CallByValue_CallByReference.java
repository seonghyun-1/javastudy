//package studyalgorithm;
//
//public class Q17_CallByValue_CallByReference {
//
//    public static void main(String[] args){
//
//    }
//
//    void test5(){
//        Int a = new Int(3);
//
//        this.f5(a);
//
//        System.out.println(a);
//    }
//
//    void f5(Int par){
//        par = new Int(7);
//    }
//
//}
//@Test
//    void q1() {
//            int x = 3;
//
//            int y = x;
//            y = 7;
//
//            System.out.println(x);  // ?
//            }
//
//@Test
//    void q2() {
//            int x = 3;
//
//            this.f2(x);
//
//            System.out.println(x); // ?
//            }
//
//            void f2(int parameter) {
//            parameter = 7;
//            }
//
//@Test
//    void q3(){
//            int[] x = new int[10];
//            x[0] = 3;
//            int[] y = new int[10];
//            y[0] = 5;
//
//            y = x;
//            y[0] = 7;
//
//            System.out.println(x[0]); // ?
//            }
//
//@Test
//    void q4(){
//            int[][] x = new int[10][10];
//
//            x[0][0] = 1;
//            x[0][1] = 2;
//            x[0][2] = 3;
//
//            for (int i=0;i<3;i++){
//        System.out.print(x[0][i]+ ", ");
//        }
//        System.out.println();
//
//        // y에 복사하려 합니다.
//        int[][] y = new int[10][10];
//
//        y[0] = x[0];
//
//        y[0][1] = 7;
//
//        System.out.println(x[0][1]); //?
//
//        }
//
//@Test
//public class Int {
//    private int value;
//
//    public Int(int value) {
//        this.value = value;
//    }
//}
