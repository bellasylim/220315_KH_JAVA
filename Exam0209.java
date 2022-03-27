//선생님 풀이
package Exercise02_220319;

public class Exam0209 {

    public static boolean isPrimeNumber(int num){
        if(num <= 3)
            return true;

        for(int i = 2; i <=(num/2); i++)
            if((num % i) == 0)
                return false;

        return true;
    }

    public static void main(String[] args){
        for(int n=10000; n<10100; n++){
            if(isPrimeNumber(n))
                System.out.println(n + " ");
        }
    }

}
