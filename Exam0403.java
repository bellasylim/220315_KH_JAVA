//시도 01
//package Exercise04_220322;
//
//public class Exam0403 {
//
//    public static void main(String[] args){
//
//        int arr[] = {5, 10, 24, 53, 65, 23, 32, 13, 1, 9};
//
//        for(int i = 0; i < arr.length; i++){
//            int result = arr[i] * 2;
//            System.out.println(result);
//        }
//    }
//}

//선생님 풀이
package Exercise04_220322;

import java.util.Scanner;

public class Exam0403 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int values[] = new int[10];

        for(int i = 0; i < 10; i++){
            values[i] = sc.nextInt();
        }
        System.out.println();

//        for(int i = 0; i < 10; i++){
//            System.out.println(values[i] * 2);
//        }

        // 확장된 for문 : 배열 등 돌릴 때 초기값, 개수 사용할 필요없이
        for(int n: values){
            System.out.println(n * 2);
        }

    }
}