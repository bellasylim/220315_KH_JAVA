////시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam33 {
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("정수 값을 입력하세요. ");
//        int num = input.nextInt();
//
//        if(num == 0){
//            System.out.println("zero");
//        }else{
//            System.out.println("not zero");
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

import java.util.Scanner;

public class Exam33 {

    public static void question34(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int num = sc.nextInt();
        sc.close();
        if(num == 0){
            System.out.println("zero");
        }else{
            System.out.println("not zero");
        }
    }

    public static void main(String[] args) {

        question34();

    }
}
