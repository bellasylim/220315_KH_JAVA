//// for 문을 활용한 제곱 코드 이해하기 위해 코드 짜봄
//package Exercise02_220319;
//
//public class Exam0205 {
//
//    public static void main(String[] args) {
//
//        int a = 2;
//        int b = 3;
//        int result = 1; //이 부분은 생각도 못함 그래도 이 부분 빼고는 구현했다.
//
//        for(int i = 1; i <= b; i++){
//            result = result * a; //이 부분도.. 너무 신기하다
//            System.out.println(a + "의 " + i + "승 : " + result);
//        }
//        System.out.println(result);
//    }
//}

// for 문 활용, 항상 1인 변수를 만들어서 그곳에 계속 2제곱, 3제곱, 4제곱 값을 대입하여 반복해 곱한다.
package Exercise02_220319;

public class Exam0205 {

    static int squ(int a, int b, int c){
        c = 1;
        for(int i = 1; i <= b; i++) {
            c *= a;
        }
        return c;
    }

    public static void main(String[] args){

        int a = 5;
        int b = 3;
        int c = 1;

        int result = squ(a, b, c);

        System.out.println(a + "의 " + b + "제곱은 " + result + "이다.");
    }
}

// Math 클래스 활용 -> 진행 중

//package Exercise02_220319;
//
//public class Exam0205 {
//
//    static int squ(int a, int b){
//        int result = (int) Math.pow(a, b);
//        return result;
//    }
//
//    public static void main(String[] args){
//
//    }
//}