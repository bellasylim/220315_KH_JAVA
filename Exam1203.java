package review05_220413;

import java.util.Scanner;

public class Exam1203 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num; // 요소수 변수 선언
        double sum = 0.0; //배열 요소 총합 변수 선언

        //요소수 입력
        System.out.print("요소수 : ");
        num = sc.nextInt();

        //입력한 요소수에 따른 배열 선언 및 초기화
        double[] arr = new double[num];

        //double 타입으로 요소값 입력 받기
        for(int i = 0; i < num; i++){
            System.out.print("a[" + i + "] = ");
            arr[i] = sc.nextDouble();
        }

        //배열 요소 총합 구하기
        for(int i = 0; i < num; i++){
            sum += arr[i];
        }

        System.out.println("모든 요소의 합 : " + sum);
        System.out.println("모든 요소의 평균 : " + sum / num);

    }
}
