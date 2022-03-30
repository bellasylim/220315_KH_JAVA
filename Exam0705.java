package Exercise07_220329;

public class Exam0705 {
    public static void main(String[] args){
        int n = 5;
        int zero = 0;

        //1 ~ n까지의 합
        for(int i = 1; i <= n; i++){
            zero += i;
        }
        System.out.println("1부터 n번 까지의 합을 구합니다. n의 값 : " + n);
        System.out.println("1부터 n까지의 합은 " + zero + "입니다.");
    }
}
