package review06_220414;

import java.util.ArrayList;
import java.util.Random;

public class Exam1304_220414 {
    public static void main(String[] args) {
        //알파벳 A와 Z의 아스키코드 변수로 선언
        int Acode = 65;
        int Zcode = 90;

        //문자 길이 난수 변수 선언 및 초기화
        int randomNum1 = -1;
        //각 요소 번호 난수 변수 선언 및 초기화
        int randomNum2 = -1;

        //알파벳 삽입할 ArrayList 선언
        ArrayList<Character> charArray = new ArrayList<Character>();

        //영어 알파벳 대문자 A ~ Z의 아스키코드 숫자를 char로 형변환해 알파벳으로 ArrayList에 삽입
        for(int i = Acode; i <= Zcode; i++){
            char change = (char)i;
            charArray.add(change);
        }

//        //알파벳이 ArrayList에 삽입되었는지 확인
//        for(int i = 0; i <charArray.size(); i++){
//            System.out.println(charArray.get(i));
//        }
//
        //문자열 자릿수 난수로 생성(범위 0 ~ 10)
        Random random1 = new Random();
        randomNum1 = random1.nextInt(10);

//        //생성한 난수 확인
//        System.out.println(randomNum1);

        //생성한 난수만큼 ArrayList 요소 난수로 출력
        for(int i = 0; i < randomNum1; i++){
            Random random2 = new Random();
            randomNum2 = random2.nextInt(charArray.size());
            System.out.print(charArray.get(randomNum2));
        }
    }
}
