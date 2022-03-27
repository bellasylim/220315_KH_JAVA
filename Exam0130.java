////시도01
//package Exercise01_220318;
//
//public class Exam30 {
//
//    public static void main(String[] args){
//
//        int arr[] = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
//        int size = arr.length;
//        System.out.println(size);
//
//        for(int i = 0; i <= size - 1; i++){
//            System.out.println(i + "자리 요소 값은 " + arr[i] + "입니다.");
//        }
//    }
//}

//선생님 풀이
package Exercise01_220318;

public class Exam30 {

    public static void question31(){

        int[] arr = new int[]{3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
        int index = 0;

        for (int i=0; i<10; i++){
            index = arr[index];
            System.out.println(index);
        }
    }

    public static void main(String[] args) {

        question31();

    }
}