package Exercise07_220329;

import java.util.Random;
import java.util.Scanner;

public class Exam0707 {
    public static void main(String[] args){

        //정답 입력 변수 설정
        String inputAnswer;
        //계속할 것인지 입력하는 변수 설정
        int yesOrNo;

        //문제 배열
        String[] dayQuiz = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        //답안 배열
        String[] dayAnswer = { "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

        //입력 받는 Scanner
        Scanner input = new Scanner(System.in);

        //do문 이용해 문제 제출
        do{
            System.out.println("요일명을 영어 소문자로 입력하시오. ");
            //랜덤 이용해서 배열 초기화
            Random random = new Random();
            int day = random.nextInt((7 - 1) + 1) + 1;
            //문제 제출 및 답안 입력 요청
            System.out.print(dayQuiz[day] + ": ");
            inputAnswer = input.next();

            if(inputAnswer.equals(dayAnswer[day])){
                System.out.print("정답입니다. 다시 한 번? 1 / 0 ");
                yesOrNo = input.nextInt();
            }else{
                System.out.print("틀렸습니다. 다시 한 번? 1 / 0 ");
                yesOrNo = input.nextInt();
            }
        }while(yesOrNo == 1);
    }
}
