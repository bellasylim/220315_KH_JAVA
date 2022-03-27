////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam15 {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("정수 값을 입력하세요 : ");
//        int num = input.nextInt();
//
//        if(num > 5 && num < 20){
//            System.out.println("OK!");
//        }
//
//
//    }
//}

//선생님 풀이

package Exercise01_220318;

public class Exam15 {

    public static void question15(int num1){
        if(num1 > 5 && num1 < 20){
            System.out.println("OK");
        }
    }

    public static void main(String[] args) {
        question15(15);
    }
}