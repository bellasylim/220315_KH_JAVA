package review06_220414;

import java.util.Scanner;

public class Exam1305_220414 {
    public static void main(String[] args) {
        //문자열 입력 받기
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요.");
        String input = sc.nextLine();

        //입력 받은 String 타입 데이터를 Char로 변환해서 배열에 삽입
        char[] charArr = input.toCharArray();

        //배열 요소 거꾸로 출력
        for(int i = charArr.length - 1; i >= 0; i--){
            System.out.print(charArr[i]);
        }
    }
}
