//시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam32 {
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("첫 번째 정수 a를 입력하세요. ");
//        int num1 = input.nextInt();
//
//        System.out.print("두 번째 정수 b를 입력하세요. ");
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//        int min = num1 - num2;
//        int mul = num1 * num2;
//        int div = num1 / num2;
//        int rem = num1 % num2;
//
//        System.out.println("==========================");
//
//        System.out.println(num1 + " + " + num2 + " = " + sum);
//        System.out.println(num1 + " - " + num2 + " = " + min);
//        System.out.println(num1 + " * " + num2 + " = " + mul);
//        System.out.println(num1 + " / " + num2 + " = " + div);
//        System.out.println(num1 + " % " + num2 + " = " + rem);
//    }
//}

//선생님 풀이
package Exercise01_220318;

import java.util.Scanner;

public class Exam32 {

    public static void question33(){
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자 입력 : ");
        int num2 = sc.nextInt();
        sc.close();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

    }

    public static void main(String[] args) {

        question33();

    }
}