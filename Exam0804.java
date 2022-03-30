package Exercise08_220330;

public class Exam0804 {

    public static void main(String[] args){

        System.out.println("생성한 난수는 " + random(10, 99));

    }

    public static int random(int a, int b){

        //범위 a ~ b 사이의 난수 생성
        int num = (int)(Math.random()*(b - a) + a);

        System.out.println("난수를 생성합니다.");
        System.out.println("하한값: " + a);
        System.out.println("상한값: " + b);

        return num;
    }

}
