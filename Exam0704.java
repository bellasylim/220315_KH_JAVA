package Exercise07_220329;

import java.util.Random;
import java.util.Scanner;

public class Exam0704 {
    public static void main(String[] args){
        int userNum = 0;

        Random random = new Random();

        System.out.println("숫자 맞추기 게임 시작!\n10부터 99까지 중의 숫자 하나를 맞추세요.");

        int num = random.nextInt((99 - 10) + 1) + 10;

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("어떤 숫자일까? " );
            userNum = input.nextInt();

            if(userNum > num){
                System.out.println("더 작은 숫자입니다.");
            }else if(userNum < num){
                System.out.println("더 큰 숫자입니다.");
            }
        }while(userNum != num);
        System.out.println("정답입니다.");
    }
}

////random 범위 확인하기 위한 프린트 실험
//package Exercise07_220329;
//
//import java.util.Random;
//
//public class Exam0704 {
//    public static void main(String[] args){
//
//        Random random = new Random();
//
//        for(int i = 0; i < 30; i++){
//            int num = random.nextInt((7 - 3) + 1) + 3;
//            System.out.println(num);
//        }
//    }
//}
