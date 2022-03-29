////시도01
//package Exercise06_220328;
//
//import java.util.Arrays;
//
//public class Exam0609 {
//
//    public static void main(String[] args){
//        int[] arr = { 13 , 90 , 10 , 79 , 101 , 25 , 123 , 38 , 5 , 16 , 64 , 55 , 17 };
//        int[] arr2 = { 38 , 118 , 26 , 17 , 41 , 53 , 10 , 88 , 92 , 102 , 67 , 22 , 55 };
//        //common 메소드 호출
//        System.out.println("공통 숫자 개수: " + common(arr,arr2));
//    }
//
//    public static int common(int[] arr, int[] arr2) {
//        int result = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (Arrays.asList(arr).contains(arr2[i])) {
//                result++;
//            }
//        }
//        return result;
//    }
//}

//시도 02
package Exercise06_220328;

public class Exam0609 {

    public static void main(String[] args){
        int[] arr = { 13 , 90 , 10 , 79 , 101 , 25 , 123 , 38 , 5 , 16 , 64 , 55 , 17 };
        int[] arr2 = { 38 , 118 , 26 , 17 , 41 , 53 , 10 , 88 , 92 , 102 , 67 , 22 , 55 };
        //common 메소드 호출
        System.out.println("공통 숫자 개수: " + common(arr,arr2));
    }

    public static int common(int[] arr, int[] arr2) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr[i] == arr2[j]) {
                    result++;
                }
            }
        }
        return result;
    }
}
