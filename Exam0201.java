package Exercise02_220319;

import java.util.Scanner;

public class Exam0201 {

    public static void main(String[] args){

        int arr[] = new int[10];
        int size = arr.length;

        Scanner input = new Scanner(System.in);
        System.out.println("정수 10개를 입력하세요. ");

        for(int i = 0; i < size; i++){
         arr[i] = input.nextInt();
//            System.out.print(arr[i]); //확인용
        }

        for(int j = size -1 ; j >= 0; j--){
            System.out.print(arr[j]);
        }
    }
}
