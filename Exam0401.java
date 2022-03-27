//시도01 : 메소드 활용
package Exercise04_220323;

public class Exam0401 {

    static void evenOrOdd(int num){
        if(num % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args){
        evenOrOdd(3);
    }
}


