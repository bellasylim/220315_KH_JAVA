package Exercise08_220330;

public class Exam0805 {

    public static void main(String[] args){

        //배열 선언
        int[] a = {1, 3, 4, 7, 9, 11};

        //기존 배열 실행결과 도출
        System.out.println("요소수 : " + a.length);
        for(int i = 0; i < a.length; i++){
            System.out.println("x[" + i + "]:" + a[i]);
        }

        //기존 배열을 새로운 배열로 초기화(메소드 호출)
        a = arrayInsOf(a, 2, 99);

        //새로운 배열 실행결과 도출
        System.out.println("요소수 : " + a.length);
        for(int i = 0; i < a.length; i++){
            System.out.println("x[" + i + "]:" + a[i]);
        }

    }

    public static int[] arrayInsOf(int[] a, int idx, int x){

        //삽입한 인덱스 출력
        System.out.println("삽입할 인덱스 :" + idx);
        //삽입한 값 출력
        System.out.println("삽입할 값 : " + x);

        //기존 배열의 수 변수 설정
        int len = a.length;

        //기존 배열 복제해서 요소수 하나 증가
        int[] newa = new int[len + 1];

        //삽입한 인덱스 이전 기존 배열 요소수 복제
        for(int i = 0; i < idx; i++){
            newa[i] = a[i];
        }
        //삽입한 인덱스 이후 기존 배열 요소수 복제
        for(int i = idx; i < len; i++){
            newa[i+1] = a[i];
        }

        //새로운 배열에 원하는 요소수 삽입
        newa[idx] = x;

        //새로운 배열 리턴
        return newa;
    }
}
