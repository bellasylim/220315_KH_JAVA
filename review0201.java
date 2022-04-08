package java_review02_220408;

import java.util.Scanner;

public class review0201 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int keepDoing = 0;

        while(true) {
            System.out.println("첫 번째 정수값을 입력하세요.");
            int num1 = sc.nextInt();
            System.out.println("두 번째 정수값을 입력하세요.");
            int num2 = sc.nextInt();
            System.out.println("%d * %d = %d".formatted(num1, num2, num1 * num2));

            System.out.println("이어서 하려면 1번을 눌러주세요");
            keepDoing = sc.nextInt();

            if(!(keepDoing == 1)){
                break;
            }
        }
    }
}
