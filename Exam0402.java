//선생님 풀이
package Exercise04_220323;

public class Exam0402 {

    public static void question02(int a, int b, int c){
        int d = b * b - 4 * a * c;
        if ( d > 0 ) {
            System.out.println("2개의 실수");
        } else if( d == 0) {
            System.out.println("중해");
        } else {
            System.out.println("허수해");
        }
    }

    public static void main(String[] args){

        question02(2, 6, 7);

    }

}
