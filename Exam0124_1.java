////시도01
//package Exercise01_220318;
//
//public class Exam24_1 {
//
//    public static void main(String[] args){
//
//        for(int i = 1; i <= 20; i++){
//
//            if(i % 5 != 0){
//                System.out.println(i);
//            }else{
//                System.out.println("-");
//            }
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam24_1 {

    public static void question25(int num1){
        for(int i = 1; i <= 20; i++){
            if(i % 5 == 0){
                System.out.println("bar");
            } else
                System.out.println(i);
        }
    }

    public static void main(String[] args) {

        question25(21);

    }
}