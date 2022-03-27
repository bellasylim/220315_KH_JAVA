//시도01
//package Exercise01_220318;
//
//import java.util.Scanner;
//
//public class Exam25 {
//
//    public static void main(String[] args){
//
//        Scanner input = new Scanner(System.in);
//        System.out.print("1 이하 9 이하의 정수 값을 입력하세요. ");
//        int num = input.nextInt();
//
//        for(int i = 1; i <= 9; i++){
//
//            if(i != num){
//                System.out.println(i);
//            }
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam25 {

    public static void question25(int num1){
        for(int i = 1; i < 10; i++){
            if(!(i == num1)){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {

        question25(8);

    }
}
