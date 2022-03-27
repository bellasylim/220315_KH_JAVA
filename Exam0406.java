////배열 사용
//package Exercise04_220322;
//
//public class Exam0406 {
//
//    // 피보나치 수열 계산하는 메소드 작성
//    static void fiboNum(int num) {
//
//        //원하는 피보나치 항의 개수만큼 배열 생성
//        int arr[] = new int[num + 1];
//
//        //배열 0과 1자리 요소값 고정
//        arr[0] = 0;
//        arr[1] = 1;
//
//        if (num == 0) {
//            System.out.println(arr[num]);
//        } else if (num == 1) {
//            System.out.println(arr[num]);
//        } else {
//            for (int i = 2; i <= num; i++) {
//                arr[i] = arr[i - 2] + arr[i - 1];
//            }
//            System.out.println(arr[num]);
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        for(int i = 11; i <= 20; i++){
//            fiboNum(i);
//        }
//    }
//}

//시도 01 : 0과 1일 때 테스트 //0~47번째까지는 정상적으로 나오지만 48번부터 마이너스 값이 나옴...; -> 자료형 int랑 long 때문이었음
//package Exercise04_220322;
//
//public class Exam0406 {
//
//    // 피보나치 수열 계산하는 메소드 작성
//    static void fiboNum(int num) {
//
//        //원하는 피보나치 항의 개수만큼 배열 생성
//        int arr[] = new int[num + 2];
//
//        //배열 0과 1자리 요소값 고정
//        arr[0] = 0;
//        arr[1] = 1;
//
//        //if문일 때 활용해 0과 1 예외 작성해두고 나머지 피보나치 수열 공식 작성
//        if (num == 0) {
//            System.out.println(arr[num]);
//        } else if (num == 1) {
//            System.out.println(arr[num]);
//        } else {
//            for (int i = 2; i <= num; i++) {
//                arr[i] = arr[i - 1] + arr[i - 2];
//            }
//            System.out.println(arr[num]);
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//            for(int i = 1; i <= 50; i++){
//                fiboNum(i);
//            }
//    }
//}

//선생님 풀이
package Exercise04_220322;

public class Exam0406 {

    public static void main(String[] args){
        for(int n = 1; n<=20; n++){
            System.out.println(fibonacci(n) + " ");
        }
    }

    static int fibonacci(int n){
        if (n == 0) {
            return 0;
        }
        else if (n == 1){
            return 1;
        }else{
            return fibonacci(n - 2) + fibonacci(n - 1);
        }

    }

}