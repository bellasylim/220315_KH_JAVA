////시도
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam23 {
//
//    public static void main(String[] args){
//
//        String star = "*";
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("정수 값을 입력하세요. ");
//        int num = input.nextInt();
//
//        System.out.println(star.repeat(num));
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam23 {

    public static void question23(int num1){
        for(int i = 0; i < num1; i++){
            System.out.print("*");
        }
    }

    public static void main(String[] args) {

        question23(8);

    }
}