////시도01
//package Exercise04_220323;
//
//public class Exam0404 {
//
//    static void leapYear(int year) {
//
//        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//            System.out.println(year + "년은 윤년입니다.");
//        }else{
//            System.out.println(year + "년은 평년입니다.");
//        }
//    }
//
//    public static void main(String[] args){
//
//        leapYear(1988);
//        leapYear(1992);
//        leapYear(2000);
//        leapYear(2400);
//        leapYear(2100);
//        leapYear(2200);
//    }
//}

//선생님 풀이
package Exercise04_220323;

public class Exam0404 {

    private static void question04(int year){
        boolean check = false;

        if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            check = true;
        }else{
            check = false;
        }
        System.out.println(check? "운년입니다" : "운년이 아닙니다.");
    }

    public static void main(String[] args) {
        question04(1988);
    }

}