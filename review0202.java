package java_review02_220408;

import java.util.Scanner;

public class review0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수값을 입력하세요.");
        int num = sc.nextInt();

        while(true) {
            if(num > 5 && num < 20) {
                System.out.println("성공!");
                break;
            }

            if(!(num > 5 && num < 20)){
                System.out.print("다시 입력하세요.");
                num = sc.nextInt();
                continue;
            }
        }
    }
}
