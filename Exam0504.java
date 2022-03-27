////시도01 : 하나의 클래스로만...
//package Exercise05_220325;
//
//public class Exam0504 {
//
//    public static void main(String[] args) {
//        //요리사 객체 생성
//        Chef chef = new Chef();
//        //재료 객체 생성
////        Egg egg = new Egg();
////        Rice rice = new Rice();
////        Milk milk = new Milk();
////        Cheese cheese = new Cheese();
//        //요리사가 풀코스 요리함
//        System.out.println("1품목: " + chef.cook("egg", "cheese"));
//        System.out.println("2품목: " + chef.cook("rice", "egg"));
//        System.out.println("3품목: " + chef.cook("rice", "cheese"));
//        System.out.println("4품목: " + chef.cook("milk", "egg"));
//    }
//}
////    class Egg{}
////    class Rice{}
////    class Milk{}
////    class Cheese{}
//    class Chef {
//        public String cook(String ing1, String ing2) {
//            String dish = null;
//            if (ing1.equals("egg") && ing2.equals("cheese")) {
//                dish = "스크램블드에그";
//            }else if(ing1.equals("rice") && ing2.equals("egg")){
//                dish = "오므라이스";
//            }else if(ing1.equals("rice") && ing2.equals("cheese")){
//                dish = "리조또";
//            }else if(ing1.equals("milk") && ing2.equals("egg")){
//                dish = "푸딩";
//            }
//            return dish;
//        }
//    }


//선생님 풀이
package Exercise05_220325;

public class Exam0504 {

    public static void main(String[] args) {
        //요리사 객체 생성
        Chef chef = new Chef();
        //재료 객체 생성
        Egg egg = new Egg();
        Rice rice = new Rice();
        Milk milk = new Milk();
        Cheese cheese = new Cheese();
        //요리사가 풀코스 요리함
        System.out.println("1품목: " + chef.cook(egg, cheese));
        System.out.println("2품목: " + chef.cook(rice, egg));
        System.out.println("3품목: " + chef.cook(rice, cheese));
        System.out.println("4품목: " + chef.cook(milk, egg));
    }
}
    class Egg{}
    class Rice{}
    class Milk{}
    class Cheese{}
    class Chef {
        public String cook(Egg egg, Cheese cheese) {
            return "스크램블드에그";
        }

        public String cook(Rice rice, Egg egg){
            return "오므라이스";
        }

        public String cook(Rice rice, Cheese cheese){
            return "오므라이스";
        }

        public String cook(Milk milk, Egg egg){
            return "푸딩";
        }
}

