//////package Exercise07_220329;
//////
//////import java.util.Random;
//////
//////public class Exam0708 {
//////
//////    public int expTest() {
//////
//////        Random randomNum = new Random();
//////        int x = randomNum.nextInt();
//////        int y = randomNum.nextInt();
//////        int z = randomNum.nextInt();
//////        int exp1 = x + y + z;
//////        int exp2 = x + y - z;
//////        int exp3 = x - y + z;
//////        int exp4 = x - y - z;
//////        int quizAnswer = 0;
//////
//////        int[] expArray = { exp1, exp2, exp3, exp4 };
//////        int expRandom = new Random().nextInt(expArray.length);
//////
//////    }
//////
//////
//////    public static void main(String[] args){
//////
//////
//////
//////
//////
//////    }
//////}
////
////
//package Exercise07_220329;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Exam0708 {
//
//    public static void main(String[] args){
//
//        Random randomNum = new Random();
//        Scanner inputAnswer = new Scanner(System.in);
//        Scanner inputChance = new Scanner(System.in);
//
//        int x = randomNum.nextInt((1000 - 1) + 1) + 1;
//        int y = randomNum.nextInt((1000 - 1) + 1) + 1;
//        int z = randomNum.nextInt((1000 - 1) + 1) + 1;
//
////        System.out.println(x);
////        System.out.println(y);
////        System.out.println(z);
//
//        int exp1 = x + y + z;
//        int exp2 = x + y - z;
//        int exp3 = x - y + z;
//        int exp4 = x - y - z;
//
////        System.out.println(exp1);
////        System.out.println(exp2);
////        System.out.println(exp3);
////        System.out.println(exp4);
//
//        int quizAnswer = 0;
//
//        int[] expArray = { exp1, exp2, exp3, exp4 };
//        int expRandom = 0;
////        new Random().nextInt(expArray.length);
//
////        System.out.println(expArray[expRandom]);
//
//        if(expRandom == 0){
//            System.out.print(x + " + " + y + " + " + z + " = ");
////            inputAnswer.nextInt();
//
//            int answer = inputAnswer.nextInt();
//
//            do {
//                if(exp1 == answer) {System.out.println("정답입니다.")}
//            }
//
////            if(exp1 == answer) {
////                System.out.println("정답입니다.");
////            }else{
////                System.out.println("틀렸습니다. 다시 한 번 : 1");
////                int chance = inputChance.nextInt();
////                if(chance == 1){
////            }
//                }
//            }
//        }
////    }
////}

//정답일 경우 프로세스 종료
package Exercise07_220329;

import java.util.Random;
import java.util.Scanner;

public class Exam0708 {

    public static void main(String[] args) {

        //정답 입력 변수 설정
        int inputAnswer;
        //계속할 것인지 입력하는 변수 설정
        int yesOrNo;

        //랜덤 정수 네 개 생성(범위 1~1000)
        Random randomNum = new Random();
        int x = randomNum.nextInt((1000 - 1) + 1) + 1;
        int y = randomNum.nextInt((1000 - 1) + 1) + 1;
        int z = randomNum.nextInt((1000 - 1) + 1) + 1;

        //답 네 개 변수 생성
        int answer1 = x + y + z;
        int answer2 = x + y - z;
        int answer3 = x - y + z;
        int answer4 = x - y - z;

        //식 네 개 변수 배열 요소수로 삽입
        int[] answerArray = { answer1, answer2, answer3, answer4 };

        //문제 네 개 변수 생성
        String quiz1 = x + " + " + y + " + " + z + " = ";
        String quiz2 = x + " + " + y + " - " + z + " = ";
        String quiz3 = x + " - " + y + " + " + z + " = ";
        String quiz4 = x + " - " + y + " - " + z + " = ";

        //문제 네 개 변수 배열 요소수로 삽입
        String[] quizArray = { quiz1, quiz2, quiz3, quiz4 };

        //입력 받는 Scanner
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("암산하기");
            //배열 요소 번호에 삽입할 랜덤 숫자 생성
            Random newRandom = new Random();
            int arrayNum = newRandom.nextInt(answerArray.length);
            //문제 제출
            System.out.print(quizArray[arrayNum]);
            //답 입력
            inputAnswer = input.nextInt();

            if (inputAnswer == answerArray[arrayNum]) {
                System.out.print("정답입니다.");
                break;
            } else {
                System.out.print("틀렸습니다. 다시 한 번? 1 / 0 ");
                yesOrNo = input.nextInt();
            }
        }while(yesOrNo == 1);
    }
}

////문제 정답 맞추면 새로운 문제 내는 건 어떻게 하는지 모르겠음...
//package Exercise07_220329;
//
//import java.util.Random;
//import java.util.Scanner;
//
//public class Exam0708 {
//
//    public static void main(String[] args) {
//
//        //정답 입력 변수 설정
//        int inputAnswer;
//        //계속할 것인지 입력하는 변수 설정
//        int yesOrNo = 0;
//
//        //랜덤 정수 네 개 생성(범위 1~1000)
//        Random randomNum = new Random();
//        int x = randomNum.nextInt((1000 - 1) + 1) + 1;
//        int y = randomNum.nextInt((1000 - 1) + 1) + 1;
//        int z = randomNum.nextInt((1000 - 1) + 1) + 1;
//
//        //답 네 개 변수 생성
//        int answer1 = x + y + z;
//        int answer2 = x + y - z;
//        int answer3 = x - y + z;
//        int answer4 = x - y - z;
//
//        //식 네 개 변수 배열 요소수로 삽입
//        int[] answerArray = { answer1, answer2, answer3, answer4 };
//
//        //문제 네 개 변수 생성
//        String quiz1 = x + " + " + y + " + " + z + " = ";
//        String quiz2 = x + " + " + y + " - " + z + " = ";
//        String quiz3 = x + " - " + y + " + " + z + " = ";
//        String quiz4 = x + " - " + y + " - " + z + " = ";
//
//        //문제 네 개 변수 배열 요소수로 삽입
//        String[] quizArray = { quiz1, quiz2, quiz3, quiz4 };
//
//        //입력 받는 Scanner
//        Scanner input = new Scanner(System.in);
//
//        do {
//            System.out.println("암산하기");
//            //배열 요소 번호에 삽입할 랜덤 숫자 생성
//            Random newRandom = new Random();
//            int arrayNum = newRandom.nextInt(answerArray.length);
//            //문제 제출
//            System.out.print(quizArray[arrayNum]);
//            //답 입력
//            inputAnswer = input.nextInt();
//
//            if (inputAnswer == answerArray[arrayNum]) {
//                System.out.print("정답입니다.다시 한 번? 1 / 0 ");
//                yesOrNo = input.nextInt();
//
//                Random randomNum1 = new Random();
//                x = randomNum.nextInt((1000 - 1) + 1) + 1;
//                y = randomNum.nextInt((1000 - 1) + 1) + 1;
//                z = randomNum.nextInt((1000 - 1) + 1) + 1;
//
//            } else {
//                System.out.print("틀렸습니다. 다시 한 번? 1 / 0 ");
//                yesOrNo = input.nextInt();
//            }
//        }while(yesOrNo == 1);
//    }
//}