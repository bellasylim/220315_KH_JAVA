//시도 01_220320
package Exercise01_220318;

import java.util.Scanner;

public class Exam14 {

    public static void main(String[] args){

        Scanner num = new Scanner(System.in);
        System.out.print("첫 번째 정수 a를 입력하세요 : ");
        int num1 = num.nextInt();

        System.out.print("두 번째 정수 b를 입력하세요 : ");
        int num2 = num.nextInt();

        int num3 = num1 * num2;

        System.out.println("a * b = " + num3);
        System.out.println("(a * b) * 2 = " + num3 * 2);
    }
}

