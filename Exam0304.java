//시도01
package Exercise04_220322;

public class Exam0402 {

   public static void main(String[] args) {

       int arr[] = {5, 10, 24, 53, 65, 23, 32, 13, 1, 9};
       int sum = 0;


       for (int i = 0; i < arr.length; i++) {
               sum += arr[i];
               System.out.println(sum); //확인용
               int result = sum / arr.length;
               System.out.println("정수 10개의 평균은 " + result + "입니다.");
       }
   }
}


// //선생님 풀이
// package Exercise04_220322;

// import java.io.BufferedReader;
// import java.util.Scanner;

// public class Exam0402 {

//     public static void main(String[] args) {

//         //BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
//         Scanner sc = new Scanner(System.in);

//         int sum = 0;

//         for(int i = 0; i < 10; i++){
//             int value = sc.nextInt();
//             sum += value;
//         }
//         System.out.println("평균값 : " + (sum/10));
//     }
// }
