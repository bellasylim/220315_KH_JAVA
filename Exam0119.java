////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam19 {
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("정수 값을 입력하세요. ");
//        int num = input.nextInt();
//
//        switch (num){
//            case 1:
//                System.out.println("one");
////                break;
//            case 2:
//                System.out.println("two");
////                break;
//            case 3:
//                System.out.println("three");
////                break;
//            default:
//                System.out.println("others");
////                break;
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam19 {

    public static void question19(int num1){

        switch (num1){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("others");
        }
    }

    public static void main(String[] args) {
        question19(2);
    }
}