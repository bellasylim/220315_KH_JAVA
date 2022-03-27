////시도01
//package Exercise04_220323;
//
//public class Exam0403 {
//
//    static void calFee(int num){
//        int fee1000 = 0;
//        int fee100 = 0;
//
//        if(num % 1000 == 0){
//            fee1000 = num / 1000;
//            System.out.println("1000원 권으로 " + fee1000 + "장 지불하세요.");
//        }else{
//            fee100 = (num % 1000) / 100;
//            fee1000 = (num - fee100) / 1000;
//            System.out.println("1000원 권으로 " +  fee1000 + "장 지불하고, 100원 동전으로 " + fee100 + "개 지불하세요.");
//        }
//    }
//
//    public static void main(String[] args){
//
//        calFee(5100);
//    }
//}

package Exercise04_220323;

public class Exam0403 {

    public static void main(String[] args){

        question03(12400);

    }

    private static void question03(int money){
        int ball1 = money/1000;
        int ball2 = (money - (ball1*1000))/100;

        System.out.println("1000원 = " + ball1);
        System.out.println("100원 = " + ball2);

    }

}