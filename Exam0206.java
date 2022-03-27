//시도 03
package Exercise02_220319;

public class Exam0206 {

    static int choBigger(int a, int b){
        int result = 0;
        int c = (a + b) / 2;
        if(a > c){
            System.out.println(a + "이/가 더 큽니다.");
            result = a;
        }else if(b > c) {
            System.out.println(a + "이/가 더 큽니다.");
            result = b;
        }else{
            System.out.println("두 수가 같습니다.");
        }
        return result;
    }
    public static void main(String[] args){

        int a = 10;
        int b = 7;

        choBigger(a, b);
    }
}

// //시도 02
//package Exercise02_220319;
//
//public class Exam0206 {
//
//    static int choBigger(int a, int b){
//        int c = (a + b) / 2;
//        if(a > c){
//            System.out.println(a + "이/가 더 큽니다.");
//            return a;
//        }else if(a == b) {
//            System.out.println("두 수가 같습니다.");
//        }
//        System.out.println(b + "이/가 더 큽니다.");
//        return b;
//    }
//    public static void main(String[] args){
//
//        int a = 10;
//        int b = 7;
//
//        choBigger(a, b);
//    }
//}
