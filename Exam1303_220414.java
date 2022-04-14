package review06_220414;

import java.util.Scanner;

public class Exam1303_220414 {
    public static void main(String[] args) {

        //입력받는 정수값 변수 설정
        int input = -1;

        //반복실행 관련 답 변수 설정
        int keepGoing = -1;

        do {

            System.out.println("[ 아스키코드 -> 해당 영문/숫자/기호 ]");

            //아스키코드 범위 내의 정수 입력 받기
            Scanner sc = new Scanner(System.in);
            System.out.print("아스키코드를 입력하세요. (범위 0 ~ 127) ");
            input = sc.nextInt();

            //해당 정수값의 아스키코드 출력
            System.out.println((char) input);

            //재실행 여부 확인
            System.out.print("한 번 더? (Yes : 1) ");
            keepGoing = sc.nextInt();

        }while(keepGoing == 1);
    }
}
