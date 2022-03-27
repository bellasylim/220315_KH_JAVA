////시도 01
//package Exercise03_220321;
//
//public class Exam0302 {
//
//    public static void question02(int num){
//
//        int fee = 6000;
//
//        if(num >= 5 && num <= 20){
//            fee = 5500;
//            System.out.println(num + "명 입장료는 " + fee * num + "입니다.");
//        }else if(num >= 20){
//            fee = 5000;
//            System.out.println(num + "명 입장료는 " + fee * num + "입니다.");
//        }else{
//            System.out.println(num + "명 입장료는 " + fee * num + "입니다.");
//        }
//    }
//
//    public static void main(String[] args){
//
//        question02(5);
//        question02(20);
//        question02(3);
//
//    }
//}

//선생님 풀이
package Exercise03_220321;

public class Exam0302 {

    public static void question02(int h) {
        int n1 = 6000;
        int n2 = 5500;
        int n3 = 5000;
        int price = 0;

        if (h < 5){
            price = h*n1;
        }else if (h < 20){
            price = h*n2;
        }else{
            price = h*n3;
        }
        System.out.println("요금합계 : " + price + "원");
    }

    public static void main(String[] args){
        question02(30);
    }
}