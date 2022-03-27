////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam29 {
//
//    public static void main(String[] args){
//
//        int arr[] = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("0 ~ 9 사이의 정수값을 입력하세요. ");
//        int num1 = input.nextInt();
//        int num2 = arr[num1];
//
//        System.out.println(num1 + " 자리 요소 값은 " + num2 + "입니다.");
//        System.out.println(num2 + " 자리 요소 값은 " + arr[num2] + "입니다.");
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam29 {

    public static void question30(int num1){

        int arr[] = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
        int num2;
        num2 = arr[num1];
        System.out.println(arr[num2]);

    }

    public static void main(String[] args) {

        question30(1);

    }
}
