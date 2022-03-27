////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam21 {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("정수를 입력해주세요. ");
//        int num = input.nextInt();
//        int fac = 1;
//
//        if (num > 0) {
//            for (int i = 1; i <= num; i++) {
//                fac *= i;
////                System.out.println(fac);
//            }
//            System.out.println(num + "의 계승 : " + fac);
//        } else {
//            System.out.println(1);
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam21 {

    public static void question21(int num1){
        for(int i=1; i<=10; i++){
            num1 = num1 * i;
        }
        if(num1 == 0){
            System.out.println(1);
        }else{
            System.out.println(num1);
        }
    }

    public static void main(String[] args) {

        question21(2);

    }
}