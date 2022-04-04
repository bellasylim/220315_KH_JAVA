package Exercise09_220401;

import java.util.Scanner;
import java.util.*;

public class ArrayListBasicPractice {
    public static void main(String[] args) {
        //영숫자 단어 저장용 변수 선언 및 ArrayList 객체 생성
        ArrayList<String> number = new ArrayList<String>();
        //영숫자 단어 저장
        number.add( "zero" );
        number.add( "one" );
        number.add( "two" );
        number.add( "three" );
        number.add( "four" );
        number.add( "five" );
        number.add( "six" );
        number.add( "seven" );
        number.add( "eight" );
        number.add( "nine" );
        number.add( "ten" );

        //영어 단어 입력
        System.out.println ( "0에서 10까지의 영문 단어를 입력하십시오" );
        Scanner input = new Scanner(System.in);

        //사용자 입력값 변수 설정
        String answer = input.nextLine();

            if (number.contains(answer)) {
                System.out.println(answer + "은 숫자의 " + number.indexOf(answer));
            }

            if(!(number.contains(answer))) {
                System.out.println(answer + "은 범위 내의 단어로 존재하지 않습니다.");
            }
            }
        }
