package java_review02_220408;

import java.util.Scanner;

public class review0204 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수값을 5회 입력하세요.");

        int[] nums = new int [5];
        int sum = 0;

        for(int i = 0; i < 5; i++){
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        System.out.println("모든 값의 합계: " + sum);

    }
}
