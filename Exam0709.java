package Exercise07_220329;

import java.util.GregorianCalendar;
import java.util.Random;

public class Exam0709 {

    public static void main(String[] args){

        //날짜 생성
        GregorianCalendar cal = new GregorianCalendar();
        int year = cal.get(GregorianCalendar.YEAR); // 연도를 리턴
        int month = cal.get(GregorianCalendar.MONTH); // 월을 리턴
        int date = cal.get(GregorianCalendar.DATE); // 일을 리턴

        //날짜 출력
        System.out.println("오늘은 " + year + "년 " + (month + 1) + "월 " + date + "일입니다.");

        //운세 배열 생성
        String[] todayLuck = {"대길", "길", "중길", "소길", "흉중"};

        //운세 랜덤 출력
        Random newRandom = new Random();
        int randomLuck = newRandom.nextInt((todayLuck.length - 1) + 1);
//        System.out.println(randomLuck);
        System.out.println("오늘의 운세는 " + todayLuck[randomLuck] + "입니다.");
    }
}
