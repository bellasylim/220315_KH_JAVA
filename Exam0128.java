////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam28 {
//
//    public static void main(String[] args){
//
//        int arr[] = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("0 이상 9 이하 첫 번째 정수 값 a를 입력하세요. ");
//        int a = input.nextInt();
//
//        System.out.print("0 이상 9 이하 두 번째 정수 값 b를 입력하세요. ");
//        int b = input.nextInt();
//
//        int num = arr[a] * arr[b];
//
//        System.out.println(num);
//
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam28 {

    public static void question29(int num1, int num2){
        int[] arr= {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
        System.out.println(arr[num1] * arr[num2]);
    }

    public static void main(String[] args) {

        question29(1, 7);

    }
}