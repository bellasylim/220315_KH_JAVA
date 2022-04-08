package java_review02_220408;

import java.util.Scanner;

public class review0203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수값을 입력하세요.");
        int num = sc.nextInt();

        if((num >= -10 && num < 0) || num >= 10){
            System.out.println("성공");
        }else{
            System.out.println("실패");
        }
    }
}
