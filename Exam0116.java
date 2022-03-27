////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam16 {
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("값을 입력하세요 : ");
//        double num = input.nextDouble();
//
//        if(num <= -10 || num >= 10){
//            System.out.println("OK!");
//        }else{
//            System.out.println("NG!");
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam16 {

    public static void question16(int num1){
        if(num1 <= -10 || num1 >= 10){
            System.out.println("OK");
        }
    }

    public static void main(String[] args) {
        question16(15);
    }
}