package Exercise07_220329;

import java.util.Scanner;

public class Exam0706 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //더하고 싶은 정수의 개수 초기화
        int cnt = 0;

        System.out.print("정수를 더합니다. \n몇 개를 더할까요? ");
        cnt = input.nextInt();

        //입력한 정수값을 넣기 위한 배열 초기화
        int numArray[] = new int[cnt];
        //배열의 총합 초기화
        int sumArray = 0;
        //배열의 요소수 초기화
        int size = 0;

        //정수 입력 반복 for문
        for(int i = 0; i < cnt; i++){
            System.out.print("정수: ");
            numArray[i] = input.nextInt();
            size++;
            sumArray += numArray[i];

            //배열의 총합이 1000이 넘으면 for문 종료
            if(sumArray > 1000){
                System.out.println("합계가 1000을 넘었습니다.\n 마지막 값은 무시합니다.");
                //마지막 입력값을 총합에서 뺌
                sumArray -= numArray[i];
                //마지막 입력값을 요소수에서 뺌
                size -= 1;
                break;
            }
        }
        System.out.println("합계: " + sumArray);
        System.out.println("평균: " + sumArray / size);
    }
}
