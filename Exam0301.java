//시도01
//package Exercise03_220321;
//
//public class Exam0301 {
//
//    public static void question01(double meter){
//
//        double basic = 6100;
//        double add = (313 / 800) + 1;
//        System.out.println(add);
//
//       if(meter <= 1700){
//           System.out.println("요금 : " + basic + "원");
//       }else if(meter >= 1700){
//           System.out.println("요금 : " + basic + (add * (meter - 1700)) + "원");
//       }
//    }
//
//    public static void main(String[] args){
//
//        question01(2013);
//    }
//}

//선생님 풀이

package Exercise03_220321;

public class Exam0301 {

    public static void question01(double m) {
        int taxi = 6100;
        int price = 0;

        if(m < 1700){
            price = taxi;
        }else{
            double increase = m - 1700;
            double num = increase / 313;

            price = Double.valueOf(taxi + (Math.ceil(num) * 800)).intValue(); //잘 이해 안 감;;
        }
        System.out.println("택시요금 : " + price + "원");
    }

    public static void main(String[] args){

        question01(2450);

    }

}
