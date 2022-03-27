//시도 01
package Exercise01_220318;

import java.util.Scanner;

public class Exam22 {

    public static void main(String[] args) {

        int[] num = new int[6];
        int size = num.length; //배열 수를 바꿀 때 for 문의 반복 횟수도 저절로 바뀌도록 변수 활용
//        System.out.println(size);
        int sum = 0;

        for (int i = 1; i < size; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print(i + "번째 숫자를 입력해주세요. ");
            num[i] = input.nextInt();
        }

        for (int j = 1; j < size; j++){
            sum += num[j];
        }
        System.out.println("모든 숫자의 합 : " + sum);
    }
}

//시도 02
//package Excercise220318;
//
//import java.util.Scanner;
//
//public class Exam22 {
//
//    public static void main(String[] args) {
//
//        int[] num = new int[5];
//        int size = num.length; //배열 수를 바꿀 때 for 문의 반복 횟수도 저절로 바뀌도록 변수 활용
//        System.out.println(size);
//        int sum = 0;
//
//        for (int i = 1; i <= size; i++) {
//            Scanner input = new Scanner(System.in);
//            System.out.print(i + "번째 숫자를 입력해주세요. ");
//            num[i] = input.nextInt();
//        }
//
//        for (int j = 1; j <= size; j++){
//            sum += num[j];
//        }
//        System.out.println("모든 숫자의 합 : " + sum);
//    }
//}
