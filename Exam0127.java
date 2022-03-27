////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam27 {
//
//    public static void main(String[] args){
//
//        int arr[] = { 3, 7, 0, 8, 4, 1, 9, 6, 5, 2 };
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("0 이상 9 이하의 정수값을 입력하세요. ");
//        int num = input.nextInt();
//
//                System.out.println("요소 번호 " + num + "의 값은 " + arr[num] + "입니다.");
//            }
//        }

//선생님 풀이
package Exercise01_220318;

public class Exam27 {

    public static void question28(int num1){
        int[] arr = { 3, 7, 0, 8, 4, 1, 9, 6, 5, 2 };
        System.out.println((arr[num1]));
    }

    public static void main(String[] args){

        question28(3);

    }
}
