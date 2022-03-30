package Exercise07_220329;

public class Exam0702 {

    public static void main(String[] args){
        int[] array = {53, 35, 42};

        System.out.println("정수 a : " + array[0]);
        System.out.println("정수 b : " + array[1]);
        System.out.println("정수 c : " + array[2]);

        System.out.println("a < b < c가 되도록 정렬 했습니다.");

        for (int i = 0; i < array.length - 1; i++){
                int change = array[i];
                if(array[i] > array[i+1]){
                    array[i] = array[i+1];
                    array[i+1] = change;
                }
            }
        System.out.println("정수 a : " + array[0]);
        System.out.println("정수 b : " + array[1]);
        System.out.println("정수 c : " + array[2]);
        }
    }