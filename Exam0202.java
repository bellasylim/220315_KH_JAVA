//// 시도 01
//package Exercise02_220319;
//
//import java.util.Scanner;
//
//public class Exam0202 {
//
//    public static void main(String[] args){
//
//        int arr[] = new int[10];
//        int size = arr.length;
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("정수 10개를 입력하세요. ");
//
//        for(int i = 0; i < size; i++){
//            arr[i] = input.nextInt();
//
//            if(arr[i] % 2 == 0){
//                System.out.println("짝수 : " + arr[i]);
//            }else{
//                System.out.println("홀수 : " + arr[i]);
//            }
//        }
//    }
//}

//시도02
package Exercise02_220319;

import java.util.Scanner;

public class Exam0202 {

    public static void main(String[] args) {

        int arr[] = new int[10];
        int size = arr.length;

        Scanner input = new Scanner(System.in);
        System.out.println("정수 10개를 입력하세요. ");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.print("짝수 : ");

        for(int j = 0; j < size; j++){
            if(arr[j] % 2 == 0){
                System.out.print(arr[j] + " ");
            }
        }

        System.out.println();
        System.out.print("홀수 : ");

        for(int k = 0; k < size; k++){
            if(arr[k] % 2 == 1){
                System.out.print(arr[k] + " ");
            }
        }
    }
}