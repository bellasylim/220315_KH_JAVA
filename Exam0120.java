////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam20 {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("정수를 입력해주세요. ");
//        int num = input.nextInt();
//        int sum = 0;
//
//        if (num > 0) {
//            for (int i = 1; i <= num; i++) {
//                sum += i;
////                System.out.println(sum);
//            }
//            System.out.println("1부터 " + num + " 까지의 합 : " + sum);
//        } else {
//            System.out.println(0);
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam20 {

    public static void question20(int num1){
        for(int i=1; i<num1; i++){
            System.out.println(i);
        }
        if(num1==0){
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        question20(5);

    }
}