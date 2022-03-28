package Exercise06_220328;

public class Exam0608 {
    public static void main(String[] args){
        int a = 18;
        int b = 6;
        // calc 메소드 호출
        System.out.println("덧셈 :" + calc(a, b , 0));
        System.out.println("뺄셈 :" + calc(a, b , 1));
        System.out.println("곱셈 :" + calc(a, b , 2));
        System.out.println("나눗셈 :" + calc(a, b , 3));
    }

    public static int calc(int num1, int num2, int num3){
        int result = switch (num3) {
            case 0 -> num1 + num2;
            case 1 -> num1 - num2;
            case 2 -> num1 * num2;
            case 3 -> num1 / num2;
            default -> 0;
        };
        return result;
    }
}
