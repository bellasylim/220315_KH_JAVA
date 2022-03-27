////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam24 {
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("정수 값을 입력하세요. ");
//        int num = input.nextInt();
//
//        for(int i = 1; i <= num; i++){
//            if(i % 5 != 0){
//                System.out.print("*");
//            }
//            else{
//                System.out.print(" ");
//            }
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam24 {

    public static void question24(int num1){
        for(int i = 1; i < num1; i++){
            System.out.print("*");
            if(i % 5 == 0){
                System.out.print("\t"); //\t 쓰기!
            }
        }
    }

    public static void main(String[] args) {

        question24(20);

    }
}
