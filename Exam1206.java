package review05_220413;

import java.util.Scanner;

public class Exam1206 {
    public static void main(String[] args) {
        //실수값 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("실수값 : ");
        double num = sc.nextDouble();
        double squareRoot = 0.0;
        double areaCircle = 0.0;

        //절대값
        if(num < 0){
            System.out.println("절대값 : " + (-num) );
        }else{
            System.out.println("절대값 : " + num);
        }

        //제곱근
        squareRoot = Math.sqrt(num);
        System.out.println("제곱근 : " + squareRoot);

        //절대값을 반지름으로 하는 원의 면적
        areaCircle = (squareRoot * squareRoot) * 3.14;
        System.out.println("면적 : " + areaCircle);
    }
}
