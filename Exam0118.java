////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam18 {
//
//    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.print("정수 값을 입력하세요. ");
//        int num = input.nextInt();
//
//        if(num < -10){
//            System.out.println("range 1");
//        }else if(num >= - 10 && num < 0){
//            System.out.println("range2");
//        }else if(num >=0){
//            System.out.println("range3");
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam18 {

    public static void question18(int num1) {
        if(num1 < -10){
            System.out.println("range1");
        }else if(num1 < 10){
            System.out.println("range2");
        }else{
            System.out.println("range3");
        }
    }

    public static void main(String[] args) {
        question18(-5);
    }
}