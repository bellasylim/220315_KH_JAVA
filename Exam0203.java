package Exercise02_220319;

import java.util.Scanner;

public class Exam0203 {

    public static void main(String[] args){

        int arr[][] = new int[10][10];

        for(int i = 1; i < 10; i++){
            for(int j = 1; j < 10; j++){
                arr[i][j] = i * j;
//                System.out.println(arr[i][j]); //배열값 확인용
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.print("첫 번째 정수값(범위 : 1~9)을 입력하세요. ");
        int num1 = input.nextInt();
        System.out.print("두 번째 정수값(범위 : 1~9)을 입력하세요. ");
        int num2 = input.nextInt();

        int answer = num1 * num2;

        System.out.println("둘을 곱하면 " + answer + "입니다.");


    }
}
