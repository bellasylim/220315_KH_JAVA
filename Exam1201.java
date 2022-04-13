package review05_220413;

public class Exam1201 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int defaultNum = arr.length;

        for(int i = 0; i < arr.length; i++){
            arr[i] = defaultNum;
            defaultNum--;
            System.out.println("a[" + i + "] = " + arr[i]);
        }
    }
}
