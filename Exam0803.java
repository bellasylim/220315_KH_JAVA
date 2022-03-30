package Exercise08_220330;

public class Exam0803 {

    public static void med(int a, int b, int c){

        //정수 출력
        System.out.println("정수 a : " + a);
        System.out.println("정수 b : " + b);
        System.out.println("정수 c : " + c);

        //정수값 배열로 편입
        int[] array = { a, b, c};

        //배열 크기대로 정렬 for문 : 앞이 뒤보다 크면 둘이 서로 자리 바꾸기
        for(int i = 0; i < array.length - 1; i++){
            int beforeArray = array[i];
            if(array[i] > array[i+1]){
                array[i] = array[i+1];
                array[i+1] = beforeArray;
            }
        }

        //for문 이용해 정렬 제대로 됐는지 확인
//        for(int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }

        //두 번째 배열 출력
        System.out.println("중간값은 " + array[1] + "입니다.");
    }

    public static void main(String[] args){
        med(1,3,2);
    }

}
