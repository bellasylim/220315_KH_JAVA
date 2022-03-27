////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam34 {
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("정수 값을 입력하세요. ");
//        int num = input.nextInt();
//
//        if(num >= 0){
//            System.out.println(num + "의 절대값은 " + num + "입니다.");
//        }else if (num < 0){
//            int num1 = - num;
//            System.out.println(num + "의 절대값은 " + num1 + "입니다.");
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

import java.util.Scanner;

public class Exam34 {

    public static void question35(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.close();

        num = Math.abs(num);
        System.out.println(num);
    }

    public static void main(String[] args) {

        question35();

    }
}