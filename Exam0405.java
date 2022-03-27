//선생님 풀이
package Exercise04_220323;

public class Exam0405 {

    static void priFac(int num){
        System.out.print(num + " = ");

        for(int i = 2; i <= num; i++){
            if(num % i == 0){
                num /= i;
                if(num == i){
                    System.out.print(i);
                }else{
                    System.out.print(i + "x ");
                }
            }
        }
    }

    public static void main(String[] args){

        priFac(2000);

    }
}
