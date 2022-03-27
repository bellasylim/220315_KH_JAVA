//시도01
package Exercise01_220318;

public class Exam31 {

    public static void main(String[] args){

        int arr[] = {3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
        int size = arr.length - 1;

        for(int i = 0; i < size; i++) {
            int j = i+1;
            int answer = arr[i] - arr[j];
//            System.out.println(answer);
            System.out.println("(요소 번호 " + i + "의 값 " + arr[i] + ") - " + "(요소 번호 " + j + "의 값 "  + arr[j] + ") = " + answer);
        }
    }
}

////선생님 풀이
//package Exercise01_220318;
//
//public class Exam31 {
//
//    public static void question32(){
//
//        int[] arr = new int[]{3, 7, 0, 8, 4, 1, 9, 6, 5, 2};
//
//        for(int index = 0; index < 9; index++){
//            int currentValue = arr[index];
//            int nextIndex = index + 1;
//            int nextValue = arr[nextIndex];
//            System.out.println(currentValue - nextValue);
//        }
//    }
//
//    public static void main(String[] args) {
//
//        question32();
//    }
//}
