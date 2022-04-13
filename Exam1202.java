package review05_220413;

import java.util.Random;
import java.util.Scanner;

public class Exam1202 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("요소수를 입력하세요. ");
        num = sc.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < num; i++){
            arr[i] = random.nextInt(1,10);
            System.out.println("* ".repeat(arr[i]));
        }

        System.out.print("-".repeat(20) + "\n");

        for(int i = 0; i < num; i++){
            System.out.print(i % 10 + " ");
        }
    }
}
